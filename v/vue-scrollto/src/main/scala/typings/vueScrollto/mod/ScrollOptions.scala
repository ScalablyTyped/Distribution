package typings.vueScrollto.mod

import typings.std.Element
import typings.std.Event
import typings.vueScrollto.vueScrolltoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollOptions extends js.Object {
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[ElementDescriptor] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String | (js.Tuple4[Double, Double, Double, Double])] = js.undefined
  var el: js.UndefOr[ElementDescriptor] = js.undefined
  var element: js.UndefOr[ElementDescriptor] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[
    Double | (js.Function2[/* element */ ElementDescriptor, /* container */ ElementDescriptor, Double])
  ] = js.undefined
  var onCancel: js.UndefOr[(js.Function2[/* event */ Event, /* element */ Element, _]) | `false`] = js.undefined
  var onDone: js.UndefOr[(js.Function1[/* element */ Element, _]) | `false`] = js.undefined
  var onStart: js.UndefOr[(js.Function1[/* element */ Element, _]) | `false`] = js.undefined
  var x: js.UndefOr[Boolean] = js.undefined
  var y: js.UndefOr[Boolean] = js.undefined
}

object ScrollOptions {
  @scala.inline
  def apply(
    cancelable: js.UndefOr[Boolean] = js.undefined,
    container: ElementDescriptor = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: String | (js.Tuple4[Double, Double, Double, Double]) = null,
    el: ElementDescriptor = null,
    element: ElementDescriptor = null,
    force: js.UndefOr[Boolean] = js.undefined,
    offset: Double | (js.Function2[/* element */ ElementDescriptor, /* container */ ElementDescriptor, Double]) = null,
    onCancel: (js.Function2[/* event */ Event, /* element */ Element, _]) | `false` = null,
    onDone: (js.Function1[/* element */ Element, _]) | `false` = null,
    onStart: (js.Function1[/* element */ Element, _]) | `false` = null,
    x: js.UndefOr[Boolean] = js.undefined,
    y: js.UndefOr[Boolean] = js.undefined
  ): ScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel.asInstanceOf[js.Any])
    if (onDone != null) __obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
    if (onStart != null) __obj.updateDynamic("onStart")(onStart.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOptions]
  }
}

