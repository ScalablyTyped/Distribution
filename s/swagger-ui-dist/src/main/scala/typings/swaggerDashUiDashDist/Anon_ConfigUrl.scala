package typings.swaggerDashUiDashDist

import typings.swaggerDashUiDashDist.swaggerDashUiDashDistMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigUrl extends js.Object {
  var configUrl: js.UndefOr[String] = js.undefined
  var deepLinking: js.UndefOr[Boolean] = js.undefined
  var domNode: js.UndefOr[String] = js.undefined
  var dom_id: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[js.Any] = js.undefined
  var presets: js.UndefOr[js.Array[_]] = js.undefined
  var spec: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[Url]] = js.undefined
}

object Anon_ConfigUrl {
  @scala.inline
  def apply(
    configUrl: String = null,
    deepLinking: js.UndefOr[Boolean] = js.undefined,
    domNode: String = null,
    dom_id: String = null,
    layout: String = null,
    plugins: js.Any = null,
    presets: js.Array[_] = null,
    spec: js.Any = null,
    url: String = null,
    urls: js.Array[Url] = null
  ): Anon_ConfigUrl = {
    val __obj = js.Dynamic.literal()
    if (configUrl != null) __obj.updateDynamic("configUrl")(configUrl)
    if (!js.isUndefined(deepLinking)) __obj.updateDynamic("deepLinking")(deepLinking)
    if (domNode != null) __obj.updateDynamic("domNode")(domNode)
    if (dom_id != null) __obj.updateDynamic("dom_id")(dom_id)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (presets != null) __obj.updateDynamic("presets")(presets)
    if (spec != null) __obj.updateDynamic("spec")(spec)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[Anon_ConfigUrl]
  }
}

