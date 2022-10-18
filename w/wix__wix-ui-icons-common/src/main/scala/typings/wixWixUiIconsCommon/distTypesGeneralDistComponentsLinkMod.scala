package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsLinkMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Link", JSImport.Default)
  @js.native
  val default: FC[LinkProps] = js.native
  
  trait LinkProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LinkProps {
    
    inline def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsLinkMod.foo` */
  override def _to: FC[LinkProps] = default
}
