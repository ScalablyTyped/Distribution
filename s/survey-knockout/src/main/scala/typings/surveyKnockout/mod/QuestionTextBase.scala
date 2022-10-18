package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionTextBase")
@js.native
open class QuestionTextBase protected () extends Question {
  def this(name: String) = this()
  
  /* protected */ def calcRenderedPlaceholder(): Unit = js.native
  
  def getControlClass(): String = js.native
  
  def getMaxLength(): Any = js.native
  
  /* protected */ def hasPlaceHolder(): Boolean = js.native
  
  def locPlaceHolder: LocalizableString = js.native
  
  def locPlaceholder: LocalizableString = js.native
  
  /*
    * The maximum text length measured in characters. Assign 0 if the length should be unlimited.
    * 
    * Default value: -1 (inherits the actual value from the `SurveyModel`'s [`maxTextLength`](https://surveyjs.io/form-library/documentation/surveymodel#maxTextLength) property).
    */
  def maxLength: Double = js.native
  def maxLength_=(`val`: Double): Unit = js.native
  
  def placeHolder: String = js.native
  def placeHolder_=(`val`: String): Unit = js.native
  
  /*
    * A placeholder for the input field.
    */
  def placeholder: String = js.native
  def placeholder_=(`val`: String): Unit = js.native
  
  def renderedPlaceholder: String = js.native
  
  /* protected */ def setRenderedPlaceholder(`val`: String): Unit = js.native
  
  /*
    * Gets or sets a value that specifies when to update the question value.
    * 
    * Possible values:
    * 
    * - `"onBlur"` - Updates the value after the input field loses focus.
    * - `"onTyping"` - Updates the value on every key press.
    * - `"default"` (default) - Inherits the value from the `SurveyModel`'s [`textUpdateMode`](https://surveyjs.io/form-library/documentation/surveymodel#textUpdateMode) property.
    * 
    * > NOTE: Do not use the `"onTyping"` mode if your survey contains many expressions. Expressions are reevaluated each time a question value is changed. In `"onTyping"` mode, the question value changes frequently. This may cause performance degradation.
    */
  def textUpdateMode: String = js.native
  def textUpdateMode_=(`val`: String): Unit = js.native
}
