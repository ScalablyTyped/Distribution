package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FoldingRangeKind extends StObject
@JSImport("vscode", "FoldingRangeKind")
@js.native
object FoldingRangeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FoldingRangeKind with Double] = js.native
  
  /**
    * Kind for folding range representing a comment.
    */
  @js.native
  sealed trait Comment extends FoldingRangeKind
  /* 1 */ val Comment: typings.vscode.mod.FoldingRangeKind.Comment with Double = js.native
  
  /**
    * Kind for folding range representing a import.
    */
  @js.native
  sealed trait Imports extends FoldingRangeKind
  /* 2 */ val Imports: typings.vscode.mod.FoldingRangeKind.Imports with Double = js.native
  
  /**
    * Kind for folding range representing regions originating from folding markers like `#region` and `#endregion`.
    */
  @js.native
  sealed trait Region extends FoldingRangeKind
  /* 3 */ val Region: typings.vscode.mod.FoldingRangeKind.Region with Double = js.native
}
