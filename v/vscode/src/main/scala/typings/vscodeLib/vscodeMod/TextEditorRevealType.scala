package typings
package vscodeLib.vscodeMod

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
  sealed trait AtTop
    extends vscodeLib.vscodeMod.TextEditorRevealType
  
  /**
  		 * The range will be revealed with as little scrolling as possible.
  		 */
  @js.native
  sealed trait Default
    extends vscodeLib.vscodeMod.TextEditorRevealType
  
  /**
  		 * The range will always be revealed in the center of the viewport.
  		 */
  @js.native
  sealed trait InCenter
    extends vscodeLib.vscodeMod.TextEditorRevealType
  
  /**
  		 * If the range is outside the viewport, it will be revealed in the center of the viewport.
  		 * Otherwise, it will be revealed with as little scrolling as possible.
  		 */
  @js.native
  sealed trait InCenterIfOutsideViewport
    extends vscodeLib.vscodeMod.TextEditorRevealType
  
  /* 3 */ val AtTop: AtTop with scala.Double = js.native
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val InCenter: InCenter with scala.Double = js.native
  /* 2 */ val InCenterIfOutsideViewport: InCenterIfOutsideViewport with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.TextEditorRevealType with scala.Double] = js.native
}

