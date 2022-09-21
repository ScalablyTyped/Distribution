package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionRadiogroupModel")
@js.native
open class QuestionRadiogroupModel protected () extends QuestionCheckboxBase {
  def this(name: String) = this()
  
  def canShowClearButton: Boolean = js.native
  
  def clearButtonCaption: String = js.native
  
  /*
    * Return the selected item in the radio group. Returns null if the value is empty
    */
  def selectedItem: ItemValue = js.native
  
  /*
    * Show "clear button" flag.
    */
  def showClearButton: Boolean = js.native
  
  def showClearButtonInContent: Boolean = js.native
  
  def showClearButton_=(`val`: Boolean): Unit = js.native
}
