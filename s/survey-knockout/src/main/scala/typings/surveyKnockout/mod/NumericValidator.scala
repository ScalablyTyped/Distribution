package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "NumericValidator")
@js.native
open class NumericValidator () extends SurveyValidator {
  def this(minValue: Double) = this()
  def this(minValue: Double, maxValue: Double) = this()
  def this(minValue: Unit, maxValue: Double) = this()
  
  /*
    * The maxValue property.
    */
  def maxValue: Double = js.native
  def maxValue_=(`val`: Double): Unit = js.native
  
  /*
    * The minValue property.
    */
  def minValue: Double = js.native
  def minValue_=(`val`: Double): Unit = js.native
}
