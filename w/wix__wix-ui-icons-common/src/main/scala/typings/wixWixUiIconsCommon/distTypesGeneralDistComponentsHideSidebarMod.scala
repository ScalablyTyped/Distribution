package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsHideSidebarMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/HideSidebar", JSImport.Default)
  @js.native
  val default: FC[HideSidebarProps] = js.native
  
  trait HideSidebarProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HideSidebarProps {
    
    inline def apply(): HideSidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HideSidebarProps]
    }
    
    extension [Self <: HideSidebarProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HideSidebarProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsHideSidebarMod.foo` */
  override def _to: FC[HideSidebarProps] = default
}
