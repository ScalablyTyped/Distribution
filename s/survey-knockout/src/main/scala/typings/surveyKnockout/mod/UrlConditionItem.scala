package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "UrlConditionItem")
@js.native
open class UrlConditionItem () extends ExpressionItem {
  def this(expression: String) = this()
  def this(expression: String, url: String) = this()
  def this(expression: Unit, url: String) = this()
  
  def locUrl: LocalizableString = js.native
  
  /*
    * The url that survey navigates to on completing the survey. The expression should return true
    */
  def url: String = js.native
  def url_=(`val`: String): Unit = js.native
}
