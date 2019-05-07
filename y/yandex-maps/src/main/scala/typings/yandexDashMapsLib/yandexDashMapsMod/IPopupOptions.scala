package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopupOptions extends js.Object {
  var closeTimeout: js.UndefOr[scala.Double] = js.undefined
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  var openTimeout: js.UndefOr[scala.Double] = js.undefined
  var pane: js.UndefOr[IPane | java.lang.String] = js.undefined
  var projection: js.UndefOr[IProjection] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object IPopupOptions {
  @scala.inline
  def apply(
    closeTimeout: scala.Int | scala.Double = null,
    interactivityModel: InteractivityModelKey = null,
    openTimeout: scala.Int | scala.Double = null,
    pane: IPane | java.lang.String = null,
    projection: IProjection = null,
    zIndex: scala.Int | scala.Double = null
  ): IPopupOptions = {
    val __obj = js.Dynamic.literal()
    if (closeTimeout != null) __obj.updateDynamic("closeTimeout")(closeTimeout.asInstanceOf[js.Any])
    if (interactivityModel != null) __obj.updateDynamic("interactivityModel")(interactivityModel.asInstanceOf[js.Any])
    if (openTimeout != null) __obj.updateDynamic("openTimeout")(openTimeout.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopupOptions]
  }
}

