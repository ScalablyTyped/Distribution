package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DecorationRangeBehavior extends StObject
@JSImport("vscode", "DecorationRangeBehavior")
@js.native
object DecorationRangeBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DecorationRangeBehavior & Double] = js.native
  
  /**
  		 * The decoration's range will not widen when edits occur at the start or end.
  		 */
  @js.native
  sealed trait ClosedClosed
    extends StObject
       with DecorationRangeBehavior
  /* 1 */ val ClosedClosed: typings.vscode.mod.DecorationRangeBehavior.ClosedClosed & Double = js.native
  
  /**
  		 * The decoration's range will widen when edits occur at the end, but not at the start.
  		 */
  @js.native
  sealed trait ClosedOpen
    extends StObject
       with DecorationRangeBehavior
  /* 3 */ val ClosedOpen: typings.vscode.mod.DecorationRangeBehavior.ClosedOpen & Double = js.native
  
  /**
  		 * The decoration's range will widen when edits occur at the start, but not at the end.
  		 */
  @js.native
  sealed trait OpenClosed
    extends StObject
       with DecorationRangeBehavior
  /* 2 */ val OpenClosed: typings.vscode.mod.DecorationRangeBehavior.OpenClosed & Double = js.native
  
  /**
  		 * The decoration's range will widen when edits occur at the start or end.
  		 */
  @js.native
  sealed trait OpenOpen
    extends StObject
       with DecorationRangeBehavior
  /* 0 */ val OpenOpen: typings.vscode.mod.DecorationRangeBehavior.OpenOpen & Double = js.native
}
