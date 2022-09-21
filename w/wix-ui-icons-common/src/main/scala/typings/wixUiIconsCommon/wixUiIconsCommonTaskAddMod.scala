package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.taskAddMod.TaskAddProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonTaskAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/TaskAdd", JSImport.Default)
  @js.native
  val default: FC[TaskAddProps] = js.native
  
  type _To = FC[TaskAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonTaskAddMod.foo` */
  override def _to: FC[TaskAddProps] = default
}
