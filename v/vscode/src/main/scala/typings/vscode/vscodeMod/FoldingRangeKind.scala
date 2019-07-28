package typings.vscode.vscodeMod

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
  
  /* 1 */ val Comment: typings.vscode.vscodeMod.FoldingRangeKind.Comment with Double = js.native
  /* 2 */ val Imports: typings.vscode.vscodeMod.FoldingRangeKind.Imports with Double = js.native
  /* 3 */ val Region: typings.vscode.vscodeMod.FoldingRangeKind.Region with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FoldingRangeKind with Double] = js.native
}

