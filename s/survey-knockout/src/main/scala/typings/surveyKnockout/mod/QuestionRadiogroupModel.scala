package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionRadiogroupModel")
@js.native
class QuestionRadiogroupModel protected () extends QuestionCheckboxBase {
  def this(name: String) = this()
  
  val canShowClearButton: Boolean = js.native
  
  val clearButtonCaption: js.Any = js.native
  
  def getItemClass(item: js.Any): js.Any = js.native
  
  val selectedItem: ItemValue = js.native
  
  /**
    * Show "clear button" flag.
    */
  var showClearButton: Boolean = js.native
}
