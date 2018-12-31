package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(surveyDashKnockoutLib.surveyDashKnockoutMod.IMultipleTextData because Would inherit conflicting mutable fields List(isPage, isReadOnly, isVisible, name, parent))*/
@JSImport("survey-knockout", "QuestionMultipleTextModel")
@js.native
class QuestionMultipleTextModel protected () extends Question {
  def this(name: java.lang.String) = this()
  /**
    * The number of columns. Items are rendred in one line if the value is 0.
    */
  var colCount: scala.Double = js.native
  /**
    * The default text input size.
    */
  var itemSize: scala.Double = js.native
  /**
    * The list of input items.
    */
  var items: js.Array[MultipleTextItemModel] = js.native
  def addElement(element: IElement, index: scala.Double): scala.Unit = js.native
  /**
    * Add a new text item.
    * @param name a item name
    * @param title a item title (optional)
    */
  def addItem(name: java.lang.String): MultipleTextItemModel = js.native
  def addItem(name: java.lang.String, title: java.lang.String): MultipleTextItemModel = js.native
  def colCountChangedCallback(): scala.Unit = js.native
  /* protected */ def createTextItem(name: java.lang.String, title: java.lang.String): MultipleTextItemModel = js.native
  def elementWidthChanged(el: IElement): scala.Unit = js.native
  def getIsRequiredText(): java.lang.String = js.native
  def getItemByName(name: java.lang.String): MultipleTextItemModel = js.native
  def getMultipleTextValue(name: java.lang.String): js.Any = js.native
  def getQuestionTitleLocation(): java.lang.String = js.native
  /**
    * Returns the list of rendered rows.
    */
  def getRows(): js.Array[_] = js.native
  def getSurvey(): ISurvey = js.native
  def getTextProcessor(): ITextProcessor = js.native
  /* protected */ def onItemValueChanged(): scala.Unit = js.native
  def setMultipleTextValue(name: java.lang.String, value: js.Any): scala.Unit = js.native
}

