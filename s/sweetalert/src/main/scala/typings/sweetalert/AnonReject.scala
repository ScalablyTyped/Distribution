package typings.sweetalert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReject extends js.Object {
  var reject: js.UndefOr[js.Function0[Unit]] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
}

object AnonReject {
  @scala.inline
  def apply(reject: () => Unit = null, resolve: /* value */ String => Unit = null): AnonReject = {
    val __obj = js.Dynamic.literal()
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction0(reject))
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[AnonReject]
  }
}

