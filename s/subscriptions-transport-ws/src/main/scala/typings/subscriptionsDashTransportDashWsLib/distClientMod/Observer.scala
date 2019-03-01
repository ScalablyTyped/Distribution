package typings
package subscriptionsDashTransportDashWsLib.distClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ nodeLib.Error, scala.Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](
    complete: js.Function0[scala.Unit] = null,
    error: js.Function1[/* error */ nodeLib.Error, scala.Unit] = null,
    next: js.Function1[/* value */ T, scala.Unit] = null
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (error != null) __obj.updateDynamic("error")(error)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Observer[T]]
  }
}

