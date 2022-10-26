package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionBooleanModel")
@js.native
open class QuestionBooleanModel protected () extends Question {
  def this(name: String) = this()
  
  def allowClick: Boolean = js.native
  
  /*
    * Gets or sets the question value as a Boolean value.
    * 
    * If you set the `valueTrue` and `valueFalse` properties, the `value` property contains their values instead of Boolean values. This may be inconvenient when you operate the question value in code. To access the standard Boolean values, use the `booleanValue` property.
    */
  def booleanValue: Any = js.native
  def booleanValue_=(`val`: Any): Unit = js.native
  
  def canRenderLabelDescription: Boolean = js.native
  
  def checkedValue: Any = js.native
  def checkedValue_=(`val`: Any): Unit = js.native
  
  def getCheckboxItemCss(): String = js.native
  
  def getCheckedLabel(): LocalizableString = js.native
  
  def getItemCss(): String = js.native
  
  def getLabelCss(checked: Boolean): String = js.native
  
  def getRadioItemClass(css: Any, value: Any): String = js.native
  
  def isDeterminated: Boolean = js.native
  
  def isIndeterminate: Boolean = js.native
  
  def isLabelRendered: Boolean = js.native
  
  def label: String = js.native
  
  /*
    * Gets or sets a text label that corresponds to a negative answer.
    * 
    * Default value: "No"
    */
  def labelFalse: Any = js.native
  def labelFalse_=(`val`: Any): Unit = js.native
  
  /*
    * Gets or sets a text label that corresponds to a positive answer.
    * 
    * Default value: "Yes"
    */
  def labelTrue: Any = js.native
  def labelTrue_=(`val`: Any): Unit = js.native
  
  def label_=(`val`: String): Unit = js.native
  
  def locLabel: LocalizableString = js.native
  
  def locLabelFalse: LocalizableString = js.native
  
  def locLabelTrue: LocalizableString = js.native
  
  def onKeyDownCore(event: Any): Boolean = js.native
  
  def onLabelClick(event: Any, value: Boolean): Boolean = js.native
  
  def onSwitchClickModel(event: Any): Boolean = js.native
  
  var showTitle: Boolean = js.native
  
  def svgIcon: String = js.native
  
  /*
    * A value to save in survey results when respondents give a negative answer.
    * 
    * Default value: `false`
    */
  var valueFalse: Any = js.native
  
  /*
    * A value to save in survey results when respondents give a positive answer.
    * 
    * Default value: `true`
    */
  var valueTrue: Any = js.native
}
