package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "HtmlConditionItem")
@js.native
open class HtmlConditionItem () extends ExpressionItem {
  def this(expression: String) = this()
  def this(expression: String, html: String) = this()
  def this(expression: Unit, html: String) = this()
  
  /*
    * The html that shows on completed ('Thank you') page. The expression should return true
    */
  def html: String = js.native
  def html_=(`val`: String): Unit = js.native
}
