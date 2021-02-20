package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "UrlConditionItem")
@js.native
class UrlConditionItem () extends ExpressionItem {
  def this(expression: String) = this()
  def this(expression: js.UndefOr[scala.Nothing], url: String) = this()
  def this(expression: String, url: String) = this()
  
  val locUrl: LocalizableString = js.native
  
  /**
    * The url that survey navigates to on completing the survey. The expression should return true
    * @see expression
    */
  var url: String = js.native
}
