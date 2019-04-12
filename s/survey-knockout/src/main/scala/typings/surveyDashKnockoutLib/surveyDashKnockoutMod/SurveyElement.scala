package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyElement")
@js.native
class SurveyElement protected ()
  extends Base
     with ISurveyElement {
  def this(name: java.lang.String) = this()
  val areInvisibleElementsShowing: scala.Boolean = js.native
  val data: ISurveyData = js.native
  /**
    * The list of errors. It is created by callig hasErrors functions
    * @see hasErrors
    */
  var errors: js.Array[SurveyError] = js.native
  /**
    * Returns true if the question in design mode right now.
    */
  val isDesignMode: scala.Boolean = js.native
  /* CompleteClass */
  override var isPage: scala.Boolean = js.native
  /* CompleteClass */
  override var isReadOnly: scala.Boolean = js.native
  /* CompleteClass */
  override var isVisible: scala.Boolean = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * Set it to true to make an element question/panel/page readonly.
    * @see enableIf
    * @see isReadOnly
    */
  var readOnly: scala.Boolean = js.native
  var selectedElementInDesign: SurveyElement = js.native
  /**
    * Returns the survey object.
    */
  val survey: ISurvey = js.native
  val surveyImpl: ISurveyImpl = js.native
  val textProcessor: ITextProcessor = js.native
  /* protected */ def copyCssClasses(dest: js.Any, source: js.Any): scala.Unit = js.native
  def getElementsInDesign(): js.Array[IElement] = js.native
  def getElementsInDesign(includeHidden: scala.Boolean): js.Array[IElement] = js.native
  /* protected */ def getPage(parent: IPanel): IPage = js.native
  /* protected */ def getProcessedHtml(html: java.lang.String): java.lang.String = js.native
  /**
    * Returns the type of the object as a string as it represents in the json. It should be in lowcase.
    */
  /* InferMemberOverrides */
  override def getType(): java.lang.String = js.native
  /* InferMemberOverrides */
  override def locStrsChanged(): scala.Unit with js.Any = js.native
  /* CompleteClass */
  override def onFirstRendering(): js.Any = js.native
  /* protected */ def onNameChanged(oldValue: java.lang.String): scala.Unit = js.native
  /* protected */ def onReadOnlyChanged(): scala.Unit = js.native
  /* protected */ def onSetData(): scala.Unit = js.native
  /* CompleteClass */
  override def onSurveyLoad(): js.Any = js.native
  def readOnlyChangedCallback(): scala.Unit = js.native
  /* protected */ def setPage(parent: IPanel, `val`: IPage): scala.Unit = js.native
  /* CompleteClass */
  override def setSurveyImpl(value: ISurveyImpl): js.Any = js.native
  /* CompleteClass */
  override def setVisibleIndex(value: scala.Double): scala.Double = js.native
  def updateCustomWidgets(): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "SurveyElement")
@js.native
object SurveyElement extends js.Object {
  def FocusElement(elementId: java.lang.String): scala.Boolean = js.native
  def GetFirstNonTextElement(elements: js.Any): js.Any = js.native
  def ScrollElementToTop(elementId: java.lang.String): scala.Boolean = js.native
}

