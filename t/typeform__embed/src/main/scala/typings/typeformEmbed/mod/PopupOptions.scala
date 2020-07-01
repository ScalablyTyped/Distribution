package typings.typeformEmbed.mod

import typings.std.HTMLElement
import typings.typeformEmbed.typeformEmbedStrings.drawer_left
import typings.typeformEmbed.typeformEmbedStrings.drawer_right
import typings.typeformEmbed.typeformEmbedStrings.exit
import typings.typeformEmbed.typeformEmbedStrings.load
import typings.typeformEmbed.typeformEmbedStrings.popover
import typings.typeformEmbed.typeformEmbedStrings.popup
import typings.typeformEmbed.typeformEmbedStrings.scroll
import typings.typeformEmbed.typeformEmbedStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends js.Object {
  var autoClose: js.UndefOr[Double] = js.undefined
  /**
    * @deprecated Use `open: 'load'` instead
    */
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[HTMLElement] = js.undefined
  var disableTracking: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated Use `width` instead
    */
  var drawerWidth: js.UndefOr[Double] = js.undefined
  /**
    * Specify the height of the popup (only applies if using mode "popover")
    */
  var height: js.UndefOr[Double] = js.undefined
  var hideFooter: js.UndefOr[Boolean] = js.undefined
  var hideHeaders: js.UndefOr[Boolean] = js.undefined
  var hideScrollbars: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[popup | drawer_left | drawer_right | popover] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* event */ OnSubmitEvent, Unit]] = js.undefined
  /**
    * Launch based on behavioral triggers
    */
  var open: js.UndefOr[exit | load | scroll | time] = js.undefined
  /**
    * Configuration for behavioral triggers. Based on open:
    *   - `exit`: exit threshold in pixels
    *   - `scroll`: % of page scrolled
    *   - `time`: time in milliseconds
    */
  var openValue: js.UndefOr[Double] = js.undefined
  /**
    * Specify the width of the drawer or popup (only applies if using mode
    * "drawer_left" or "drawer_right" or "popover")
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Double] = js.undefined,
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    container: HTMLElement = null,
    disableTracking: js.UndefOr[Boolean] = js.undefined,
    drawerWidth: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hideFooter: js.UndefOr[Boolean] = js.undefined,
    hideHeaders: js.UndefOr[Boolean] = js.undefined,
    hideScrollbars: js.UndefOr[Boolean] = js.undefined,
    mode: popup | drawer_left | drawer_right | popover = null,
    onClose: () => Unit = null,
    onReady: () => Unit = null,
    onSubmit: /* event */ OnSubmitEvent => Unit = null,
    open: exit | load | scroll | time = null,
    openValue: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTracking)) __obj.updateDynamic("disableTracking")(disableTracking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawerWidth)) __obj.updateDynamic("drawerWidth")(drawerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFooter)) __obj.updateDynamic("hideFooter")(hideFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideHeaders)) __obj.updateDynamic("hideHeaders")(hideHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideScrollbars)) __obj.updateDynamic("hideScrollbars")(hideScrollbars.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(openValue)) __obj.updateDynamic("openValue")(openValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupOptions]
  }
}

