package typings.typeformEmbed.mod

import typings.std.HTMLElement
import typings.typeformEmbed.typeformEmbedStrings.drawer_left
import typings.typeformEmbed.typeformEmbedStrings.drawer_right
import typings.typeformEmbed.typeformEmbedStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends js.Object {
  var autoClose: js.UndefOr[Double] = js.undefined
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[HTMLElement] = js.undefined
  var disableTracking: js.UndefOr[Boolean] = js.undefined
  var drawerWidth: js.UndefOr[Double] = js.undefined
  var hideFooter: js.UndefOr[Boolean] = js.undefined
  var hideHeaders: js.UndefOr[Boolean] = js.undefined
  var hideScrollbars: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[popup | drawer_left | drawer_right] = js.undefined
  var onSubmit: js.UndefOr[js.Function0[_]] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Double] = js.undefined,
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    container: HTMLElement = null,
    disableTracking: js.UndefOr[Boolean] = js.undefined,
    drawerWidth: js.UndefOr[Double] = js.undefined,
    hideFooter: js.UndefOr[Boolean] = js.undefined,
    hideHeaders: js.UndefOr[Boolean] = js.undefined,
    hideScrollbars: js.UndefOr[Boolean] = js.undefined,
    mode: popup | drawer_left | drawer_right = null,
    onSubmit: () => _ = null
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTracking)) __obj.updateDynamic("disableTracking")(disableTracking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawerWidth)) __obj.updateDynamic("drawerWidth")(drawerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFooter)) __obj.updateDynamic("hideFooter")(hideFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideHeaders)) __obj.updateDynamic("hideHeaders")(hideHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideScrollbars)) __obj.updateDynamic("hideScrollbars")(hideScrollbars.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction0(onSubmit))
    __obj.asInstanceOf[PopupOptions]
  }
}

