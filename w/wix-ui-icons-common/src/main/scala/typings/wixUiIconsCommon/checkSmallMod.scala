package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/CheckSmall", JSImport.Default)
  @js.native
  val default: FC[CheckSmallProps] = js.native
  
  trait CheckSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CheckSmallProps {
    
    inline def apply(): CheckSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckSmallProps]
    }
    
    extension [Self <: CheckSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CheckSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkSmallMod.foo` */
  override def _to: FC[CheckSmallProps] = default
}
