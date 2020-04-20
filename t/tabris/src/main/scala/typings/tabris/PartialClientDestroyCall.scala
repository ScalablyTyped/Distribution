package typings.tabris

import typings.tabris.tabrisStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientDestroyCall> */
trait PartialClientDestroyCall extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var op: js.UndefOr[destroy] = js.undefined
}

object PartialClientDestroyCall {
  @scala.inline
  def apply(id: String = null, op: destroy = null): PartialClientDestroyCall = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClientDestroyCall]
  }
}

