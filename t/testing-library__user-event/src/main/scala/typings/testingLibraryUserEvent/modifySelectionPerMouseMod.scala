package typings.testingLibraryUserEvent

import typings.std.Range
import typings.testingLibraryUserEvent.anon.Document
import typings.testingLibraryUserEvent.selectionMod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifySelectionPerMouseMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/selection/modifySelectionPerMouse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def modifySelectionPerMouseMove(selectionRange: Range, hasDocumentTargetNodeOffset: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelectionPerMouseMove")(selectionRange.asInstanceOf[js.Any], hasDocumentTargetNodeOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def modifySelectionPerMouseMove(selectionRange: SelectionRange, hasDocumentTargetNodeOffset: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelectionPerMouseMove")(selectionRange.asInstanceOf[js.Any], hasDocumentTargetNodeOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
