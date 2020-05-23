package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskPanelKind extends js.Object

@JSImport("vscode", "TaskPanelKind")
@js.native
object TaskPanelKind extends js.Object {
  /**
    * Uses a dedicated panel for this tasks. The panel is not
    * shared with other tasks.
    */
  @js.native
  sealed trait Dedicated extends TaskPanelKind
  
  /**
    * Creates a new panel whenever this task is executed.
    */
  @js.native
  sealed trait New extends TaskPanelKind
  
  /**
    * Shares a panel with other tasks. This is the default.
    */
  @js.native
  sealed trait Shared extends TaskPanelKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskPanelKind with Double] = js.native
  /* 2 */ @js.native
  object Dedicated extends TopLevel[Dedicated with Double]
  
  /* 3 */ @js.native
  object New extends TopLevel[New with Double]
  
  /* 1 */ @js.native
  object Shared extends TopLevel[Shared with Double]
  
}

