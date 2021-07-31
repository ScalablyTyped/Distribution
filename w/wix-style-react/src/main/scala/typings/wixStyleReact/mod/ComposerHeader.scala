package typings.wixStyleReact.mod

import typings.react.mod.SFC
import typings.wixStyleReact.composerHeaderMod.ComposerHeaderActionsProps
import typings.wixStyleReact.composerHeaderMod.ComposerHeaderMainActionsProps
import typings.wixStyleReact.composerHeaderMod.ComposerHeaderSaveStatusProps
import typings.wixStyleReact.composerHeaderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "ComposerHeader")
@js.native
class ComposerHeader () extends default
/* static members */
object ComposerHeader {
  
  @JSImport("wix-style-react", "ComposerHeader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "ComposerHeader.Actions")
  @js.native
  def Actions: SFC[ComposerHeaderActionsProps] = js.native
  @scala.inline
  def Actions_=(x: SFC[ComposerHeaderActionsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Actions")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "ComposerHeader.MainActions")
  @js.native
  def MainActions: SFC[ComposerHeaderMainActionsProps] = js.native
  @scala.inline
  def MainActions_=(x: SFC[ComposerHeaderMainActionsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MainActions")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "ComposerHeader.SaveStatus")
  @js.native
  def SaveStatus: SFC[ComposerHeaderSaveStatusProps] = js.native
  @scala.inline
  def SaveStatus_=(x: SFC[ComposerHeaderSaveStatusProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SaveStatus")(x.asInstanceOf[js.Any])
}
