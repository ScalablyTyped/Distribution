package typings.vanillaDashSwipe.libTypesMod

import typings.std.Event
import typings.std.HTMLElement
import typings.vanillaDashSwipe.vanillaDashSwipeNumbers.`0`
import typings.vanillaDashSwipe.vanillaDashSwipeNumbers.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorProps extends js.Object {
  var delta: js.UndefOr[Double | `10`] = js.undefined
  var element: HTMLElement | Null
  var mouseTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  var onSwiped: js.UndefOr[EventHandler] = js.undefined
  var onSwiping: js.UndefOr[EventHandler] = js.undefined
  var onTap: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
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
    onSwiped: EventHandler = null,
    onSwiping: EventHandler = null,
    onTap: /* e */ Event => Unit = null,
    preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined,
    rotationAngle: Double | `0` = null,
    touchTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  ): ConstructorProps = {
    val __obj = js.Dynamic.literal()
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element)
    if (!js.isUndefined(mouseTrackingEnabled)) __obj.updateDynamic("mouseTrackingEnabled")(mouseTrackingEnabled)
    if (onSwiped != null) __obj.updateDynamic("onSwiped")(onSwiped)
    if (onSwiping != null) __obj.updateDynamic("onSwiping")(onSwiping)
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent)
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(touchTrackingEnabled)) __obj.updateDynamic("touchTrackingEnabled")(touchTrackingEnabled)
    __obj.asInstanceOf[ConstructorProps]
  }
}

