package typings.vanillaSwipe.typesMod

import typings.std.Event_
import typings.std.HTMLElement
import typings.vanillaSwipe.vanillaSwipeNumbers.`0`
import typings.vanillaSwipe.vanillaSwipeNumbers.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorProps extends js.Object {
  var delta: js.UndefOr[Double | `10`] = js.undefined
  var element: js.UndefOr[HTMLElement | Null] = js.undefined
  var mouseTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  var onSwiped: js.UndefOr[EventHandler] = js.undefined
  var onSwiping: js.UndefOr[EventHandler] = js.undefined
  var onTap: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined
  var rotationAngle: js.UndefOr[Double | `0`] = js.undefined
  var touchTrackingEnabled: js.UndefOr[Boolean] = js.undefined
}

object ConstructorProps {
  @scala.inline
  def apply(
    delta: Double | `10` = null,
    element: HTMLElement = null,
    mouseTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    onSwiped: (/* e */ Event_, /* deltaX */ Double, /* deltaY */ Double, /* absX */ Double, /* absY */ Double, /* duration */ Double) => Unit = null,
    onSwiping: (/* e */ Event_, /* deltaX */ Double, /* deltaY */ Double, /* absX */ Double, /* absY */ Double, /* duration */ Double) => Unit = null,
    onTap: /* e */ Event_ => Unit = null,
    preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined,
    rotationAngle: Double | `0` = null,
    touchTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  ): ConstructorProps = {
    val __obj = js.Dynamic.literal()
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseTrackingEnabled)) __obj.updateDynamic("mouseTrackingEnabled")(mouseTrackingEnabled.asInstanceOf[js.Any])
    if (onSwiped != null) __obj.updateDynamic("onSwiped")(js.Any.fromFunction6(onSwiped))
    if (onSwiping != null) __obj.updateDynamic("onSwiping")(js.Any.fromFunction6(onSwiping))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(touchTrackingEnabled)) __obj.updateDynamic("touchTrackingEnabled")(touchTrackingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorProps]
  }
}

