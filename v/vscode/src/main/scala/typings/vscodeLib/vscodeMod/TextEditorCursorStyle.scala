package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextEditorCursorStyle extends js.Object

@JSImport("vscode", "TextEditorCursorStyle")
@js.native
object TextEditorCursorStyle extends js.Object {
  /**
  		 * Render the cursor as a block filled.
  		 */
  @js.native
  sealed trait Block
    extends vscodeLib.vscodeMod.TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a block outlined.
  		 */
  @js.native
  sealed trait BlockOutline
    extends vscodeLib.vscodeMod.TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a vertical thick line.
  		 */
  @js.native
  sealed trait Line
    extends vscodeLib.vscodeMod.TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a vertical thin line.
  		 */
  @js.native
  sealed trait LineThin
    extends vscodeLib.vscodeMod.TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a thick horizontal line.
  		 */
  @js.native
  sealed trait Underline
    extends vscodeLib.vscodeMod.TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a thin horizontal line.
  		 */
  @js.native
  sealed trait UnderlineThin
    extends vscodeLib.vscodeMod.TextEditorCursorStyle
  
  /* 2 */ val Block: Block with scala.Double = js.native
  /* 5 */ val BlockOutline: BlockOutline with scala.Double = js.native
  /* 1 */ val Line: Line with scala.Double = js.native
  /* 4 */ val LineThin: LineThin with scala.Double = js.native
  /* 3 */ val Underline: Underline with scala.Double = js.native
  /* 6 */ val UnderlineThin: UnderlineThin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.TextEditorCursorStyle with scala.Double] = js.native
}

