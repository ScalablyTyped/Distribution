package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* CompleteClass */
  override def getLocale(): String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: String): String = js.native
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  def runCondition(values: js.Any, properties: js.Any): Boolean = js.native
}

