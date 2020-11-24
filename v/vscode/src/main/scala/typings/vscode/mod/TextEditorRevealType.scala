package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorRevealType extends js.Object
@JSImport("vscode", "TextEditorRevealType")
@js.native
object TextEditorRevealType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorRevealType with Double] = js.native
  
  /**
    * The range will always be revealed at the top of the viewport.
    */
  @js.native
  sealed trait AtTop extends TextEditorRevealType
  /* 3 */ @js.native
  object AtTop extends TopLevel[AtTop with Double]
  
  /**
    * The range will be revealed with as little scrolling as possible.
    */
  @js.native
  sealed trait Default extends TextEditorRevealType
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /**
    * The range will always be revealed in the center of the viewport.
    */
  @js.native
  sealed trait InCenter extends TextEditorRevealType
  /* 1 */ @js.native
  object InCenter extends TopLevel[InCenter with Double]
  
  /**
    * If the range is outside the viewport, it will be revealed in the center of the viewport.
    * Otherwise, it will be revealed with as little scrolling as possible.
    */
  @js.native
  sealed trait InCenterIfOutsideViewport extends TextEditorRevealType
  /* 2 */ @js.native
  object InCenterIfOutsideViewport extends TopLevel[InCenterIfOutsideViewport with Double]
}
