package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskRevealKind extends StObject
@JSImport("vscode", "TaskRevealKind")
@js.native
object TaskRevealKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskRevealKind & Double] = js.native
  
  /**
  		 * Always brings the terminal to front if the task is executed.
  		 */
  @js.native
  sealed trait Always
    extends StObject
       with TaskRevealKind
  /* 1 */ val Always: typings.vscode.mod.TaskRevealKind.Always & Double = js.native
  
  /**
  		 * The terminal never comes to front when the task is executed.
  		 */
  @js.native
  sealed trait Never
    extends StObject
       with TaskRevealKind
  /* 3 */ val Never: typings.vscode.mod.TaskRevealKind.Never & Double = js.native
  
  /**
  		 * Only brings the terminal to front if a problem is detected executing the task
  		 * (e.g. the task couldn't be started because).
  		 */
  @js.native
  sealed trait Silent
    extends StObject
       with TaskRevealKind
  /* 2 */ val Silent: typings.vscode.mod.TaskRevealKind.Silent & Double = js.native
}
