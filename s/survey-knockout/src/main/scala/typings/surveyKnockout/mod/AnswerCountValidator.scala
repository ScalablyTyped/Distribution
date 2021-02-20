package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "AnswerCountValidator")
@js.native
class AnswerCountValidator () extends SurveyValidator {
  def this(minCount: Double) = this()
  def this(minCount: js.UndefOr[scala.Nothing], maxCount: Double) = this()
  def this(minCount: Double, maxCount: Double) = this()
  
  /**
    * The maxCount property.
    */
  var maxCount: Double = js.native
  
  /**
    * The minCount property.
    */
  var minCount: Double = js.native
}
