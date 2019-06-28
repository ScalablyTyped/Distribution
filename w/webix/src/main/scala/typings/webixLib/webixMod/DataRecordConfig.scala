package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRecordConfig extends js.Object {
  var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  var dataFeed: js.UndefOr[java.lang.String | WebixCallback] = js.undefined
  var datatype: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object DataRecordConfig {
  @scala.inline
  def apply(
    data: java.lang.String | js.Array[_] = null,
    dataFeed: java.lang.String | WebixCallback = null,
    datatype: java.lang.String = null,
    id: java.lang.String | scala.Double = null,
    on: EventHash = null,
    url: js.Any = null,
    view: java.lang.String = null
  ): DataRecordConfig = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFeed != null) __obj.updateDynamic("dataFeed")(dataFeed.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (url != null) __obj.updateDynamic("url")(url)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[DataRecordConfig]
  }
}

