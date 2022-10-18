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
    * An [autocomplete](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/autocomplete) attribute value for the underlying `<input>` element.
    */
  def autoComplete: String = js.native
  def autoComplete_=(`val`: String): Unit = js.native
  
  /*
    * Use the `choicesMin`, `choicesMax`, and `choicesStep` properties to generate choice items automatically. For example, the configuration below generates three choice items: [10, 20, 30].
    * 
    * ```js
    * "choicesMin": 10,
    * "choicesMax": 30
    * "choicesStep": 10
    * ```
    */
  def choicesMax: Double = js.native
  def choicesMax_=(`val`: Double): Unit = js.native
  
  /*
    * Use the `choicesMin`, `choicesMax`, and `choicesStep` properties to generate choice items automatically. For example, the configuration below generates three choice items: [10, 20, 30].
    * 
    * ```js
    * "choicesMin": 10,
    * "choicesMax": 30
    * "choicesStep": 10
    * ```
    */
  def choicesMin: Double = js.native
  def choicesMin_=(`val`: Double): Unit = js.native
  
  /*
    * Use the `choicesMin`, `choicesMax`, and `choicesStep` properties to generate choice items automatically. For example, the configuration below generates three choice items: [10, 20, 30].
    * 
    * ```js
    * "choicesMin": 10,
    * "choicesMax": 30
    * "choicesStep": 10
    * ```
    * 
    * The default value of the `choicesStep` property is 1.
    */
  def choicesStep: Double = js.native
  def choicesStep_=(`val`: Double): Unit = js.native
  
  def cleanCaption: String = js.native
  def cleanCaption_=(`val`: String): Unit = js.native
  
  var dropdownListModel: DropdownListModel = js.native
  
  def getControlClass(): String = js.native
  
  def getInputId(): String = js.native
  
  def inputFieldComponentName: String = js.native
  
  var inputHasValue: Boolean = js.native
  
  def locCleanCaption: LocalizableString = js.native
  
  def locPlaceholder: LocalizableString = js.native
  
  var minMaxChoices: Any = js.native
  
  def onClick(e: Any): Unit = js.native
  
  def onKeyUp(event: Any): Unit = js.native
  
  var onOpened: EventBase[QuestionDropdownModel] = js.native
  
  def onOpenedCallBack(): Unit = js.native
  
  def optionsCaption: String = js.native
  def optionsCaption_=(`val`: String): Unit = js.native
  
  /*
    * A placeholder for the input field.
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
  
  def showInputFieldComponent: Boolean = js.native
  
  def showOptionsCaption: Boolean = js.native
  def showOptionsCaption_=(`val`: Boolean): Unit = js.native
  
  def showSelectedItemLocText: Boolean = js.native
  
  def updateReadOnlyText(): Unit = js.native
}
