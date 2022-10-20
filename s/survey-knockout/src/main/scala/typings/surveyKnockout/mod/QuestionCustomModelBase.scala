package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IShortcutText because Already inherited
- typings.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement
- typings.surveyKnockout.mod.ISurveyElement because Already inherited
- typings.surveyKnockout.mod.IPanel because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name, parent, shortcutText, skeletonComponentName. Inlined getChildrenLayoutType, getQuestionTitleLocation, getQuestionStartIndex, elementWidthChanged, indexOf, elements, ensureRowsVisibility */ @JSImport("survey-knockout", "QuestionCustomModelBase")
@js.native
open class QuestionCustomModelBase protected ()
  extends Question
     with ISurveyImpl
     with ISurveyData {
  def this(name: String, customQuestion: ComponentQuestionJSON) = this()
  
  def addElement(element: IElement, index: Double): Any = js.native
  @JSName("addElement")
  def addElement_Unit(element: IElement, index: Double): Unit = js.native
  
  /* protected */ def convertDataName(name: String): String = js.native
  
  /* protected */ def convertDataValue(name: String, newValue: Any): Any = js.native
  
  /* protected */ def createWrapper(): Unit = js.native
  
  var customQuestion: ComponentQuestionJSON = js.native
  
  def elementWidthChanged(el: IElement): Any = js.native
  @JSName("elementWidthChanged")
  def elementWidthChanged_Unit(el: IElement): Unit = js.native
  
  def elements: Any = js.native
  @JSName("elements")
  var elements_FQuestionCustomModelBase: Any = js.native
  
  def ensureRowsVisibility(): Unit = js.native
  
  /* InferMemberOverrides */
  override def getAllValues(): Any = js.native
  
  def getChildrenLayoutType(): String = js.native
  
  /* protected */ def getContentDisplayValueCore(keyAsText: Boolean, value: Any, question: Question): Any = js.native
  
  /* InferMemberOverrides */
  override def getDataFilteredProperties(): Any = js.native
  
  /* InferMemberOverrides */
  override def getDataFilteredValues(): Any = js.native
  
  /* protected */ def getElement(): SurveyElement[Any] = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  def getQuestionStartIndex(): String = js.native
  
  def getQuestionTitleLocation(): String = js.native
  
  /* InferMemberOverrides */
  override def getSurvey(): ISurvey = js.native
  
  /* CompleteClass */
  override def getSurveyData(): ISurveyData = js.native
  
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  
  /* InferMemberOverrides */
  override def getTitleToolbar(): AdaptiveActionContainer[Action] = js.native
  
  /*
    * Returns the object type as it is used in the JSON schema.
    */
  /* InferMemberOverrides */
  override def getType(): String = js.native
  
  def indexOf(el: IElement): Double = js.native
  
  /* protected */ def initElement(el: Any): Unit = js.native
  
  /* InferMemberOverrides */
  override def locStrsChanged(): Unit & Any = js.native
  
  /* InferMemberOverrides */
  override def onSurveyLoad(): Unit & Any = js.native
  
  /* InferMemberOverrides */
  override def toggleState(): Unit & Boolean = js.native
}
