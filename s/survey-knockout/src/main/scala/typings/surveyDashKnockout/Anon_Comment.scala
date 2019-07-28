package typings.surveyDashKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  var comment: String
  var description: String
  var flowRoot: String
  var footer: String
  var hasError: String
  var indent: Double
  var mainRoot: String
  var number: String
  var required: String
  var title: String
  var titleLeftRoot: String
  var titleRequired: String
}

object Anon_Comment {
  @scala.inline
  def apply(
    comment: String,
    description: String,
    flowRoot: String,
    footer: String,
    hasError: String,
    indent: Double,
    mainRoot: String,
    number: String,
    required: String,
    title: String,
    titleLeftRoot: String,
    titleRequired: String
  ): Anon_Comment = {
    val __obj = js.Dynamic.literal(comment = comment, description = description, flowRoot = flowRoot, footer = footer, hasError = hasError, indent = indent, mainRoot = mainRoot, number = number, required = required, title = title, titleLeftRoot = titleLeftRoot, titleRequired = titleRequired)
  
    __obj.asInstanceOf[Anon_Comment]
  }
}

