package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.Flip
import typings.wixUiCore.standaloneSrcUtilsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPopoverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover", "Popover")
  @js.native
  class Popover protected ()
    extends typings.wixUiCore.componentsPopoverPopoverMod.Popover {
    def this(props: js.Any) = this()
  }
  /* static members */
  object Popover {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover", "Popover")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover", "Popover.Content")
    @js.native
    def Content: FunctionComponent[ElementProps] = js.native
    @scala.inline
    def Content_=(x: FunctionComponent[ElementProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover", "Popover.Element")
    @js.native
    def Element: FunctionComponent[ElementProps] = js.native
    @scala.inline
    def Element_=(x: FunctionComponent[ElementProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover", "Popover.defaultProps")
    @js.native
    def defaultProps: Flip = js.native
    @scala.inline
    def defaultProps_=(x: Flip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover", "Popover.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
