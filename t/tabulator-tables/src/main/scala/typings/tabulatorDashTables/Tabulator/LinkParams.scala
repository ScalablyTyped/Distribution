package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkParams extends _FormatterParams {
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
    label: String = null,
    labelField: String = null,
    target: String = null,
    url: String = null,
    urlField: String = null,
    urlPrefix: String = null
  ): LinkParams = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelField != null) __obj.updateDynamic("labelField")(labelField)
    if (target != null) __obj.updateDynamic("target")(target)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urlField != null) __obj.updateDynamic("urlField")(urlField)
    if (urlPrefix != null) __obj.updateDynamic("urlPrefix")(urlPrefix)
    __obj.asInstanceOf[LinkParams]
  }
}

