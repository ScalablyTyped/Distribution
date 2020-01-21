package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DecorationRangeBehavior extends js.Object

@JSImport("vscode", "DecorationRangeBehavior")
@js.native
object DecorationRangeBehavior extends js.Object {
  /**
  		 * The decoration's range will not widen when edits occur at the start of end.
  		 */
  @js.native
  sealed trait ClosedClosed extends DecorationRangeBehavior
  
  /**
  		 * The decoration's range will widen when edits occur at the end, but not at the start.
  		 */
  @js.native
  sealed trait ClosedOpen extends DecorationRangeBehavior
  
  /**
  		 * The decoration's range will widen when edits occur at the start, but not at the end.
  		 */
  @js.native
  sealed trait OpenClosed extends DecorationRangeBehavior
  
  /**
  		 * The decoration's range will widen when edits occur at the start or end.
  		 */
  @js.native
  sealed trait OpenOpen extends DecorationRangeBehavior
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DecorationRangeBehavior with Double] = js.native
  /* 1 */ @js.native
  object ClosedClosed extends TopLevel[ClosedClosed with Double]
  
  /* 3 */ @js.native
  object ClosedOpen extends TopLevel[ClosedOpen with Double]
  
  /* 2 */ @js.native
  object OpenClosed extends TopLevel[OpenClosed with Double]
  
  /* 0 */ @js.native
  object OpenOpen extends TopLevel[OpenOpen with Double]
  
}

