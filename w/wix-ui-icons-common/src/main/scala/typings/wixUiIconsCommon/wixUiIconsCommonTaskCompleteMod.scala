package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.taskCompleteMod.TaskCompleteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonTaskCompleteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/TaskComplete", JSImport.Default)
  @js.native
  val default: FC[TaskCompleteProps] = js.native
  
  type _To = FC[TaskCompleteProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonTaskCompleteMod.foo` */
  override def _to: FC[TaskCompleteProps] = default
}
