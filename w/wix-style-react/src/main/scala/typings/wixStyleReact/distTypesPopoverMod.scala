package typings.wixStyleReact

import typings.react.mod.FC
import typings.wixStyleReact.anon.ChildrenReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverMod {
  
  @JSImport("wix-style-react/dist/types/Popover", JSImport.Default)
  @js.native
  open class default ()
    extends typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.default
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/Popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Popover", "default.Content")
    @js.native
    def Content: FC[ChildrenReactNode] = js.native
    inline def Content_=(x: FC[ChildrenReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Popover", "default.Element")
    @js.native
    def Element: FC[ChildrenReactNode] = js.native
    inline def Element_=(x: FC[ChildrenReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/Popover", "placements")
  @js.native
  val placements: js.Array[String] = js.native
}
