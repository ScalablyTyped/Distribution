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

