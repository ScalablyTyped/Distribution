package typings
package vscodeLib.vscodeMod

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
  sealed trait Active
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * A *symbolic* editor column representing the column to the side of the active one. This value
  		 * can be used when opening editors, but the *resolved* [viewColumn](#TextEditor.viewColumn)-value
  		 * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Beside`.
  		 */
  @js.native
  sealed trait Beside
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The eighth editor column.
  		 */
  @js.native
  sealed trait Eight
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The fifth editor column.
  		 */
  @js.native
  sealed trait Five
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The fourth editor column.
  		 */
  @js.native
  sealed trait Four
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The ninth editor column.
  		 */
  @js.native
  sealed trait Nine
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The first editor column.
  		 */
  @js.native
  sealed trait One
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The seventh editor column.
  		 */
  @js.native
  sealed trait Seven
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The sixth editor column.
  		 */
  @js.native
  sealed trait Six
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The third editor column.
  		 */
  @js.native
  sealed trait Three
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The second editor column.
  		 */
  @js.native
  sealed trait Two
    extends vscodeLib.vscodeMod.ViewColumn
  
  /* -1 */ val Active: Active with scala.Double = js.native
  /* -2 */ val Beside: Beside with scala.Double = js.native
  /* 8 */ val Eight: Eight with scala.Double = js.native
  /* 5 */ val Five: Five with scala.Double = js.native
  /* 4 */ val Four: Four with scala.Double = js.native
  /* 9 */ val Nine: Nine with scala.Double = js.native
  /* 1 */ val One: One with scala.Double = js.native
  /* 7 */ val Seven: Seven with scala.Double = js.native
  /* 6 */ val Six: Six with scala.Double = js.native
  /* 3 */ val Three: Three with scala.Double = js.native
  /* 2 */ val Two: Two with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.ViewColumn with scala.Double] = js.native
}

