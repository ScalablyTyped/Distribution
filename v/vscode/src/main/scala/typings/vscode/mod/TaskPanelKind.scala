package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskPanelKind extends StObject
@JSImport("vscode", "TaskPanelKind")
@js.native
object TaskPanelKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskPanelKind & Double] = js.native
  
  /**
    * Uses a dedicated panel for this tasks. The panel is not
    * shared with other tasks.
    */
  @js.native
  sealed trait Dedicated
    extends StObject
       with TaskPanelKind
  /* 2 */ val Dedicated: typings.vscode.mod.TaskPanelKind.Dedicated & Double = js.native
  
  /**
    * Creates a new panel whenever this task is executed.
    */
  @js.native
  sealed trait New
    extends StObject
       with TaskPanelKind
  /* 3 */ val New: typings.vscode.mod.TaskPanelKind.New & Double = js.native
  
  /**
    * Shares a panel with other tasks. This is the default.
    */
  @js.native
  sealed trait Shared
    extends StObject
       with TaskPanelKind
  /* 1 */ val Shared: typings.vscode.mod.TaskPanelKind.Shared & Double = js.native
}
