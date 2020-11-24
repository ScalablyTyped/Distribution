package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ExpressionItem")
@js.native
class ExpressionItem ()
  extends Base
     with ILocalizableOwner {
  def this(expression: String) = this()
  
  /**
    * The expression property. If this expression returns true, then survey will use html property to show on complete page.
    */
  var expression: String = js.native
  
  val locHtml: LocalizableString = js.native
  
  var locOwner: ILocalizableOwner = js.native
  
  def runCondition(values: js.Any, properties: js.Any): Boolean = js.native
}
