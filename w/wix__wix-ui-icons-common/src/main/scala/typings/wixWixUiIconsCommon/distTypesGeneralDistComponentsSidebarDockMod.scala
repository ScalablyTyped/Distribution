package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSidebarDockMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SidebarDock", JSImport.Default)
  @js.native
  val default: FC[SidebarDockProps] = js.native
  
  trait SidebarDockProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SidebarDockProps {
    
    inline def apply(): SidebarDockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarDockProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SidebarDockProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SidebarDockProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSidebarDockMod.foo` */
  override def _to: FC[SidebarDockProps] = default
}
