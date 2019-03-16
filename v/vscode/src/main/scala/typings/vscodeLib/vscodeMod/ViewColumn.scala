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
  		 * A *symbolic* editor column representing the currently
  		 * active column. This value can be used when opening editors, but the
  		 * *resolved* [viewColumn](#TextEditor.viewColumn)-value of editors will always
  		 * be `One`, `Two`, `Three`, or `undefined` but never `Active`.
  		 */
  @js.native
  sealed trait Active
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The left most editor column.
  		 */
  @js.native
  sealed trait One
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The right most editor column.
  		 */
  @js.native
  sealed trait Three
    extends vscodeLib.vscodeMod.ViewColumn
  
  /**
  		 * The center editor column.
  		 */
  @js.native
  sealed trait Two
    extends vscodeLib.vscodeMod.ViewColumn
  
  /* -1 */ val Active: Active with scala.Double = js.native
  /* 1 */ val One: One with scala.Double = js.native
  /* 3 */ val Three: Three with scala.Double = js.native
  /* 2 */ val Two: Two with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.ViewColumn with scala.Double] = js.native
}

