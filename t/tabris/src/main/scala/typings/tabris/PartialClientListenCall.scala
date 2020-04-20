package typings.tabris

import typings.tabris.tabrisStrings.listen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientListenCall> */
trait PartialClientListenCall extends js.Object {
  var event: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var listen: js.UndefOr[Boolean] = js.undefined
  var op: js.UndefOr[listen] = js.undefined
}

object PartialClientListenCall {
  @scala.inline
  def apply(
    event: String = null,
    id: String = null,
    listen: js.UndefOr[Boolean] = js.undefined,
    op: listen = null
  ): PartialClientListenCall = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(listen)) __obj.updateDynamic("listen")(listen.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClientListenCall]
  }
}

