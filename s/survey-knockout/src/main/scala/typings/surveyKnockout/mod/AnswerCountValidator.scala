package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "AnswerCountValidator")
@js.native
open class AnswerCountValidator () extends SurveyValidator {
  def this(minCount: Double) = this()
  def this(minCount: Double, maxCount: Double) = this()
  def this(minCount: Unit, maxCount: Double) = this()
  
  /*
    * The maxCount property.
    */
  def maxCount: Double = js.native
  def maxCount_=(`val`: Double): Unit = js.native
  
  /*
    * The minCount property.
    */
  def minCount: Double = js.native
  def minCount_=(`val`: Double): Unit = js.native
}
