package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBalloonOptions extends js.Object {
  var autoPan: js.UndefOr[scala.Boolean] = js.undefined
  var autoPanCheckZoomRange: js.UndefOr[scala.Boolean] = js.undefined
  var autoPanDuration: js.UndefOr[scala.Double] = js.undefined
  var autoPanMargin: js.UndefOr[js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double] = js.undefined
  var autoPanUseMapMargin: js.UndefOr[scala.Boolean] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var contentLayout: js.UndefOr[IClassConstructor[ILayout] | java.lang.String] = js.undefined
  var layout: js.UndefOr[IClassConstructor[ILayout] | java.lang.String] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var pane: js.UndefOr[java.lang.String] = js.undefined
  var panelContentLayout: js.UndefOr[IClassConstructor[ILayout] | java.lang.String] = js.undefined
  var panelMaxHeightRatio: js.UndefOr[scala.Double] = js.undefined
  var panelMaxMapArea: js.UndefOr[scala.Double] = js.undefined
  var shadow: js.UndefOr[scala.Boolean] = js.undefined
  var shadowLayout: js.UndefOr[IClassConstructor[ILayout] | java.lang.String] = js.undefined
  var shadowOffset: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object IBalloonOptions {
  @scala.inline
  def apply(
    autoPan: js.UndefOr[scala.Boolean] = js.undefined,
    autoPanCheckZoomRange: js.UndefOr[scala.Boolean] = js.undefined,
    autoPanDuration: scala.Int | scala.Double = null,
    autoPanMargin: js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double = null,
    autoPanUseMapMargin: js.UndefOr[scala.Boolean] = js.undefined,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    contentLayout: IClassConstructor[ILayout] | java.lang.String = null,
    layout: IClassConstructor[ILayout] | java.lang.String = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    offset: js.Array[scala.Double] = null,
    pane: java.lang.String = null,
    panelContentLayout: IClassConstructor[ILayout] | java.lang.String = null,
    panelMaxHeightRatio: scala.Int | scala.Double = null,
    panelMaxMapArea: scala.Int | scala.Double = null,
    shadow: js.UndefOr[scala.Boolean] = js.undefined,
    shadowLayout: IClassConstructor[ILayout] | java.lang.String = null,
    shadowOffset: js.Array[scala.Double] = null
  ): IBalloonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan)
    if (!js.isUndefined(autoPanCheckZoomRange)) __obj.updateDynamic("autoPanCheckZoomRange")(autoPanCheckZoomRange)
    if (autoPanDuration != null) __obj.updateDynamic("autoPanDuration")(autoPanDuration.asInstanceOf[js.Any])
    if (autoPanMargin != null) __obj.updateDynamic("autoPanMargin")(autoPanMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPanUseMapMargin)) __obj.updateDynamic("autoPanUseMapMargin")(autoPanUseMapMargin)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (contentLayout != null) __obj.updateDynamic("contentLayout")(contentLayout.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (panelContentLayout != null) __obj.updateDynamic("panelContentLayout")(panelContentLayout.asInstanceOf[js.Any])
    if (panelMaxHeightRatio != null) __obj.updateDynamic("panelMaxHeightRatio")(panelMaxHeightRatio.asInstanceOf[js.Any])
    if (panelMaxMapArea != null) __obj.updateDynamic("panelMaxMapArea")(panelMaxMapArea.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (shadowLayout != null) __obj.updateDynamic("shadowLayout")(shadowLayout.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset)
    __obj.asInstanceOf[IBalloonOptions]
  }
}

