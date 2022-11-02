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
    * Returns the selected choice item. If no item is selected, returns `null`.
    */
  def selectedItem: ItemValue = js.native
  
  /*
    * Specifies whether to display a button that clears the question value.
    * 
    * Default value: `false`
    */
  def showClearButton: Boolean = js.native
  
  def showClearButtonInContent: Boolean = js.native
  
  def showClearButton_=(`val`: Boolean): Unit = js.native
}
