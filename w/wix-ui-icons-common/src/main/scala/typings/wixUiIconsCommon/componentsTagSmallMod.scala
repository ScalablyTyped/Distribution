package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTagSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/TagSmall", JSImport.Default)
  @js.native
  val default: FC[TagSmallProps] = js.native
  
  trait TagSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TagSmallProps {
    
    inline def apply(): TagSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagSmallProps]
    }
    
    extension [Self <: TagSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TagSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsTagSmallMod.foo` */
  override def _to: FC[TagSmallProps] = default
}
