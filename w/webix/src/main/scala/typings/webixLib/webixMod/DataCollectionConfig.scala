package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCollectionConfig extends js.Object {
  var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  var dataFeed: js.UndefOr[java.lang.String | WebixCallback] = js.undefined
  var datathrottle: js.UndefOr[scala.Double] = js.undefined
  var datatype: js.UndefOr[java.lang.String] = js.undefined
  var defaultData: js.UndefOr[js.Any] = js.undefined
  var externalData: js.UndefOr[WebixCallback] = js.undefined
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var map: js.UndefOr[js.Any] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var ready: js.UndefOr[WebixCallback] = js.undefined
  var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var save: js.UndefOr[java.lang.String] = js.undefined
  var scheme: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object DataCollectionConfig {
  @scala.inline
  def apply(
    data: java.lang.String | js.Array[_] = null,
    dataFeed: java.lang.String | WebixCallback = null,
    datathrottle: scala.Int | scala.Double = null,
    datatype: java.lang.String = null,
    defaultData: js.Any = null,
    externalData: WebixCallback = null,
    id: java.lang.String | scala.Double = null,
    map: js.Any = null,
    on: EventHash = null,
    ready: WebixCallback = null,
    removeMissed: js.UndefOr[scala.Boolean] = js.undefined,
    rules: js.Any = null,
    save: java.lang.String = null,
    scheme: js.Any = null,
    url: js.Any = null,
    view: java.lang.String = null
  ): DataCollectionConfig = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFeed != null) __obj.updateDynamic("dataFeed")(dataFeed.asInstanceOf[js.Any])
    if (datathrottle != null) __obj.updateDynamic("datathrottle")(datathrottle.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (defaultData != null) __obj.updateDynamic("defaultData")(defaultData)
    if (externalData != null) __obj.updateDynamic("externalData")(externalData)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (on != null) __obj.updateDynamic("on")(on)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (!js.isUndefined(removeMissed)) __obj.updateDynamic("removeMissed")(removeMissed)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (save != null) __obj.updateDynamic("save")(save)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (url != null) __obj.updateDynamic("url")(url)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[DataCollectionConfig]
  }
}

