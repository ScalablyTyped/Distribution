package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCheckboxBase")
@js.native
open class QuestionCheckboxBase protected () extends QuestionSelectBase {
  def this(name: String) = this()
  
  /*
    * The number of columns for radiogroup and checkbox questions. Items are rendred in one line if the value is 0.
    */
  def colCount: Double = js.native
  
  var colCountChangedCallback: Any = js.native
  
  def colCount_=(`val`: Double): Unit = js.native
}
