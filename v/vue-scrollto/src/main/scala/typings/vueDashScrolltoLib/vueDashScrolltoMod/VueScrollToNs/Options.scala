package typings
package vueDashScrolltoLib.vueDashScrolltoMod.VueScrollToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // Indicates if user can cancel the scroll or not. Default: true
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  // The container that has to be scrolled. Default: body
  var container: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
  // The duration (in milliseconds) of the scrolling animation. Default: 500
  var duration: js.UndefOr[scala.Double] = js.undefined
  // The easing to be used when animating. Default: ease
  var easing: js.UndefOr[java.lang.String] = js.undefined
  // The element you want to scroll to.
  var el: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
  var element: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
  // The offset that should be applied when scrolling. Default: 0
  var offset: js.UndefOr[scala.Double] = js.undefined
  // A callback function that should be called when scrolling has been aborted by the user (user scrolled, clicked
  // etc.). Default: noop
  var onCancel: js.UndefOr[js.Function0[scala.Unit] | vueDashScrolltoLib.vueDashScrolltoLibNumbers.`false`] = js.undefined
  // A callback function that should be called when scrolling has ended. Default: noop
  var onDone: js.UndefOr[js.Function0[scala.Unit] | vueDashScrolltoLib.vueDashScrolltoLibNumbers.`false`] = js.undefined
  // Whether or not we want scrolling on the x axis. Default: true
  var x: js.UndefOr[scala.Boolean] = js.undefined
  // Whether or not we want scrolling on the y axis. Default: true
  var y: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String | stdLib.Element = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    el: java.lang.String | stdLib.Element = null,
    element: java.lang.String | stdLib.Element = null,
    offset: scala.Int | scala.Double = null,
    onCancel: js.Function0[scala.Unit] | vueDashScrolltoLib.vueDashScrolltoLibNumbers.`false` = null,
    onDone: js.Function0[scala.Unit] | vueDashScrolltoLib.vueDashScrolltoLibNumbers.`false` = null,
    x: js.UndefOr[scala.Boolean] = js.undefined,
    y: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel.asInstanceOf[js.Any])
    if (onDone != null) __obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x)
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Options]
  }
}

