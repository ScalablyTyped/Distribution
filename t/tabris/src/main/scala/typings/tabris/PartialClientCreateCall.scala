package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientCreateCall> */
trait PartialClientCreateCall extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var op: js.UndefOr[create] = js.undefined
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PartialClientCreateCall {
  @scala.inline
  def apply(
    id: String = null,
    op: create = null,
    properties: StringDictionary[js.Any] = null,
    `type`: String = null
  ): PartialClientCreateCall = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClientCreateCall]
  }
}

