package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeCollectionConfig extends js.Object {
  var data: js.UndefOr[String | js.Array[_]] = js.undefined
  var datathrottle: js.UndefOr[Double] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultData: js.UndefOr[js.Any] = js.undefined
  var externalData: js.UndefOr[WebixCallback] = js.undefined
  var filterMode: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var map: js.UndefOr[js.Any] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var ready: js.UndefOr[WebixCallback] = js.undefined
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var save: js.UndefOr[js.Any] = js.undefined
  var scheme: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object TreeCollectionConfig {
  @scala.inline
  def apply(
    data: String | js.Array[_] = null,
    datathrottle: Int | Double = null,
    datatype: String = null,
    defaultData: js.Any = null,
    externalData: /* repeated */ js.Any => js.Any = null,
    filterMode: js.Any = null,
    id: String | Double = null,
    map: js.Any = null,
    on: EventHash = null,
    ready: /* repeated */ js.Any => js.Any = null,
    removeMissed: js.UndefOr[Boolean] = js.undefined,
    rules: js.Any = null,
    save: js.Any = null,
    scheme: js.Any = null,
    url: js.Any = null,
    view: String = null
  ): TreeCollectionConfig = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datathrottle != null) __obj.updateDynamic("datathrottle")(datathrottle.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (defaultData != null) __obj.updateDynamic("defaultData")(defaultData)
    if (externalData != null) __obj.updateDynamic("externalData")(js.Any.fromFunction1(externalData))
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (on != null) __obj.updateDynamic("on")(on)
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(removeMissed)) __obj.updateDynamic("removeMissed")(removeMissed)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (save != null) __obj.updateDynamic("save")(save)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (url != null) __obj.updateDynamic("url")(url)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[TreeCollectionConfig]
  }
}

