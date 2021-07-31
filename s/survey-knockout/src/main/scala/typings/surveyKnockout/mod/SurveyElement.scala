package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyElement")
@js.native
class SurveyElement protected ()
  extends Base
     with ISurveyElement {
  def this(name: String) = this()
  
  val areInvisibleElementsShowing: Boolean = js.native
  
  /* CompleteClass */
  var containsErrors: Boolean = js.native
  
  val data: ISurveyData = js.native
  
  /* CompleteClass */
  override def delete(): js.Any = js.native
  
  var disableDesignActions: Boolean = js.native
  
  /**
    * The list of errors. It is created by callig hasErrors functions
    * @see hasErrors
    */
  var errors: js.Array[SurveyError] = js.native
  
  /* protected */ def getContainsErrors(): Boolean = js.native
  
  def getElementsInDesign(): js.Array[IElement] = js.native
  def getElementsInDesign(includeHidden: Boolean): js.Array[IElement] = js.native
  
  /* protected */ def getPage(parent: IPanel): IPage = js.native
  
  /* protected */ def getProcessedHtml(html: String): String = js.native
  
  /**
    * Returns the type of the object as a string as it represents in the json. It should be in lowcase.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  
  /* protected */ def getValidName(name: String): String = js.native
  
  var isContentElement: Boolean = js.native
  
  /**
    * Returns true if the question in design mode right now.
    */
  val isDesignMode: Boolean = js.native
  
  /* CompleteClass */
  var isPage: Boolean = js.native
  
  /* CompleteClass */
  var isPanel: Boolean = js.native
  
  /* CompleteClass */
  var isReadOnly: Boolean = js.native
  
  /* CompleteClass */
  var isVisible: Boolean = js.native
  
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit & js.Any = js.native
  
  /* protected */ def moveToBase(parent: IPanel, container: IPanel): Boolean = js.native
  /* protected */ def moveToBase(parent: IPanel, container: IPanel, insertBefore: js.Any): Boolean = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def onFirstRendering(): js.Any = js.native
  
  /* protected */ def onNameChanged(oldValue: String): Unit = js.native
  
  /* protected */ def onReadOnlyChanged(): Unit = js.native
  
  /* protected */ def onSetData(): Unit = js.native
  
  /* CompleteClass */
  override def onSurveyLoad(): js.Any = js.native
  
  /**
    * Set it to true to make an element question/panel/page readonly.
    * Please note, this property is hidden for question without input, for example html question.
    * @see enableIf
    * @see isReadOnly
    */
  var readOnly: Boolean = js.native
  
  def readOnlyChangedCallback(): Unit = js.native
  
  /* protected */ def removeSelfFromList(list: js.Array[js.Any]): Unit = js.native
  
  var selectedElementInDesign: SurveyElement = js.native
  
  /* protected */ def setPage(parent: IPanel, `val`: IPage): Unit = js.native
  
  /* CompleteClass */
  override def setSurveyImpl(value: ISurveyImpl): js.Any = js.native
  
  /* CompleteClass */
  override def setVisibleIndex(value: Double): Double = js.native
  
  /**
    * Returns the survey object.
    */
  val survey: ISurvey = js.native
  
  val surveyImpl: ISurveyImpl = js.native
  
  val textProcessor: ITextProcessor = js.native
  
  def updateContainsErrors(): Unit = js.native
  
  def updateCustomWidgets(): Unit = js.native
  
  def updateElementCss(): Unit = js.native
}
/* static members */
object SurveyElement {
  
  @JSImport("survey-knockout", "SurveyElement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "SurveyElement.CreateDisabledDesignElements")
  @js.native
  def CreateDisabledDesignElements: Boolean = js.native
  @scala.inline
  def CreateDisabledDesignElements_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDisabledDesignElements")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def FocusElement(elementId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("FocusElement")(elementId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def GetFirstNonTextElement(elements: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFirstNonTextElement")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def GetFirstNonTextElement(elements: js.Any, removeSpaces: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirstNonTextElement")(elements.asInstanceOf[js.Any], removeSpaces.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ScrollElementToTop(elementId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollElementToTop")(elementId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def createProgressInfo(): IProgressInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgressInfo")().asInstanceOf[IProgressInfo]
  
  @scala.inline
  def getProgressInfoByElements(children: js.Array[SurveyElement], isRequired: Boolean): IProgressInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getProgressInfoByElements")(children.asInstanceOf[js.Any], isRequired.asInstanceOf[js.Any])).asInstanceOf[IProgressInfo]
}
