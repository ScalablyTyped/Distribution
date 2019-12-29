package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FoldingRangeKind extends js.Object

@JSImport("vscode", "FoldingRangeKind")
@js.native
object FoldingRangeKind extends js.Object {
  /**
  		 * Kind for folding range representing a comment.
  		 */
  @js.native
  sealed trait Comment extends FoldingRangeKind
  
  /**
  		 * Kind for folding range representing a import.
  		 */
  @js.native
  sealed trait Imports extends FoldingRangeKind
  
  /**
  		 * Kind for folding range representing regions originating from folding markers like `#region` and `#endregion`.
  		 */
  @js.native
  sealed trait Region extends FoldingRangeKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FoldingRangeKind with Double] = js.native
  /* 1 */ @js.native
  object Comment
    extends TopLevel[typings.vscode.vscodeMod.FoldingRangeKind.Comment with Double]
  
  /* 2 */ @js.native
  object Imports extends TopLevel[Imports with Double]
  
  /* 3 */ @js.native
  object Region extends TopLevel[Region with Double]
  
}

