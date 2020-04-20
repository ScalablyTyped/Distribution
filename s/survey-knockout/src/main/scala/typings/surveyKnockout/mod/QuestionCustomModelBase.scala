package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.IPanel because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name, parent. Inlined getChildrenLayoutType, getQuestionTitleLocation, getQuestionStartIndex, elementWidthChanged, indexOf, elements */ @JSImport("survey-knockout", "QuestionCustomModelBase")
@js.native
abstract class QuestionCustomModelBase protected ()
  extends Question
     with ISurveyImpl
     with ISurveyData {
  def this(name: String, customQuestion: ComponentQuestionJSON) = this()
  var customQuestion: ComponentQuestionJSON = js.native
  val elements: js.Array[IElement] = js.native
  def addElement(element: IElement, index: Double): js.Any = js.native
  @JSName("addElement")
  def addElement_Unit(element: IElement, index: Double): Unit = js.native
  /* protected */ def convertDataName(name: String): String = js.native
  /* protected */ def convertDataValue(name: String, newValue: js.Any): js.Any = js.native
  /* protected */ def createWrapper(): Unit = js.native
  def elementWidthChanged(el: IElement): js.Any = js.native
  @JSName("elementWidthChanged")
  def elementWidthChanged_Unit(el: IElement): Unit = js.native
  /* CompleteClass */
  override def geSurveyData(): ISurveyData = js.native
  /* InferMemberOverrides */
  override def getAllValues(): js.Any = js.native
  def getChildrenLayoutType(): String = js.native
  /* protected */ def getElement(): SurveyElement = js.native
  def getQuestionStartIndex(): String = js.native
  def getQuestionTitleLocation(): String = js.native
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  /**
    * Returns the type of the object as a string as it represents in the json. It should be in lowcase.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  def indexOf(el: IElement): Double = js.native
  /* protected */ def initElement(el: SurveyElement): Unit = js.native
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit with js.Any = js.native
}

