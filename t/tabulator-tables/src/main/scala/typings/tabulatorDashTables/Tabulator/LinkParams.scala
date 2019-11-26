package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkParams extends _FormatterParams {
  var download: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  // Link
  var labelField: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urlField: js.UndefOr[String] = js.undefined
  var urlPrefix: js.UndefOr[String] = js.undefined
}

object LinkParams {
  @scala.inline
  def apply(
    download: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelField: String = null,
    target: String = null,
    url: String = null,
    urlField: String = null,
    urlPrefix: String = null
  ): LinkParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelField != null) __obj.updateDynamic("labelField")(labelField.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlField != null) __obj.updateDynamic("urlField")(urlField.asInstanceOf[js.Any])
    if (urlPrefix != null) __obj.updateDynamic("urlPrefix")(urlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkParams]
  }
}

