package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "DragDropCore")
@js.native
open class DragDropCore[T] () extends Base {
  def this(surveyValue: ISurvey) = this()
  def this(surveyValue: Unit, creator: Any) = this()
  def this(surveyValue: ISurvey, creator: Any) = this()
  def this(surveyValue: Unit, creator: Any, longTap: Boolean) = this()
  def this(surveyValue: Unit, creator: Unit, longTap: Boolean) = this()
  def this(surveyValue: ISurvey, creator: Any, longTap: Boolean) = this()
  def this(surveyValue: ISurvey, creator: Unit, longTap: Boolean) = this()
  
  /* protected */ def afterDragOver(): Unit = js.native
  /* protected */ def afterDragOver(dropTargetNode: Any): Unit = js.native
  /* protected */ def afterDragOver(dropTargetNode: Any, event: Any): Unit = js.native
  /* protected */ def afterDragOver(dropTargetNode: Unit, event: Any): Unit = js.native
  
  /* protected */ var allowDropHere: Boolean = js.native
  
  /* protected */ var banDropHere: Any = js.native
  
  /* protected */ def calculateHorizontalMiddleOfHTMLElement(HTMLElement: Any): Double = js.native
  
  /* protected */ def calculateIsBottom(clientY: Double): Boolean = js.native
  /* protected */ def calculateIsBottom(clientY: Double, dropTargetNode: Any): Boolean = js.native
  
  /* protected */ def calculateVerticalMiddleOfHTMLElement(HTMLElement: Any): Double = js.native
  
  /* protected */ var clear: Any = js.native
  
  /* protected */ def createDraggedElementShortcut(text: String): Any = js.native
  /* protected */ def createDraggedElementShortcut(text: String, draggedElementNode: Any): Any = js.native
  /* protected */ def createDraggedElementShortcut(text: String, draggedElementNode: Any, event: Any): Any = js.native
  /* protected */ def createDraggedElementShortcut(text: String, draggedElementNode: Unit, event: Any): Any = js.native
  
  var currentX: Double = js.native
  
  var currentY: Double = js.native
  
  /* protected */ var doBanDropHere: Any = js.native
  
  /* protected */ def doClear(): Unit = js.native
  
  /* protected */ def doDragOver(): Unit = js.native
  /* protected */ def doDragOver(dropTargetNode: Any): Unit = js.native
  /* protected */ def doDragOver(dropTargetNode: Any, event: Any): Unit = js.native
  /* protected */ def doDragOver(dropTargetNode: Unit, event: Any): Unit = js.native
  
  /* protected */ def doDrop(): Any = js.native
  
  def dragOver(event: Any): Unit = js.native
  
  var draggedElement: Any = js.native
  
  /* protected */ var draggedElementShortcut: Any = js.native
  
  /* protected */ def draggedElementType: String = js.native
  
  var drop: Any = js.native
  
  var dropTarget: Any = js.native
  
  /* protected */ def dropTargetDataAttributeName: String = js.native
  
  /* protected */ def findDropTargetNodeByDragOverNode(dragOverNode: Any): Any = js.native
  
  /* protected */ def getDataAttributeValueByNode(node: Any): Any = js.native
  
  /* protected */ def getDraggedElementClass(): String = js.native
  
  /* protected */ def getDropTargetByDataAttributeValue(dataAttributeValue: String): Any = js.native
  /* protected */ def getDropTargetByDataAttributeValue(dataAttributeValue: String, dropTargetNode: Any): Any = js.native
  /* protected */ def getDropTargetByDataAttributeValue(dataAttributeValue: String, dropTargetNode: Any, event: Any): Any = js.native
  /* protected */ def getDropTargetByDataAttributeValue(dataAttributeValue: String, dropTargetNode: Unit, event: Any): Any = js.native
  
  /* protected */ def getDropTargetByNode(dropTargetNode: Any, event: Any): Any = js.native
  
  def getGhostPosition(item: Any): String = js.native
  
  /* protected */ def getShortcutText(draggedElement: IShortcutText): String = js.native
  
  /* protected */ def ghostPositionChanged(): Unit = js.native
  
  /* protected */ def handleEscapeButton(event: Any): Unit = js.native
  
  def handlePointerCancel(event: Any): Unit = js.native
  
  var isBottom: Boolean = js.native
  
  /* protected */ def isDropTargetDoesntChanged(newIsBottom: Boolean): Boolean = js.native
  
  /* protected */ def isDropTargetValid(dropTarget: Any): Boolean = js.native
  /* protected */ def isDropTargetValid(dropTarget: Any, dropTargetNode: Any): Boolean = js.native
  
  var onAfterDrop: EventBase[DragDropCore[T]] = js.native
  
  var onBeforeDrop: EventBase[DragDropCore[T]] = js.native
  
  def onContextMenu(event: Any): Unit = js.native
  
  var onGhostPositionChanged: EventBase[Base] = js.native
  
  /* protected */ def onStartDrag(): Unit = js.native
  
  /* protected */ var parentElement: T = js.native
  
  var prevDropTarget: Any = js.native
  
  var savedTargetNode: Any = js.native
  
  var scrollIntervalId: Double = js.native
  
  def startDrag(event: Any, draggedElement: Any): Unit = js.native
  def startDrag(event: Any, draggedElement: Any, parentElement: Any): Unit = js.native
  def startDrag(event: Any, draggedElement: Any, parentElement: Any, draggedElementNode: Any): Unit = js.native
  def startDrag(
    event: Any,
    draggedElement: Any,
    parentElement: Any,
    draggedElementNode: Any,
    preventSaveTargetNode: Boolean
  ): Unit = js.native
  def startDrag(
    event: Any,
    draggedElement: Any,
    parentElement: Any,
    draggedElementNode: Unit,
    preventSaveTargetNode: Boolean
  ): Unit = js.native
  def startDrag(event: Any, draggedElement: Any, parentElement: Unit, draggedElementNode: Any): Unit = js.native
  def startDrag(
    event: Any,
    draggedElement: Any,
    parentElement: Unit,
    draggedElementNode: Any,
    preventSaveTargetNode: Boolean
  ): Unit = js.native
  def startDrag(
    event: Any,
    draggedElement: Any,
    parentElement: Unit,
    draggedElementNode: Unit,
    preventSaveTargetNode: Boolean
  ): Unit = js.native
  
  var startX: Double = js.native
  
  var startY: Double = js.native
  
  def stopLongTap(): Unit = js.native
  def stopLongTap(e: Any): Unit = js.native
  
  def stopLongTapIfMoveEnough(pointerMoveEvent: Any): Unit = js.native
  
  /* protected */ def survey: SurveyModel = js.native
  
  var timeoutID: Any = js.native
}
/* static members */
object DragDropCore {
  
  @JSImport("survey-knockout", "DragDropCore")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "DragDropCore.PreventScrolling")
  @js.native
  def PreventScrolling: Boolean = js.native
  inline def PreventScrolling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PreventScrolling")(x.asInstanceOf[js.Any])
}
