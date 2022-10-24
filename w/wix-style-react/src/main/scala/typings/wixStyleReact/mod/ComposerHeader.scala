package typings.wixStyleReact.mod

import typings.react.mod.FC
import typings.wixStyleReact.distTypesComposerHeaderMod.ComposerHeaderActionsProps
import typings.wixStyleReact.distTypesComposerHeaderMod.ComposerHeaderMainActionsProps
import typings.wixStyleReact.distTypesComposerHeaderMod.ComposerHeaderSaveStatusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "ComposerHeader")
@js.native
open class ComposerHeader ()
  extends typings.wixStyleReact.distTypesComposerHeaderMod.default
/* static members */
object ComposerHeader {
  
  @JSImport("wix-style-react", "ComposerHeader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "ComposerHeader.Actions")
  @js.native
  def Actions: FC[ComposerHeaderActionsProps] = js.native
  inline def Actions_=(x: FC[ComposerHeaderActionsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Actions")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "ComposerHeader.MainActions")
  @js.native
  def MainActions: FC[ComposerHeaderMainActionsProps] = js.native
  inline def MainActions_=(x: FC[ComposerHeaderMainActionsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MainActions")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "ComposerHeader.SaveStatus")
  @js.native
  def SaveStatus: FC[ComposerHeaderSaveStatusProps] = js.native
  inline def SaveStatus_=(x: FC[ComposerHeaderSaveStatusProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SaveStatus")(x.asInstanceOf[js.Any])
}
