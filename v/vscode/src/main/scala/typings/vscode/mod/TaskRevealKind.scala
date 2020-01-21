package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskRevealKind extends js.Object

@JSImport("vscode", "TaskRevealKind")
@js.native
object TaskRevealKind extends js.Object {
  /**
  		 * Always brings the terminal to front if the task is executed.
  		 */
  @js.native
  sealed trait Always extends TaskRevealKind
  
  /**
  		 * The terminal never comes to front when the task is executed.
  		 */
  @js.native
  sealed trait Never extends TaskRevealKind
  
  /**
  		 * Only brings the terminal to front if a problem is detected executing the task
  		 * (e.g. the task couldn't be started because).
  		 */
  @js.native
  sealed trait Silent extends TaskRevealKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskRevealKind with Double] = js.native
  /* 1 */ @js.native
  object Always extends TopLevel[Always with Double]
  
  /* 3 */ @js.native
  object Never extends TopLevel[Never with Double]
  
  /* 2 */ @js.native
  object Silent extends TopLevel[Silent with Double]
  
}

