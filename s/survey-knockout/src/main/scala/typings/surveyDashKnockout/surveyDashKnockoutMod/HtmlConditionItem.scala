package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "HtmlConditionItem")
@js.native
class HtmlConditionItem ()
  extends Base
     with ILocalizableOwner {
  def this(expression: String) = this()
  def this(expression: String, html: String) = this()
  /**
    * The expression property. If this expression returns true, then survey will use html property to show on complete page.
    */
  var expression: String = js.native
  /**
    * The html that shows on completed ('Thank you') page. The expression should return true
    * @see expression
    */
  var html: String = js.native
  val locHtml: LocalizableString = js.native
  var locOwner: ILocalizableOwner = js.native
  /* CompleteClass */
  override def getLocale(): String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: String): String = js.native
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  def runCondition(values: js.Any, properties: js.Any): Boolean = js.native
}

