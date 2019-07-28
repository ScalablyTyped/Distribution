package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextEditorRevealType extends js.Object

@JSImport("vscode", "TextEditorRevealType")
@js.native
object TextEditorRevealType extends js.Object {
  /**
  		 * The range will always be revealed at the top of the viewport.
  		 */
  @js.native
  sealed trait AtTop extends TextEditorRevealType
  
  /**
  		 * The range will be revealed with as little scrolling as possible.
  		 */
  @js.native
  sealed trait Default extends TextEditorRevealType
  
  /**
  		 * The range will always be revealed in the center of the viewport.
  		 */
  @js.native
  sealed trait InCenter extends TextEditorRevealType
  
  /**
  		 * If the range is outside the viewport, it will be revealed in the center of the viewport.
  		 * Otherwise, it will be revealed with as little scrolling as possible.
  		 */
  @js.native
  sealed trait InCenterIfOutsideViewport extends TextEditorRevealType
  
  /* 3 */ val AtTop: typings.vscode.vscodeMod.TextEditorRevealType.AtTop with Double = js.native
  /* 0 */ val Default: typings.vscode.vscodeMod.TextEditorRevealType.Default with Double = js.native
  /* 1 */ val InCenter: typings.vscode.vscodeMod.TextEditorRevealType.InCenter with Double = js.native
  /* 2 */ val InCenterIfOutsideViewport: typings.vscode.vscodeMod.TextEditorRevealType.InCenterIfOutsideViewport with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorRevealType with Double] = js.native
}

