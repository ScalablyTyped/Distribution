package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Begin extends js.Object {
  var begin: js.UndefOr[js.Any] = js.undefined
  var end: js.UndefOr[js.Any] = js.undefined
}

object Anon_Begin {
  @scala.inline
  def apply(begin: js.Any = null, end: js.Any = null): Anon_Begin = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (end != null) __obj.updateDynamic("end")(end)
    __obj.asInstanceOf[Anon_Begin]
  }
}

