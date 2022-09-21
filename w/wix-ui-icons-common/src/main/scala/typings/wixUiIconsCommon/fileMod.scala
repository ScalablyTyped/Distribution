package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFileMod.FileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/File", JSImport.Default)
  @js.native
  val default: FC[FileProps] = js.native
  
  type _To = FC[FileProps]
  
  /* This means you don't have to write `default`, but can instead just say `fileMod.foo` */
  override def _to: FC[FileProps] = default
}
