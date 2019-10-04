package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.surveyDashKnockout.surveyDashKnockoutMod.IMultipleTextData because var conflicts: containsErrors, isPage, isReadOnly, isVisible, name, parent. Inlined getSurvey, getTextProcessor, getMultipleTextValue, setMultipleTextValue, getItemDefaultValue, getIsRequiredText */ @JSImport("survey-knockout", "QuestionMultipleTextModel")
@js.native
class QuestionMultipleTextModel protected () extends Question {
  def this(name: String) = this()
  /**
    * The number of columns. Items are rendred in one line if the value is 0.
    */
  var colCount: Double = js.native
  val elements: js.Array[IElement] = js.native
  /**
    * The default text input size.
    */
  var itemSize: Double = js.native
  /**
    * The list of input items.
    */
  var items: js.Array[MultipleTextItemModel] = js.native
  def addElement(element: IElement, index: Double): Unit = js.native
  /**
    * Add a new text item.
    * @param name a item name
    * @param title a item title (optional)
    */
  def addItem(name: String): MultipleTextItemModel = js.native
  def addItem(name: String, title: String): MultipleTextItemModel = js.native
  def colCountChangedCallback(): Unit = js.native
  /* protected */ def createTextItem(name: String, title: String): MultipleTextItemModel = js.native
  def elementWidthChanged(el: IElement): Unit = js.native
  def getChildrenLayoutType(): String = js.native
  def getIsRequiredText(): String = js.native
  def getItemByName(name: String): MultipleTextItemModel = js.native
  def getItemDefaultValue(name: String): js.Any = js.native
  def getMultipleTextValue(name: String): js.Any = js.native
  def getQuestionTitleLocation(): String = js.native
  /**
    * Returns the list of rendered rows.
    */
  def getRows(): js.Array[_] = js.native
  def getSurvey(): ISurvey = js.native
  def getTextProcessor(): ITextProcessor = js.native
  def indexOf(el: IElement): Double = js.native
  /* protected */ def onItemValueChanged(): Unit = js.native
  def setMultipleTextValue(name: String, value: js.Any): Unit = js.native
  @JSName("setMultipleTextValue")
  def setMultipleTextValue_Any(name: String, value: js.Any): js.Any = js.native
}

