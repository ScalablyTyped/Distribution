package typings.testingLibraryUserEvent

import typings.std.Range
import typings.testingLibraryUserEvent.anon.Document
import typings.testingLibraryUserEvent.distTypesEventSelectionMod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventSelectionModifySelectionPerMouseMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/selection/modifySelectionPerMouse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def modifySelectionPerMouseMove(selectionRange: Range, param1: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelectionPerMouseMove")(selectionRange.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def modifySelectionPerMouseMove(selectionRange: SelectionRange, param1: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelectionPerMouseMove")(selectionRange.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
