package typings.testingLibraryUserEvent

import typings.std.Range
import typings.testingLibraryUserEvent.anon.AnchorNode
import typings.testingLibraryUserEvent.anon.ClickCount
import typings.testingLibraryUserEvent.anon.Document
import typings.testingLibraryUserEvent.anon.FocusNode
import typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node
import typings.testingLibraryUserEvent.distTypesDocumentUIMod.UISelectionRange
import typings.testingLibraryUserEvent.distTypesUtilsEditIsEditableMod.EditableInputOrTextarea
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`-1`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventSelectionMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/selection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInputRange(focusNode: Node): js.UndefOr[UISelectionRange | Range] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputRange")(focusNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[UISelectionRange | Range]]
  
  inline def isAllSelected(target: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAllSelected")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def modifySelection(param0: FocusNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("modifySelection")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def modifySelectionPerMouseMove(selectionRange: Range, param1: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelectionPerMouseMove")(selectionRange.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def modifySelectionPerMouseMove(selectionRange: SelectionRange, param1: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelectionPerMouseMove")(selectionRange.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveSelection(node: Element, direction: `-1` | `1`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSelection")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def selectAll(target: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setSelection(param0: AnchorNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSelection")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setSelectionPerMouseDown(param0: ClickCount): js.UndefOr[Range | SelectionRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSelectionPerMouseDown")(param0.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Range | SelectionRange]]
  
  inline def setSelectionRange(element: Element, anchorOffset: Double, focusOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSelectionRange")(element.asInstanceOf[js.Any], anchorOffset.asInstanceOf[js.Any], focusOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateSelectionOnFocus(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSelectionOnFocus")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait SelectionRange extends StObject {
    
    var end: Double
    
    var node: EditableInputOrTextarea
    
    var start: Double
  }
  object SelectionRange {
    
    inline def apply(end: Double, node: EditableInputOrTextarea, start: Double): SelectionRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionRange] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setNode(value: EditableInputOrTextarea): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
