package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionTextModel")
@js.native
open class QuestionTextModel protected () extends QuestionTextBase {
  def this(name: String) = this()
  
  /*
    * A value passed on to the [`autocomplete`](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/autocomplete) attribute of the underlying `<input>` element.
    */
  def autocomplete: String = js.native
  def autocomplete_=(`val`: String): Unit = js.native
  
  /* protected */ def correctValueType(newValue: Any): Any = js.native
  
  /*
    * An array of predefined options from which users can select. This property configures an HTML [`<datalist>`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/datalist) element and associates it with the underlying `input` element.
    */
  def dataList: Any = js.native
  
  def dataListId: String = js.native
  
  def dataList_=(`val`: Any): Unit = js.native
  
  def inputSize: Double = js.native
  
  def inputStyle: Any = js.native
  
  /*
    * A value passed on to the [`type`](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#input_types) attribute of the underlying `<input>` element.
    */
  def inputType: String = js.native
  def inputType_=(`val`: String): Unit = js.native
  
  def inputWidth: String = js.native
  
  /*
    * Returns `true` if the specified `inputType` supports the `min` and `max` properties.
    */
  def isMinMaxType: Boolean = js.native
  
  def isTextInput: Boolean = js.native
  
  def locDataList: LocalizableStrings = js.native
  
  var locDataListValue: LocalizableStrings = js.native
  
  def locMaxErrorText: LocalizableString = js.native
  
  def locMinErrorText: LocalizableString = js.native
  
  /*
    * A value passed on to the [`max`](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/max) attribute of the underlying `<input>` element.
    */
  def max: String = js.native
  
  /*
    * An error message to display when the question value exceeds the maximum accepted value.
    */
  def maxErrorText: String = js.native
  def maxErrorText_=(`val`: String): Unit = js.native
  
  /*
    * The maximum value specified as an expression. For example, `"maxValueExpression": "today(1)"` sets the maximum value to tomorrow.
    */
  def maxValueExpression: String = js.native
  def maxValueExpression_=(`val`: String): Unit = js.native
  
  var maxValueRunner: ExpressionRunner = js.native
  
  def max_=(`val`: String): Unit = js.native
  
  /*
    * A value passed on to the [`min`](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/min) attribute of the underlying `<input>` element.
    */
  def min: String = js.native
  
  /*
    * An error message to display when the question value is less than the minimum accepted value.
    */
  def minErrorText: String = js.native
  def minErrorText_=(`val`: String): Unit = js.native
  
  /*
    * The minimum value specified as an expression. For example, `"minValueExpression": "today(-1)"` sets the minimum value to yesterday.
    */
  def minValueExpression: String = js.native
  def minValueExpression_=(`val`: String): Unit = js.native
  
  var minValueRunner: ExpressionRunner = js.native
  
  def min_=(`val`: String): Unit = js.native
  
  def renderedInputSize: Double = js.native
  
  def renderedMax: Any = js.native
  
  def renderedMin: Any = js.native
  
  def renderedStep: String = js.native
  
  /*
    * A value passed on to the [`size`](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/size) attribute of the underlying `<input>` element.
    */
  def size: Double = js.native
  def size_=(`val`: Double): Unit = js.native
  
  /*
    * A value passed on to the [`step`](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/step) attribute of the underlying `<input>` element.
    */
  def step: String = js.native
  def step_=(`val`: String): Unit = js.native
  
  def updateInputSize(): Unit = js.native
}
