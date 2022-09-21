package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionTextModel")
@js.native
open class QuestionTextModel protected () extends QuestionTextBase {
  def this(name: String) = this()
  
  /*
    * Text auto complete
    */
  def autoComplete: String = js.native
  def autoComplete_=(`val`: String): Unit = js.native
  
  /* protected */ def correctValueType(newValue: Any): Any = js.native
  
  /*
    * The list of recommended options available to choose.
    */
  def dataList: Any = js.native
  
  def dataListId: String = js.native
  
  def dataList_=(`val`: Any): Unit = js.native
  
  def inputSize: Double = js.native
  
  def inputStyle: Any = js.native
  
  /*
    * Use this property to change the default input type.
    */
  def inputType: String = js.native
  def inputType_=(`val`: String): Unit = js.native
  
  def inputWidth: String = js.native
  
  /*
    * Readonly property that returns true if the current inputType allows to set min and max properties
    */
  def isMinMaxType: Boolean = js.native
  
  def isTextInput: Boolean = js.native
  
  def locDataList: LocalizableStrings = js.native
  
  var locDataListValue: LocalizableStrings = js.native
  
  def locMaxErrorText: LocalizableString = js.native
  
  def locMinErrorText: LocalizableString = js.native
  
  /*
    * The maximum value
    */
  def max: String = js.native
  
  /*
    * The text that shows when value is greater than man property.
    */
  def maxErrorText: String = js.native
  def maxErrorText_=(`val`: String): Unit = js.native
  
  /*
    * The maximum value that you can setup as expression, for example today(1) = tomorrow;
    */
  def maxValueExpression: String = js.native
  def maxValueExpression_=(`val`: String): Unit = js.native
  
  var maxValueRunner: ExpressionRunner = js.native
  
  def max_=(`val`: String): Unit = js.native
  
  /*
    * The minimum value
    */
  def min: String = js.native
  
  /*
    * The text that shows when value is less than min property.
    */
  def minErrorText: String = js.native
  def minErrorText_=(`val`: String): Unit = js.native
  
  /*
    * The minimum value that you can setup as expression, for example today(-1) = yesterday;
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
    * The text input size
    */
  def size: Double = js.native
  def size_=(`val`: Double): Unit = js.native
  
  /*
    * The step value
    */
  def step: String = js.native
  def step_=(`val`: String): Unit = js.native
  
  def updateInputSize(): Unit = js.native
}
