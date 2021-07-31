package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "TextValidator")
@js.native
class TextValidator () extends SurveyValidator {
  def this(minLength: Double) = this()
  def this(minLength: Double, maxLength: Double) = this()
  def this(minLength: Unit, maxLength: Double) = this()
  def this(minLength: Double, maxLength: Double, allowDigits: Boolean) = this()
  def this(minLength: Double, maxLength: Unit, allowDigits: Boolean) = this()
  def this(minLength: Unit, maxLength: Double, allowDigits: Boolean) = this()
  def this(minLength: Unit, maxLength: Unit, allowDigits: Boolean) = this()
  
  /**
    * The allowDigits property.
    */
  var allowDigits: Boolean = js.native
  
  /**
    * The maxLength property.
    */
  var maxLength: Double = js.native
  
  /**
    * The minLength property.
    */
  var minLength: Double = js.native
}
