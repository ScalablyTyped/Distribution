package typings.triplesec.triplesecMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arguments extends js.Object {
  var data: Buffer
  var key: Buffer
  var progress_hook: js.UndefOr[js.Function1[/* progress */ Progress, Unit]] = js.undefined
}

object Arguments {
  @scala.inline
  def apply(data: Buffer, key: Buffer, progress_hook: /* progress */ Progress => Unit = null): Arguments = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (progress_hook != null) __obj.updateDynamic("progress_hook")(js.Any.fromFunction1(progress_hook))
    __obj.asInstanceOf[Arguments]
  }
}

