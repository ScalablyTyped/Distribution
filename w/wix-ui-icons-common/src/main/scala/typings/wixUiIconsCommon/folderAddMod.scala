package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFolderAddMod.FolderAddProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/FolderAdd", JSImport.Default)
  @js.native
  val default: FC[FolderAddProps] = js.native
  
  type _To = FC[FolderAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderAddMod.foo` */
  override def _to: FC[FolderAddProps] = default
}
