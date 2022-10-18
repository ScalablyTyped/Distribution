package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCommentModel")
@js.native
open class QuestionCommentModel protected () extends QuestionTextBase {
  def this(name: String) = this()
  
  /*
    * Specifies whether the question allows line breaks.
    * 
    * When this property is enabled, a user can press Enter to insert line breaks. They are saved as `\n` in survey results. The Comment question also recognizes and interprets the `\n` sequence as a line break when you set the question `value` in code.
    */
  def acceptCarriageReturn: Boolean = js.native
  def acceptCarriageReturn_=(`val`: Boolean): Unit = js.native
  
  /*
    * Specifies whether the comment area automatically increases its height to accomodate multi-line content.
    * 
    * Default value: `false` (inherited from `SurveyModel`'s [`autoGrowComment`](https://surveyjs.io/form-library/documentation/surveymodel#autoGrowComment) property)
    */
  def autoGrow: Boolean = js.native
  def autoGrow_=(`val`: Boolean): Unit = js.native
  
  def className: String = js.native
  
  /*
    * Specifies the visible width of the comment area, measured in average character width.
    * 
    * The value of this property is passed on to the `cols` attribute of the underlying `<textarea>` element.
    */
  def cols: Double = js.native
  def cols_=(`val`: Double): Unit = js.native
  
  var element: Any = js.native
  
  def onInput(event: Any): Unit = js.native
  
  def onKeyDown(event: Any): Unit = js.native
  
  /*
    * Specifies the visible height of the comment area, measured in lines.
    * 
    * The value of this property is passed on to the `rows` attribute of the underlying `<textarea>` element.
    */
  def rows: Double = js.native
  def rows_=(`val`: Double): Unit = js.native
  
  /* protected */ def setNewValue(newValue: String): Any = js.native
  
  def updateElement(): Unit = js.native
}
