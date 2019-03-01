package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  var comment: java.lang.String
  var description: java.lang.String
  var flowRoot: java.lang.String
  var footer: java.lang.String
  var hasError: java.lang.String
  var indent: scala.Double
  var mainRoot: java.lang.String
  var number: java.lang.String
  var required: java.lang.String
  var title: java.lang.String
  var titleLeftRoot: java.lang.String
  var titleRequired: java.lang.String
}

object Anon_Comment {
  @scala.inline
  def apply(
    comment: java.lang.String,
    description: java.lang.String,
    flowRoot: java.lang.String,
    footer: java.lang.String,
    hasError: java.lang.String,
    indent: scala.Double,
    mainRoot: java.lang.String,
    number: java.lang.String,
    required: java.lang.String,
    title: java.lang.String,
    titleLeftRoot: java.lang.String,
    titleRequired: java.lang.String
  ): Anon_Comment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("flowRoot")(flowRoot)
    __obj.updateDynamic("footer")(footer)
    __obj.updateDynamic("hasError")(hasError)
    __obj.updateDynamic("indent")(indent)
    __obj.updateDynamic("mainRoot")(mainRoot)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titleLeftRoot")(titleLeftRoot)
    __obj.updateDynamic("titleRequired")(titleRequired)
    __obj.asInstanceOf[Anon_Comment]
  }
}

