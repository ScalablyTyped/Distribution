package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "HtmlConditionItem")
@js.native
class HtmlConditionItem ()
  extends Base
     with ILocalizableOwner {
  def this(expression: java.lang.String) = this()
  def this(expression: java.lang.String, html: java.lang.String) = this()
  /**
    * The expression property. If this expression returns true, then survey will use html property to show on complete page.
    */
  var expression: java.lang.String = js.native
  /**
    * The html that shows on completed ('Thank you') page. The expression should return true
    * @see expression
    */
  var html: java.lang.String = js.native
  val locHtml: LocalizableString = js.native
  var locOwner: ILocalizableOwner = js.native
  /* CompleteClass */
  override def getLocale(): java.lang.String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getProcessedText(text: java.lang.String): java.lang.String = js.native
  def runCondition(values: js.Any, properties: js.Any): scala.Boolean = js.native
}

