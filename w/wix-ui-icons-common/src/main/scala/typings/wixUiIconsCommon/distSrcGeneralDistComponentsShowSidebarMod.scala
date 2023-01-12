package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsShowSidebarMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ShowSidebar", JSImport.Default)
  @js.native
  val default: FC[ShowSidebarProps] = js.native
  
  trait ShowSidebarProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShowSidebarProps {
    
    inline def apply(): ShowSidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowSidebarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShowSidebarProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShowSidebarProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsShowSidebarMod.foo` */
  override def _to: FC[ShowSidebarProps] = default
}
