package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewColumn extends js.Object

@JSImport("vscode", "ViewColumn")
@js.native
object ViewColumn extends js.Object {
  /**
  		 * A *symbolic* editor column representing the currently active column. This value
  		 * can be used when opening editors, but the *resolved* [viewColumn](#TextEditor.viewColumn)-value
  		 * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Active`.
  		 */
  @js.native
  sealed trait Active extends ViewColumn
  
  /**
  		 * A *symbolic* editor column representing the column to the side of the active one. This value
  		 * can be used when opening editors, but the *resolved* [viewColumn](#TextEditor.viewColumn)-value
  		 * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Beside`.
  		 */
  @js.native
  sealed trait Beside extends ViewColumn
  
  /**
  		 * The eighth editor column.
  		 */
  @js.native
  sealed trait Eight extends ViewColumn
  
  /**
  		 * The fifth editor column.
  		 */
  @js.native
  sealed trait Five extends ViewColumn
  
  /**
  		 * The fourth editor column.
  		 */
  @js.native
  sealed trait Four extends ViewColumn
  
  /**
  		 * The ninth editor column.
  		 */
  @js.native
  sealed trait Nine extends ViewColumn
  
  /**
  		 * The first editor column.
  		 */
  @js.native
  sealed trait One extends ViewColumn
  
  /**
  		 * The seventh editor column.
  		 */
  @js.native
  sealed trait Seven extends ViewColumn
  
  /**
  		 * The sixth editor column.
  		 */
  @js.native
  sealed trait Six extends ViewColumn
  
  /**
  		 * The third editor column.
  		 */
  @js.native
  sealed trait Three extends ViewColumn
  
  /**
  		 * The second editor column.
  		 */
  @js.native
  sealed trait Two extends ViewColumn
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewColumn with Double] = js.native
  /* -1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* -2 */ @js.native
  object Beside extends TopLevel[Beside with Double]
  
  /* 8 */ @js.native
  object Eight extends TopLevel[Eight with Double]
  
  /* 5 */ @js.native
  object Five extends TopLevel[Five with Double]
  
  /* 4 */ @js.native
  object Four extends TopLevel[Four with Double]
  
  /* 9 */ @js.native
  object Nine extends TopLevel[Nine with Double]
  
  /* 1 */ @js.native
  object One extends TopLevel[One with Double]
  
  /* 7 */ @js.native
  object Seven extends TopLevel[Seven with Double]
  
  /* 6 */ @js.native
  object Six extends TopLevel[Six with Double]
  
  /* 3 */ @js.native
  object Three extends TopLevel[Three with Double]
  
  /* 2 */ @js.native
  object Two extends TopLevel[Two with Double]
  
}

