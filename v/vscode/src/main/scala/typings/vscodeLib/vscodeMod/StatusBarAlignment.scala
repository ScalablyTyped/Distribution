package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusBarAlignment extends js.Object

@JSImport("vscode", "StatusBarAlignment")
@js.native
object StatusBarAlignment extends js.Object {
  /**
  		 * Aligned to the left side.
  		 */
  @js.native
  sealed trait Left
    extends vscodeLib.vscodeMod.StatusBarAlignment
  
  /**
  		 * Aligned to the right side.
  		 */
  @js.native
  sealed trait Right
    extends vscodeLib.vscodeMod.StatusBarAlignment
  
  /* 1 */ val Left: Left with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.StatusBarAlignment with scala.Double] = js.native
}

