package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyElement")
@js.native
class SurveyElement protected ()
  extends Base
     with ISurveyElement {
  def this(name: String) = this()
  val areInvisibleElementsShowing: Boolean = js.native
  val data: ISurveyData = js.native
  var disableDesignActions: Boolean = js.native
  /**
    * The list of errors. It is created by callig hasErrors functions
    * @see hasErrors
    */
  var errors: js.Array[SurveyError] = js.native
  var isContentElement: Boolean = js.native
  /**
    * Returns true if the question in design mode right now.
    */
  val isDesignMode: Boolean = js.native
  /**
    * Set it to true to make an element question/panel/page readonly.
    * Please note, this property is hidden for question without input, for example html question.
    * @see enableIf
    * @see isReadOnly
    */
  var readOnly: Boolean = js.native
  var selectedElementInDesign: SurveyElement = js.native
  /**
    * Returns the survey object.
    */
  val survey: ISurvey = js.native
  val surveyImpl: ISurveyImpl = js.native
  val textProcessor: ITextProcessor = js.native
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
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit with js.Any = js.native
  /* protected */ def moveToBase(parent: IPanel, container: IPanel): Boolean = js.native
  /* protected */ def moveToBase(parent: IPanel, container: IPanel, insertBefore: js.Any): Boolean = js.native
  /* protected */ def onNameChanged(oldValue: String): Unit = js.native
  /* protected */ def onReadOnlyChanged(): Unit = js.native
  /* protected */ def onSetData(): Unit = js.native
  def readOnlyChangedCallback(): Unit = js.native
  /* protected */ def removeSelfFromList(list: js.Array[_]): Unit = js.native
  /* protected */ def setPage(parent: IPanel, `val`: IPage): Unit = js.native
  def updateContainsErrors(): Unit = js.native
  def updateCustomWidgets(): Unit = js.native
  def updateElementCss(): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "SurveyElement")
@js.native
object SurveyElement extends js.Object {
  var CreateDisabledDesignElements: Boolean = js.native
  def FocusElement(elementId: String): Boolean = js.native
  def GetFirstNonTextElement(elements: js.Any): js.Any = js.native
  def GetFirstNonTextElement(elements: js.Any, removeSpaces: Boolean): js.Any = js.native
  def ScrollElementToTop(elementId: String): Boolean = js.native
}

