package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionDropdownModel")
@js.native
open class QuestionDropdownModel protected () extends QuestionSelectBase {
  def this(name: String) = this()
  
  /*
    * Specifies whether to display a button that clears the selected value.
    */
  var allowClear: Boolean = js.native
  
  /*
    * Dropdown auto complete
    */
  def autoComplete: String = js.native
  def autoComplete_=(`val`: String): Unit = js.native
  
  /*
    * Use this and choicesMax property to automatically add choices. For example choicesMin = 1 and choicesMax = 10 will generate ten additional choices from 1 to 10.
    */
  def choicesMax: Double = js.native
  def choicesMax_=(`val`: Double): Unit = js.native
  
  /*
    * Use this and choicesMax property to automatically add choices. For example choicesMin = 1 and choicesMax = 10 will generate ten additional choices from 1 to 10.
    */
  def choicesMin: Double = js.native
  def choicesMin_=(`val`: Double): Unit = js.native
  
  /*
    * The default value is 1. It tells the value of the iterator between choicesMin and choicesMax properties.
    * If choicesMin = 10, choicesMax = 30 and choicesStep = 10 then you will have only three additional choices: [10, 20, 30].
    */
  def choicesStep: Double = js.native
  def choicesStep_=(`val`: Double): Unit = js.native
  
  /*
    * The clean files button caption.
    */
  def cleanButtonCaption: String = js.native
  def cleanButtonCaption_=(`val`: String): Unit = js.native
  
  var dropdownListModel: DropdownListModel = js.native
  
  def getControlClass(): String = js.native
  
  def getInputId(): String = js.native
  
  var inputHasValue: Boolean = js.native
  
  /*
    * The name of a component used to render drop-down menu items.
    */
  var itemComponent: String = js.native
  
  def locCleanButtonCaption: LocalizableString = js.native
  
  def locPlaceholder: LocalizableString = js.native
  
  var minMaxChoices: Any = js.native
  
  def onClick(e: Any): Unit = js.native
  
  def onKeyUp(event: Any): Unit = js.native
  
  var onOpened: EventBase[QuestionDropdownModel] = js.native
  
  def onOpenedCallBack(): Unit = js.native
  
  def optionsCaption: String = js.native
  def optionsCaption_=(`val`: String): Unit = js.native
  
  /*
    * A text displayed in the input field when it doesn't have a value.
    */
  def placeholder: String = js.native
  def placeholder_=(`val`: String): Unit = js.native
  
  def popupModel: Any = js.native
  
  var readOnlyText: String = js.native
  
  /*
    * Specifies whether users can enter a value into the input field to filter the drop-down list.
    */
  var searchEnabled: Boolean = js.native
  
  def selectedItem: ItemValue = js.native
  
  def selectedItemLocText: LocalizableString = js.native
  
  def showOptionsCaption: Boolean = js.native
  def showOptionsCaption_=(`val`: Boolean): Unit = js.native
  
  def updateReadOnlyText(): Unit = js.native
}
