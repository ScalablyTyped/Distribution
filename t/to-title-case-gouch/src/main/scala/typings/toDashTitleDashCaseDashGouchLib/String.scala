package typings
package toDashTitleDashCaseDashGouchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  def toTitleCase(): java.lang.String
}

object String {
  @scala.inline
  def apply(toTitleCase: js.Function0[java.lang.String]): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toTitleCase")(toTitleCase)
    __obj.asInstanceOf[String]
  }
}

