package typings.tabris

import typings.tabris.tabrisStrings.get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientGetCall> */
trait PartialClientGetCall extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var op: js.UndefOr[get] = js.undefined
  var property: js.UndefOr[String] = js.undefined
}

object PartialClientGetCall {
  @scala.inline
  def apply(id: String = null, op: get = null, property: String = null): PartialClientGetCall = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClientGetCall]
  }
}

