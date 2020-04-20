package typings.toTitleCaseGouch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  def toTitleCase(): java.lang.String
}

object String {
  @scala.inline
  def apply(toTitleCase: () => java.lang.String): String = {
    val __obj = js.Dynamic.literal(toTitleCase = js.Any.fromFunction0(toTitleCase))
    __obj.asInstanceOf[String]
  }
}

