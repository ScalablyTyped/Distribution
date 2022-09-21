package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotebookEditorRevealType extends StObject
@JSImport("vscode", "NotebookEditorRevealType")
@js.native
object NotebookEditorRevealType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotebookEditorRevealType & Double] = js.native
  
  /**
    * The range will always be revealed at the top of the viewport.
    */
  @js.native
  sealed trait AtTop
    extends StObject
       with NotebookEditorRevealType
  /* 3 */ val AtTop: typings.vscode.mod.NotebookEditorRevealType.AtTop & Double = js.native
  
  /**
    * The range will be revealed with as little scrolling as possible.
    */
  @js.native
  sealed trait Default
    extends StObject
       with NotebookEditorRevealType
  /* 0 */ val Default: typings.vscode.mod.NotebookEditorRevealType.Default & Double = js.native
  
  /**
    * The range will always be revealed in the center of the viewport.
    */
  @js.native
  sealed trait InCenter
    extends StObject
       with NotebookEditorRevealType
  /* 1 */ val InCenter: typings.vscode.mod.NotebookEditorRevealType.InCenter & Double = js.native
  
  /**
    * If the range is outside the viewport, it will be revealed in the center of the viewport.
    * Otherwise, it will be revealed with as little scrolling as possible.
    */
  @js.native
  sealed trait InCenterIfOutsideViewport
    extends StObject
       with NotebookEditorRevealType
  /* 2 */ val InCenterIfOutsideViewport: typings.vscode.mod.NotebookEditorRevealType.InCenterIfOutsideViewport & Double = js.native
}
