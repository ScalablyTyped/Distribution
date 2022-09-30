package typings.testingLibraryUserEvent

import typings.std.Range
import typings.testingLibraryUserEvent.anon.AnchorNode
import typings.testingLibraryUserEvent.anon.ClickCount
import typings.testingLibraryUserEvent.anon.Document
import typings.testingLibraryUserEvent.anon.FocusNode
import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.isEditableMod.EditableInputOrTextarea
import typings.testingLibraryUserEvent.prepareDocumentMod.global.Node
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`-1`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`1`
import typings.testingLibraryUserEvent.uIMod.UISelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/selection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInputRange(focusNode: Node): js.UndefOr[UISelectionRange | Range] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputRange")(focusNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[UISelectionRange | Range]]
  
  inline def isAllSelected(target: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAllSelected")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def modifySelection(hasFocusNodeFocusOffset: FocusNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("modifySelection")(hasFocusNodeFocusOffset.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def modifySelectionPerMouseMove(selectionRange: Range, hasDocumentTargetNodeOffset: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelectionPerMouseMove")(selectionRange.asInstanceOf[js.Any], hasDocumentTargetNodeOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def modifySelectionPerMouseMove(selectionRange: SelectionRange, hasDocumentTargetNodeOffset: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modifySelectionPerMouseMove")(selectionRange.asInstanceOf[js.Any], hasDocumentTargetNodeOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveSelection(node: Element, direction: `-1` | `1`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSelection")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def selectAll(target: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setSelection(hasFocusNodeFocusOffsetAnchorNodeAnchorOffset: AnchorNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSelection")(hasFocusNodeFocusOffsetAnchorNodeAnchorOffset.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setSelectionPerMouseDown(hasDocumentTargetClickCountNodeOffset: ClickCount): js.UndefOr[Range | SelectionRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSelectionPerMouseDown")(hasDocumentTargetClickCountNodeOffset.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Range | SelectionRange]]
  
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
    
    extension [Self <: SelectionRange](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setNode(value: EditableInputOrTextarea): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
