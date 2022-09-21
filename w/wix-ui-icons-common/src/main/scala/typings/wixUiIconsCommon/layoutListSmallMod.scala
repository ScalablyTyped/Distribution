package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutListSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayoutListSmall", JSImport.Default)
  @js.native
  val default: FC[LayoutListSmallProps] = js.native
  
  trait LayoutListSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LayoutListSmallProps {
    
    inline def apply(): LayoutListSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutListSmallProps]
    }
    
    extension [Self <: LayoutListSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LayoutListSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutListSmallMod.foo` */
  override def _to: FC[LayoutListSmallProps] = default
}
