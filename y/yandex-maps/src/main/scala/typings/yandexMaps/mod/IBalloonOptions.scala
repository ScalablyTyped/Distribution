package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBalloonOptions extends js.Object {
  var autoPan: js.UndefOr[Boolean] = js.undefined
  var autoPanCheckZoomRange: js.UndefOr[Boolean] = js.undefined
  var autoPanDuration: js.UndefOr[Double] = js.undefined
  var autoPanMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  var autoPanUseMapMargin: js.UndefOr[Boolean] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var contentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  var layout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var panelContentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  var panelMaxHeightRatio: js.UndefOr[Double] = js.undefined
  var panelMaxMapArea: js.UndefOr[Double] = js.undefined
  var shadow: js.UndefOr[Boolean] = js.undefined
  var shadowLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  var shadowOffset: js.UndefOr[js.Array[Double]] = js.undefined
}

object IBalloonOptions {
  @scala.inline
  def apply(
    autoPan: js.UndefOr[Boolean] = js.undefined,
    autoPanCheckZoomRange: js.UndefOr[Boolean] = js.undefined,
    autoPanDuration: js.UndefOr[Double] = js.undefined,
    autoPanMargin: (js.Array[js.Array[Double] | Double]) | Double = null,
    autoPanUseMapMargin: js.UndefOr[Boolean] = js.undefined,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    contentLayout: IClassConstructor[ILayout] | String = null,
    layout: IClassConstructor[ILayout] | String = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    offset: js.Array[Double] = null,
    pane: String = null,
    panelContentLayout: IClassConstructor[ILayout] | String = null,
    panelMaxHeightRatio: js.UndefOr[Double] = js.undefined,
    panelMaxMapArea: js.UndefOr[Double] = js.undefined,
    shadow: js.UndefOr[Boolean] = js.undefined,
    shadowLayout: IClassConstructor[ILayout] | String = null,
    shadowOffset: js.Array[Double] = null
  ): IBalloonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPanCheckZoomRange)) __obj.updateDynamic("autoPanCheckZoomRange")(autoPanCheckZoomRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPanDuration)) __obj.updateDynamic("autoPanDuration")(autoPanDuration.get.asInstanceOf[js.Any])
    if (autoPanMargin != null) __obj.updateDynamic("autoPanMargin")(autoPanMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPanUseMapMargin)) __obj.updateDynamic("autoPanUseMapMargin")(autoPanUseMapMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (contentLayout != null) __obj.updateDynamic("contentLayout")(contentLayout.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (panelContentLayout != null) __obj.updateDynamic("panelContentLayout")(panelContentLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(panelMaxHeightRatio)) __obj.updateDynamic("panelMaxHeightRatio")(panelMaxHeightRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(panelMaxMapArea)) __obj.updateDynamic("panelMaxMapArea")(panelMaxMapArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.get.asInstanceOf[js.Any])
    if (shadowLayout != null) __obj.updateDynamic("shadowLayout")(shadowLayout.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBalloonOptions]
  }
}

