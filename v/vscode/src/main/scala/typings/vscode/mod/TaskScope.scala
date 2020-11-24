package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskScope extends js.Object
@JSImport("vscode", "TaskScope")
@js.native
object TaskScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskScope with Double] = js.native
  
  /**
    * The task is a global task. Global tasks are currently not supported.
    */
  @js.native
  sealed trait Global extends TaskScope
  /* 1 */ @js.native
  object Global extends TopLevel[Global with Double]
  
  /**
    * The task is a workspace task
    */
  @js.native
  sealed trait Workspace extends TaskScope
  /* 2 */ @js.native
  object Workspace extends TopLevel[Workspace with Double]
}
