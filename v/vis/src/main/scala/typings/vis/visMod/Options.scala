package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoResize: js.UndefOr[Boolean] = js.undefined
  var clickToUse: js.UndefOr[Boolean] = js.undefined
  var configure: js.UndefOr[js.Any] = js.undefined
   // http://visjs.org/docs/network/configure.html#
  var edges: js.UndefOr[EdgeOptions] = js.undefined
  var groups: js.UndefOr[js.Any] = js.undefined
  var height: js.UndefOr[String] = js.undefined
   // http://visjs.org/docs/network/layout.html
  var interaction: js.UndefOr[js.Any] = js.undefined
  var layout: js.UndefOr[js.Any] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var locales: js.UndefOr[Locales] = js.undefined
   // visjs.org/docs/network/interaction.html?keywords=edges
  var manipulation: js.UndefOr[js.Any] = js.undefined
  var nodes: js.UndefOr[NodeOptions] = js.undefined
   // http://visjs.org/docs/network/manipulation.html#
  var physics: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoResize: js.UndefOr[Boolean] = js.undefined,
    clickToUse: js.UndefOr[Boolean] = js.undefined,
    configure: js.Any = null,
    edges: EdgeOptions = null,
    groups: js.Any = null,
    height: String = null,
    interaction: js.Any = null,
    layout: js.Any = null,
    locale: String = null,
    locales: Locales = null,
    manipulation: js.Any = null,
    nodes: NodeOptions = null,
    physics: js.Any = null,
    width: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (!js.isUndefined(clickToUse)) __obj.updateDynamic("clickToUse")(clickToUse)
    if (configure != null) __obj.updateDynamic("configure")(configure)
    if (edges != null) __obj.updateDynamic("edges")(edges)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (height != null) __obj.updateDynamic("height")(height)
    if (interaction != null) __obj.updateDynamic("interaction")(interaction)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (locales != null) __obj.updateDynamic("locales")(locales)
    if (manipulation != null) __obj.updateDynamic("manipulation")(manipulation)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (physics != null) __obj.updateDynamic("physics")(physics)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Options]
  }
}

