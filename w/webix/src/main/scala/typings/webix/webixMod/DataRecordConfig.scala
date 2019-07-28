package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRecordConfig extends js.Object {
  var data: js.UndefOr[String | js.Array[_]] = js.undefined
  var dataFeed: js.UndefOr[String | WebixCallback] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object DataRecordConfig {
  @scala.inline
  def apply(
    data: String | js.Array[_] = null,
    dataFeed: String | WebixCallback = null,
    datatype: String = null,
    id: String | Double = null,
    on: EventHash = null,
    url: js.Any = null,
    view: String = null
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

