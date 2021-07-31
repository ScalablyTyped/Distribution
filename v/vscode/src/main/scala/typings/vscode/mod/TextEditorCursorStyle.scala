package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorCursorStyle extends StObject
@JSImport("vscode", "TextEditorCursorStyle")
@js.native
object TextEditorCursorStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorStyle & Double] = js.native
  
  /**
    * Render the cursor as a block filled.
    */
  @js.native
  sealed trait Block
    extends StObject
       with TextEditorCursorStyle
  /* 2 */ val Block: typings.vscode.mod.TextEditorCursorStyle.Block & Double = js.native
  
  /**
    * Render the cursor as a block outlined.
    */
  @js.native
  sealed trait BlockOutline
    extends StObject
       with TextEditorCursorStyle
  /* 5 */ val BlockOutline: typings.vscode.mod.TextEditorCursorStyle.BlockOutline & Double = js.native
  
  /**
    * Render the cursor as a vertical thick line.
    */
  @js.native
  sealed trait Line
    extends StObject
       with TextEditorCursorStyle
  /* 1 */ val Line: typings.vscode.mod.TextEditorCursorStyle.Line & Double = js.native
  
  /**
    * Render the cursor as a vertical thin line.
    */
  @js.native
  sealed trait LineThin
    extends StObject
       with TextEditorCursorStyle
  /* 4 */ val LineThin: typings.vscode.mod.TextEditorCursorStyle.LineThin & Double = js.native
  
  /**
    * Render the cursor as a thick horizontal line.
    */
  @js.native
  sealed trait Underline
    extends StObject
       with TextEditorCursorStyle
  /* 3 */ val Underline: typings.vscode.mod.TextEditorCursorStyle.Underline & Double = js.native
  
  /**
    * Render the cursor as a thin horizontal line.
    */
  @js.native
  sealed trait UnderlineThin
    extends StObject
       with TextEditorCursorStyle
  /* 6 */ val UnderlineThin: typings.vscode.mod.TextEditorCursorStyle.UnderlineThin & Double = js.native
}
