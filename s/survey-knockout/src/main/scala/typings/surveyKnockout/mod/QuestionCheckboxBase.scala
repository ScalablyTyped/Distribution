package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCheckboxBase")
@js.native
open class QuestionCheckboxBase protected () extends QuestionSelectBase {
  def this(name: String) = this()
  
  /*
    * Get or sets the number of columns used to arrange choice items.
    * 
    * Set this property to 0 if you want to display all items in one line. The default value depends on the available width.
    */
  def colCount: Double = js.native
  
  var colCountChangedCallback: Any = js.native
  
  def colCount_=(`val`: Double): Unit = js.native
}
