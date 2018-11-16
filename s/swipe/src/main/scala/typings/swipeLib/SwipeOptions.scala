package typings
package swipeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SwipeOptions extends js.Object {
  var auto: js.UndefOr[scala.Double] = js.undefined
  var callback: js.UndefOr[
    js.Function2[/* index */ scala.Double, /* elem */ stdLib.HTMLElement, scala.Unit]
  ] = js.undefined
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
  var disableScroll: js.UndefOr[scala.Boolean] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var startSlide: js.UndefOr[scala.Double] = js.undefined
  var stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  var transitionEnd: js.UndefOr[
    js.Function2[/* index */ scala.Double, /* elem */ stdLib.HTMLElement, scala.Unit]
  ] = js.undefined
}

