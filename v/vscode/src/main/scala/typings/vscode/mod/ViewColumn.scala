package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewColumn extends js.Object
@JSImport("vscode", "ViewColumn")
@js.native
object ViewColumn extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewColumn with Double] = js.native
  
  /**
    * A *symbolic* editor column representing the currently active column. This value
    * can be used when opening editors, but the *resolved* [viewColumn](#TextEditor.viewColumn)-value
    * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Active`.
    */
  @js.native
  sealed trait Active extends ViewColumn
  /* -1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /**
    * A *symbolic* editor column representing the column to the side of the active one. This value
    * can be used when opening editors, but the *resolved* [viewColumn](#TextEditor.viewColumn)-value
    * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Beside`.
    */
  @js.native
  sealed trait Beside extends ViewColumn
  /* -2 */ @js.native
  object Beside extends TopLevel[Beside with Double]
  
  /**
    * The eighth editor column.
    */
  @js.native
  sealed trait Eight extends ViewColumn
  /* 8 */ @js.native
  object Eight extends TopLevel[Eight with Double]
  
  /**
    * The fifth editor column.
    */
  @js.native
  sealed trait Five extends ViewColumn
  /* 5 */ @js.native
  object Five extends TopLevel[Five with Double]
  
  /**
    * The fourth editor column.
    */
  @js.native
  sealed trait Four extends ViewColumn
  /* 4 */ @js.native
  object Four extends TopLevel[Four with Double]
  
  /**
    * The ninth editor column.
    */
  @js.native
  sealed trait Nine extends ViewColumn
  /* 9 */ @js.native
  object Nine extends TopLevel[Nine with Double]
  
  /**
    * The first editor column.
    */
  @js.native
  sealed trait One extends ViewColumn
  /* 1 */ @js.native
  object One extends TopLevel[One with Double]
  
  /**
    * The seventh editor column.
    */
  @js.native
  sealed trait Seven extends ViewColumn
  /* 7 */ @js.native
  object Seven extends TopLevel[Seven with Double]
  
  /**
    * The sixth editor column.
    */
  @js.native
  sealed trait Six extends ViewColumn
  /* 6 */ @js.native
  object Six extends TopLevel[Six with Double]
  
  /**
    * The third editor column.
    */
  @js.native
  sealed trait Three extends ViewColumn
  /* 3 */ @js.native
  object Three extends TopLevel[Three with Double]
  
  /**
    * The second editor column.
    */
  @js.native
  sealed trait Two extends ViewColumn
  /* 2 */ @js.native
  object Two extends TopLevel[Two with Double]
}
