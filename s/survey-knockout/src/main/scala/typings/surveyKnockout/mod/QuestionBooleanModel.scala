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
    * Get/set question value in 3 modes: indeterminate (value is empty), true (check is set) and false (check is unset).
    */
  def checkedValue: Any = js.native
  def checkedValue_=(`val`: Any): Unit = js.native
  
  def getCheckboxItemCss(): String = js.native
  
  def getCheckedLabel(): LocalizableString = js.native
  
  def getItemCss(): String = js.native
  
  def getLabelCss(checked: Boolean): String = js.native
  
  def getRadioItemClass(css: Any, value: Any): String = js.native
  
  def isDeterminated: Boolean = js.native
  
  /*
    * Returns true if the question check will be rendered in indeterminate mode. value is empty.
    */
  def isIndeterminate: Boolean = js.native
  
  /*
    * The checkbox label. If it is empty and showTitle is false then title is rendered
    */
  def label: String = js.native
  
  /*
    * Set this property, if you want to have a different label for state when check is unset.
    */
  def labelFalse: Any = js.native
  def labelFalse_=(`val`: Any): Unit = js.native
  
  /*
    * Set this property, if you want to have a different label for state when check is set.
    */
  def labelTrue: Any = js.native
  def labelTrue_=(`val`: Any): Unit = js.native
  
  def label_=(`val`: String): Unit = js.native
  
  def locDisplayLabel: LocalizableString = js.native
  
  def locLabel: LocalizableString = js.native
  
  def locLabelFalse: LocalizableString = js.native
  
  def locLabelTrue: LocalizableString = js.native
  
  def onKeyDownCore(event: Any): Boolean = js.native
  
  def onLabelClick(event: Any, value: Boolean): Boolean = js.native
  
  def onSwitchClickModel(event: Any): Boolean = js.native
  
  /*
    * Set this property to true to show the question title. It is hidden by default.
    */
  var showTitle: Boolean = js.native
  
  def svgIcon: String = js.native
  
  /*
    * Set this property, if you want to have a different value from false when check is unset.
    */
  var valueFalse: Any = js.native
  
  /*
    * Set this property, if you want to have a different value from true when check is set.
    */
  var valueTrue: Any = js.native
}
