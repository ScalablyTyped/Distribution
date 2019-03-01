package typings
package xssLib.XSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICSSFilter extends js.Object {
  def process(value: java.lang.String): java.lang.String
}

object ICSSFilter {
  @scala.inline
  def apply(process: js.Function1[java.lang.String, java.lang.String]): ICSSFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[ICSSFilter]
  }
}

