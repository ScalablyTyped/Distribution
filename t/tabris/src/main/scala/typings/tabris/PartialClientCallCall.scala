package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientCallCall> */
trait PartialClientCallCall extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var op: js.UndefOr[call] = js.undefined
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object PartialClientCallCall {
  @scala.inline
  def apply(
    id: String = null,
    method: String = null,
    op: call = null,
    parameters: StringDictionary[js.Any] = null
  ): PartialClientCallCall = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClientCallCall]
  }
}

