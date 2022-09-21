package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCommentModel")
@js.native
open class QuestionCommentModel protected () extends QuestionTextBase {
  def this(name: String) = this()
  
  /*
    * Accepts pressing the Enter key by end-users and accepts carriage return symbols - \n - in the question value assigned.
    */
  def acceptCarriageReturn: Boolean = js.native
  def acceptCarriageReturn_=(`val`: Boolean): Unit = js.native
  
  /*
    * Specifies whether the question's text area automatically expands its height to avoid the vertical scrollbar and to display the entire multi-line contents entered by respondents.
    * Default value is false.
    */
  def autoGrow: Boolean = js.native
  def autoGrow_=(`val`: Boolean): Unit = js.native
  
  def className: String = js.native
  
  /*
    * The html cols attribute.
    */
  def cols: Double = js.native
  def cols_=(`val`: Double): Unit = js.native
  
  var element: Any = js.native
  
  def onInput(event: Any): Unit = js.native
  
  def onKeyDown(event: Any): Unit = js.native
  
  /*
    * The html rows attribute.
    */
  def rows: Double = js.native
  def rows_=(`val`: Double): Unit = js.native
  
  /* protected */ def setNewValue(newValue: String): Any = js.native
  
  def updateElement(): Unit = js.native
}
