package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskScope extends StObject
@JSImport("vscode", "TaskScope")
@js.native
object TaskScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskScope & Double] = js.native
  
  /**
  		 * The task is a global task. Global tasks are currently not supported.
  		 */
  @js.native
  sealed trait Global
    extends StObject
       with TaskScope
  /* 1 */ val Global: typings.vscode.mod.TaskScope.Global & Double = js.native
  
  /**
  		 * The task is a workspace task
  		 */
  @js.native
  sealed trait Workspace
    extends StObject
       with TaskScope
  /* 2 */ val Workspace: typings.vscode.mod.TaskScope.Workspace & Double = js.native
}
