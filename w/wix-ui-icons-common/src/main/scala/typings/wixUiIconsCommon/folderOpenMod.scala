package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFolderOpenMod.FolderOpenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderOpenMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/FolderOpen", JSImport.Default)
  @js.native
  val default: FC[FolderOpenProps] = js.native
  
  type _To = FC[FolderOpenProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderOpenMod.foo` */
  override def _to: FC[FolderOpenProps] = default
}
