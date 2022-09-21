package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMoveToTrashMod.MoveToTrashProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveToTrashMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/MoveToTrash", JSImport.Default)
  @js.native
  val default: FC[MoveToTrashProps] = js.native
  
  type _To = FC[MoveToTrashProps]
  
  /* This means you don't have to write `default`, but can instead just say `moveToTrashMod.foo` */
  override def _to: FC[MoveToTrashProps] = default
}
