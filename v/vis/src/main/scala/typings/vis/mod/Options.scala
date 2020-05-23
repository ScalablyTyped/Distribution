package typings.vis.mod

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
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToUse)) __obj.updateDynamic("clickToUse")(clickToUse.get.asInstanceOf[js.Any])
    if (configure != null) __obj.updateDynamic("configure")(configure.asInstanceOf[js.Any])
    if (edges != null) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interaction != null) __obj.updateDynamic("interaction")(interaction.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (manipulation != null) __obj.updateDynamic("manipulation")(manipulation.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (physics != null) __obj.updateDynamic("physics")(physics.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

