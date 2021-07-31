package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.Fixed
import typings.wixUiCore.srcUtilsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiCorePopoverNextMod {
  
  @JSImport("wix-ui-core/popover-next", "PopoverNext")
  @js.native
  class PopoverNext protected ()
    extends typings.wixUiCore.popoverNextMod.PopoverNext {
    def this(props: js.Any) = this()
  }
  /* static members */
  object PopoverNext {
    
    @JSImport("wix-ui-core/popover-next", "PopoverNext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/popover-next", "PopoverNext.Content")
    @js.native
    def Content: FunctionComponent[ElementProps] = js.native
    @scala.inline
    def Content_=(x: FunctionComponent[ElementProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/popover-next", "PopoverNext.Element")
    @js.native
    def Element: FunctionComponent[ElementProps] = js.native
    @scala.inline
    def Element_=(x: FunctionComponent[ElementProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/popover-next", "PopoverNext.defaultProps")
    @js.native
    def defaultProps: Fixed = js.native
    @scala.inline
    def defaultProps_=(x: Fixed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/popover-next", "PopoverNext.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
