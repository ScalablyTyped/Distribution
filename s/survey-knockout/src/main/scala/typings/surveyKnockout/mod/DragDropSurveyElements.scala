package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "DragDropSurveyElements")
@js.native
open class DragDropSurveyElements () extends DragDropCore[Any] {
  def this(surveyValue: ISurvey) = this()
  def this(surveyValue: Unit, creator: Any) = this()
  def this(surveyValue: ISurvey, creator: Any) = this()
  def this(surveyValue: Unit, creator: Any, longTap: Boolean) = this()
  def this(surveyValue: Unit, creator: Unit, longTap: Boolean) = this()
  def this(surveyValue: ISurvey, creator: Any, longTap: Boolean) = this()
  def this(surveyValue: ISurvey, creator: Unit, longTap: Boolean) = this()
  
  /* protected */ def calculateIsRight(clientX: Double): Boolean = js.native
  /* protected */ def calculateIsRight(clientX: Double, dropTargetNode: Any): Boolean = js.native
  
  /* protected */ def createDraggedElementIcon(): Any = js.native
  
  /* protected */ def createElementFromJson(json: Any): Any = js.native
  
  /* protected */ @JSName("doClear")
  var doClear_FDragDropSurveyElements: Any = js.native
  
  /* protected */ @JSName("doDrop")
  var doDrop_FDragDropSurveyElements: Any = js.native
  
  /* protected */ def findDeepestDropTargetChild(parent: Any): Any = js.native
  
  /* protected */ var ghostSurveyElement: IElement = js.native
  
  /* protected */ def insertGhostElementIntoSurvey(): Boolean = js.native
  
  /* protected */ var isDraggedElementSelected: Boolean = js.native
  
  /* protected */ def isDropTargetValid(): Boolean = js.native
  
  /* protected */ var isEdge: Boolean = js.native
  
  var isRight: Boolean = js.native
  
  /* protected */ var prevIsEdge: Any = js.native
  
  /* protected */ var prevIsRight: Boolean = js.native
  
  /* protected */ def removeGhostElementFromSurvey(): Unit = js.native
  
  def startDragSurveyElement(event: Any, draggedElement: Any): Unit = js.native
  def startDragSurveyElement(event: Any, draggedElement: Any, isElementSelected: Boolean): Unit = js.native
  
  def startDragToolboxItem(event: Any, draggedElementJson: JsonObject, toolboxItemTitle: String): Unit = js.native
}
/* static members */
object DragDropSurveyElements {
  
  @JSImport("survey-knockout", "DragDropSurveyElements")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "DragDropSurveyElements.edgeHeight")
  @js.native
  def edgeHeight: Double = js.native
  inline def edgeHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edgeHeight")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "DragDropSurveyElements.ghostSurveyElementName")
  @js.native
  def ghostSurveyElementName: String = js.native
  inline def ghostSurveyElementName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ghostSurveyElementName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "DragDropSurveyElements.nestedPanelDepth")
  @js.native
  def nestedPanelDepth: Double = js.native
  inline def nestedPanelDepth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nestedPanelDepth")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "DragDropSurveyElements.newGhostPage")
  @js.native
  def newGhostPage: PageModel = js.native
  inline def newGhostPage_=(x: PageModel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newGhostPage")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "DragDropSurveyElements.restrictDragQuestionBetweenPages")
  @js.native
  def restrictDragQuestionBetweenPages: Boolean = js.native
  inline def restrictDragQuestionBetweenPages_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictDragQuestionBetweenPages")(x.asInstanceOf[js.Any])
}
