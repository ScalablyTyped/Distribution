package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Increment extends js.Object {
  var increment: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Increment {
  @scala.inline
  def apply(increment: scala.Int | scala.Double = null, message: java.lang.String = null): Anon_Increment = {
    val __obj = js.Dynamic.literal()
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Increment]
  }
}

