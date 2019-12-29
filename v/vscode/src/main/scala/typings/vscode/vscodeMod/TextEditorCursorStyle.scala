package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Block extends TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a block outlined.
  		 */
  @js.native
  sealed trait BlockOutline extends TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a vertical thick line.
  		 */
  @js.native
  sealed trait Line extends TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a vertical thin line.
  		 */
  @js.native
  sealed trait LineThin extends TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a thick horizontal line.
  		 */
  @js.native
  sealed trait Underline extends TextEditorCursorStyle
  
  /**
  		 * Render the cursor as a thin horizontal line.
  		 */
  @js.native
  sealed trait UnderlineThin extends TextEditorCursorStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorStyle with Double] = js.native
  /* 2 */ @js.native
  object Block extends TopLevel[Block with Double]
  
  /* 5 */ @js.native
  object BlockOutline extends TopLevel[BlockOutline with Double]
  
  /* 1 */ @js.native
  object Line extends TopLevel[Line with Double]
  
  /* 4 */ @js.native
  object LineThin extends TopLevel[LineThin with Double]
  
  /* 3 */ @js.native
  object Underline extends TopLevel[Underline with Double]
  
  /* 6 */ @js.native
  object UnderlineThin extends TopLevel[UnderlineThin with Double]
  
}

