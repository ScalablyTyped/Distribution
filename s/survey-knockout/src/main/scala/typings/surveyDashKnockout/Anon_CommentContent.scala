package typings.surveyDashKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentContent extends js.Object {
  var comment: String
  var content: String
  var contentLeft: String
  var description: String
  var flowRoot: String
  var hasError: String
  var header: String
  var headerLeft: String
  var indent: Double
  var mainRoot: String
  var number: String
  var required: String
  var title: String
  var titleLeftRoot: String
  var titleRequired: String
}

object Anon_CommentContent {
  @scala.inline
  def apply(
    comment: String,
    content: String,
    contentLeft: String,
    description: String,
    flowRoot: String,
    hasError: String,
    header: String,
    headerLeft: String,
    indent: Double,
    mainRoot: String,
    number: String,
    required: String,
    title: String,
    titleLeftRoot: String,
    titleRequired: String
  ): Anon_CommentContent = {
    val __obj = js.Dynamic.literal(comment = comment, content = content, contentLeft = contentLeft, description = description, flowRoot = flowRoot, hasError = hasError, header = header, headerLeft = headerLeft, indent = indent, mainRoot = mainRoot, number = number, required = required, title = title, titleLeftRoot = titleLeftRoot, titleRequired = titleRequired)
  
    __obj.asInstanceOf[Anon_CommentContent]
  }
}

