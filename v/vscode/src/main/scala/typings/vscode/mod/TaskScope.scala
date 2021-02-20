package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskScope extends StObject
@JSImport("vscode", "TaskScope")
@js.native
object TaskScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskScope with Double] = js.native
  
  /**
    * The task is a global task. Global tasks are currently not supported.
    */
  @js.native
  sealed trait Global extends TaskScope
  /* 1 */ val Global: typings.vscode.mod.TaskScope.Global with Double = js.native
  
  /**
    * The task is a workspace task
    */
  @js.native
  sealed trait Workspace extends TaskScope
  /* 2 */ val Workspace: typings.vscode.mod.TaskScope.Workspace with Double = js.native
}
