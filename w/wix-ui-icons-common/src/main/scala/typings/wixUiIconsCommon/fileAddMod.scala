package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsFileAddMod.FileAddProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/FileAdd", JSImport.Default)
  @js.native
  val default: FC[FileAddProps] = js.native
  
  type _To = FC[FileAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `fileAddMod.foo` */
  override def _to: FC[FileAddProps] = default
}
