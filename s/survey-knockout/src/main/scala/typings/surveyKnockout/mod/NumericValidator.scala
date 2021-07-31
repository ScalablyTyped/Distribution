package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "NumericValidator")
@js.native
class NumericValidator () extends SurveyValidator {
  def this(minValue: Double) = this()
  def this(minValue: Double, maxValue: Double) = this()
  def this(minValue: Unit, maxValue: Double) = this()
  
  /**
    * The maxValue property.
    */
  var maxValue: Double = js.native
  
  /**
    * The minValue property.
    */
  var minValue: Double = js.native
}
