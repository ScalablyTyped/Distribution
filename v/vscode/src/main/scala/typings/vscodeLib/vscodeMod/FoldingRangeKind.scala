package typings
package vscodeLib.vscodeMod

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
  sealed trait Comment
    extends vscodeLib.vscodeMod.FoldingRangeKind
  
  /**
  		 * Kind for folding range representing a import.
  		 */
  @js.native
  sealed trait Imports
    extends vscodeLib.vscodeMod.FoldingRangeKind
  
  /**
  		 * Kind for folding range representing regions (for example a folding range marked by `#region` and `#endregion`).
  		 */
  @js.native
  sealed trait Region
    extends vscodeLib.vscodeMod.FoldingRangeKind
  
  /* 1 */ val Comment: Comment with scala.Double = js.native
  /* 2 */ val Imports: Imports with scala.Double = js.native
  /* 3 */ val Region: Region with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.FoldingRangeKind with scala.Double] = js.native
}

