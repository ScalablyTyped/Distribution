package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionBooleanModel")
@js.native
class QuestionBooleanModel protected () extends Question {
  def this(name: String) = this()
  
  /**
    * Get/set question value in 3 modes: indeterminate (value is empty), true (check is set) and false (check is unset).
    * @see valueTrue
    * @see valueFalse
    */
  var checkedValue: js.Any = js.native
  
  /**
    * Returns true if the question check will be rendered in indeterminate mode. value is empty.
    */
  val isIndeterminate: Boolean = js.native
  
  /**
    * The checkbox label. If it is empty and showTitle is false then title is rendered
    * @see showTitle
    * @see title
    */
  var label: String = js.native
  
  /**
    * Set this property, if you want to have a different label for state when check is unset.
    */
  var labelFalse: js.Any = js.native
  
  /**
    * Set this property, if you want to have a different label for state when check is set.
    */
  var labelTrue: js.Any = js.native
  
  val locDisplayLabel: LocalizableString = js.native
  
  val locLabelFalse: LocalizableString = js.native
  
  val locLabelTrue: LocalizableString = js.native
  
  /**
    * Set this property to true to show the question title. It is hidden by default.
    */
  var showTitle: Boolean = js.native
  
  /**
    * Set this property, if you want to have a different value from false when check is unset.
    */
  var valueFalse: js.Any = js.native
  
  /**
    * Set this property, if you want to have a different value from true when check is set.
    */
  var valueTrue: js.Any = js.native
}
