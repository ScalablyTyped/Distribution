package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FoldingRangeKind extends StObject
@JSImport("vscode", "FoldingRangeKind")
@js.native
object FoldingRangeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FoldingRangeKind & Double] = js.native
  
  /**
  		 * Kind for folding range representing a comment.
  		 */
  @js.native
  sealed trait Comment
    extends StObject
       with FoldingRangeKind
  /* 1 */ val Comment: typings.vscode.mod.FoldingRangeKind.Comment & Double = js.native
  
  /**
  		 * Kind for folding range representing a import.
  		 */
  @js.native
  sealed trait Imports
    extends StObject
       with FoldingRangeKind
  /* 2 */ val Imports: typings.vscode.mod.FoldingRangeKind.Imports & Double = js.native
  
  /**
  		 * Kind for folding range representing regions originating from folding markers like `#region` and `#endregion`.
  		 */
  @js.native
  sealed trait Region
    extends StObject
       with FoldingRangeKind
  /* 3 */ val Region: typings.vscode.mod.FoldingRangeKind.Region & Double = js.native
}
