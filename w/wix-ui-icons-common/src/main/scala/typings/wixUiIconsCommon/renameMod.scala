package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsRenameMod.RenameProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renameMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Rename", JSImport.Default)
  @js.native
  val default: FC[RenameProps] = js.native
  
  type _To = FC[RenameProps]
  
  /* This means you don't have to write `default`, but can instead just say `renameMod.foo` */
  override def _to: FC[RenameProps] = default
}
