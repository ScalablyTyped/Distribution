package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseNotIn extends js.Object {
  var close: java.lang.String
  var notIn: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var open: java.lang.String
}

object Anon_CloseNotIn {
  @scala.inline
  def apply(close: java.lang.String, open: java.lang.String, notIn: js.Array[java.lang.String] = null): Anon_CloseNotIn = {
    val __obj = js.Dynamic.literal(close = close, open = open)
    if (notIn != null) __obj.updateDynamic("notIn")(notIn)
    __obj.asInstanceOf[Anon_CloseNotIn]
  }
}

