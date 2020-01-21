package typings.tweenjs.createjs

import typings.createjsLib.createjs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineProps extends js.Object {
  var bounce: js.UndefOr[Boolean] = js.undefined
  var ignoreGlobalPause: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var paused: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
  var timeScale: js.UndefOr[Double] = js.undefined
  var useTicks: js.UndefOr[Boolean] = js.undefined
}

object TimelineProps {
  @scala.inline
  def apply(
    bounce: js.UndefOr[Boolean] = js.undefined,
    ignoreGlobalPause: js.UndefOr[Boolean] = js.undefined,
    loop: Int | Double = null,
    onChange: /* e */ Event => Unit = null,
    onComplete: /* e */ Event => Unit = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    position: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    timeScale: Int | Double = null,
    useTicks: js.UndefOr[Boolean] = js.undefined
  ): TimelineProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bounce)) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreGlobalPause)) __obj.updateDynamic("ignoreGlobalPause")(ignoreGlobalPause.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    if (!js.isUndefined(useTicks)) __obj.updateDynamic("useTicks")(useTicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineProps]
  }
}

