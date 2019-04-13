package typings
package terminalDashKitLib.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarOptions extends js.Object {
  var barBracketStyle: js.UndefOr[CTerminal] = js.undefined
  var barChar: js.UndefOr[java.lang.String] = js.undefined
  var barHeadChar: js.UndefOr[java.lang.String] = js.undefined
  var barStyle: js.UndefOr[CTerminal] = js.undefined
  var eta: js.UndefOr[scala.Boolean] = js.undefined
  var etaStyle: js.UndefOr[CTerminal] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var itemSize: js.UndefOr[scala.Double] = js.undefined
  var itemStyle: js.UndefOr[CTerminal] = js.undefined
  var items: js.UndefOr[scala.Double] = js.undefined
  var maxRefreshTime: js.UndefOr[scala.Double] = js.undefined
  var minRefreshTime: js.UndefOr[scala.Double] = js.undefined
  var percent: js.UndefOr[scala.Boolean] = js.undefined
  var percentStyle: js.UndefOr[CTerminal] = js.undefined
  var syncMode: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleSize: js.UndefOr[scala.Double] = js.undefined
  var titleStyle: js.UndefOr[CTerminal] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ProgressBarOptions {
  @scala.inline
  def apply(
    barBracketStyle: CTerminal = null,
    barChar: java.lang.String = null,
    barHeadChar: java.lang.String = null,
    barStyle: CTerminal = null,
    eta: js.UndefOr[scala.Boolean] = js.undefined,
    etaStyle: CTerminal = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    itemSize: scala.Int | scala.Double = null,
    itemStyle: CTerminal = null,
    items: scala.Int | scala.Double = null,
    maxRefreshTime: scala.Int | scala.Double = null,
    minRefreshTime: scala.Int | scala.Double = null,
    percent: js.UndefOr[scala.Boolean] = js.undefined,
    percentStyle: CTerminal = null,
    syncMode: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    titleSize: scala.Int | scala.Double = null,
    titleStyle: CTerminal = null,
    width: scala.Int | scala.Double = null
  ): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    if (barBracketStyle != null) __obj.updateDynamic("barBracketStyle")(barBracketStyle)
    if (barChar != null) __obj.updateDynamic("barChar")(barChar)
    if (barHeadChar != null) __obj.updateDynamic("barHeadChar")(barHeadChar)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle)
    if (!js.isUndefined(eta)) __obj.updateDynamic("eta")(eta)
    if (etaStyle != null) __obj.updateDynamic("etaStyle")(etaStyle)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (itemSize != null) __obj.updateDynamic("itemSize")(itemSize.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (maxRefreshTime != null) __obj.updateDynamic("maxRefreshTime")(maxRefreshTime.asInstanceOf[js.Any])
    if (minRefreshTime != null) __obj.updateDynamic("minRefreshTime")(minRefreshTime.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent)
    if (percentStyle != null) __obj.updateDynamic("percentStyle")(percentStyle)
    if (!js.isUndefined(syncMode)) __obj.updateDynamic("syncMode")(syncMode)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleSize != null) __obj.updateDynamic("titleSize")(titleSize.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

