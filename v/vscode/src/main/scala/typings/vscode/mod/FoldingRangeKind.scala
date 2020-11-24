package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FoldingRangeKind extends js.Object
@JSImport("vscode", "FoldingRangeKind")
@js.native
object FoldingRangeKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FoldingRangeKind with Double] = js.native
  
  /**
    * Kind for folding range representing a comment.
    */
  @js.native
  sealed trait Comment extends FoldingRangeKind
  /* 1 */ @js.native
  object Comment
    extends TopLevel[typings.vscode.mod.FoldingRangeKind.Comment with Double]
  
  /**
    * Kind for folding range representing a import.
    */
  @js.native
  sealed trait Imports extends FoldingRangeKind
  /* 2 */ @js.native
  object Imports extends TopLevel[Imports with Double]
  
  /**
    * Kind for folding range representing regions originating from folding markers like `#region` and `#endregion`.
    */
  @js.native
  sealed trait Region extends FoldingRangeKind
  /* 3 */ @js.native
  object Region extends TopLevel[Region with Double]
}
