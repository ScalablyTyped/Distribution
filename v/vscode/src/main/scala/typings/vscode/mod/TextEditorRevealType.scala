package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorRevealType extends StObject
@JSImport("vscode", "TextEditorRevealType")
@js.native
object TextEditorRevealType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorRevealType with Double] = js.native
  
  /**
    * The range will always be revealed at the top of the viewport.
    */
  @js.native
  sealed trait AtTop extends TextEditorRevealType
  /* 3 */ val AtTop: typings.vscode.mod.TextEditorRevealType.AtTop with Double = js.native
  
  /**
    * The range will be revealed with as little scrolling as possible.
    */
  @js.native
  sealed trait Default extends TextEditorRevealType
  /* 0 */ val Default: typings.vscode.mod.TextEditorRevealType.Default with Double = js.native
  
  /**
    * The range will always be revealed in the center of the viewport.
    */
  @js.native
  sealed trait InCenter extends TextEditorRevealType
  /* 1 */ val InCenter: typings.vscode.mod.TextEditorRevealType.InCenter with Double = js.native
  
  /**
    * If the range is outside the viewport, it will be revealed in the center of the viewport.
    * Otherwise, it will be revealed with as little scrolling as possible.
    */
  @js.native
  sealed trait InCenterIfOutsideViewport extends TextEditorRevealType
  /* 2 */ val InCenterIfOutsideViewport: typings.vscode.mod.TextEditorRevealType.InCenterIfOutsideViewport with Double = js.native
}
