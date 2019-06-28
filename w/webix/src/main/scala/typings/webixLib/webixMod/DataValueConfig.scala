package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataValueConfig extends js.Object {
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object DataValueConfig {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double = null,
    on: EventHash = null,
    value: java.lang.String | scala.Double = null,
    view: java.lang.String = null
  ): DataValueConfig = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[DataValueConfig]
  }
}

