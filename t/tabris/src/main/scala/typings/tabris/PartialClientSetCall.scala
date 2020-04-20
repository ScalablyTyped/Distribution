package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientSetCall> */
trait PartialClientSetCall extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var op: js.UndefOr[set] = js.undefined
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object PartialClientSetCall {
  @scala.inline
  def apply(id: String = null, op: set = null, properties: StringDictionary[js.Any] = null): PartialClientSetCall = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClientSetCall]
  }
}

