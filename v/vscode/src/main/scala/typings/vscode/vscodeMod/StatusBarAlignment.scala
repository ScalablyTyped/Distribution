package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
import typings.vscode.vscodeMod.StatusBarAlignment.Left
import typings.vscode.vscodeMod.StatusBarAlignment.Right
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
  sealed trait Left extends StatusBarAlignment
  
  /**
  		 * Aligned to the right side.
  		 */
  @js.native
  sealed trait Right extends StatusBarAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusBarAlignment with Double] = js.native
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

