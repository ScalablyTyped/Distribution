package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCheckboxBase")
@js.native
class QuestionCheckboxBase protected () extends QuestionSelectBase {
  def this(name: String) = this()
  
  /**
    * The number of columns for radiogroup and checkbox questions. Items are rendred in one line if the value is 0.
    */
  var colCount: Double = js.native
  
  def colCountChangedCallback(): Unit = js.native
  
  def getItemIndex(item: js.Any): Double = js.native
}
