package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "HtmlConditionItem")
@js.native
class HtmlConditionItem () extends ExpressionItem {
  def this(expression: String) = this()
  def this(expression: js.UndefOr[scala.Nothing], html: String) = this()
  def this(expression: String, html: String) = this()
  
  /**
    * The html that shows on completed ('Thank you') page. The expression should return true
    * @see expression
    */
  var html: String = js.native
}
