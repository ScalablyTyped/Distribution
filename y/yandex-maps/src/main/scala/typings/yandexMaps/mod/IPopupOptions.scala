package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopupOptions extends js.Object {
  var closeTimeout: js.UndefOr[Double] = js.undefined
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  var openTimeout: js.UndefOr[Double] = js.undefined
  var pane: js.UndefOr[IPane | String] = js.undefined
  var projection: js.UndefOr[IProjection] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IPopupOptions {
  @scala.inline
  def apply(
    closeTimeout: js.UndefOr[Double] = js.undefined,
    interactivityModel: InteractivityModelKey = null,
    openTimeout: js.UndefOr[Double] = js.undefined,
    pane: IPane | String = null,
    projection: IProjection = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): IPopupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeTimeout)) __obj.updateDynamic("closeTimeout")(closeTimeout.get.asInstanceOf[js.Any])
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel.asInstanceOf[js.Any])
    if (!js.isUndefined(openTimeout)) __obj.updateDynamic("openTimeout")(openTimeout.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopupOptions]
  }
}

