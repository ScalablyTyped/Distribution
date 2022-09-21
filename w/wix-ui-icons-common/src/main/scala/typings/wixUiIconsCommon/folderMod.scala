package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFolderMod.FolderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Folder", JSImport.Default)
  @js.native
  val default: FC[FolderProps] = js.native
  
  type _To = FC[FolderProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderMod.foo` */
  override def _to: FC[FolderProps] = default
}
