package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskScope extends js.Object

@JSImport("vscode", "TaskScope")
@js.native
object TaskScope extends js.Object {
  /**
  		 * The task is a global task. Global tasks are currrently not supported.
  		 */
  @js.native
  sealed trait Global extends TaskScope
  
  /**
  		 * The task is a workspace task
  		 */
  @js.native
  sealed trait Workspace extends TaskScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskScope with Double] = js.native
  /* 1 */ @js.native
  object Global extends TopLevel[Global with Double]
  
  /* 2 */ @js.native
  object Workspace extends TopLevel[Workspace with Double]
  
}

