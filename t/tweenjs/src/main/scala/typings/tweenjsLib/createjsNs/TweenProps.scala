package typings
package tweenjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenProps extends js.Object {
  var bounce: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreGlobalPause: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ createjsDashLibLib.createjsNs.Event, scala.Unit]] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* e */ createjsDashLibLib.createjsNs.Event, scala.Unit]] = js.undefined
  var `override`: js.UndefOr[scala.Boolean] = js.undefined
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  var pluginData: js.UndefOr[js.Any] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  var timeScale: js.UndefOr[scala.Double] = js.undefined
  var useTicks: js.UndefOr[scala.Boolean] = js.undefined
}

object TweenProps {
  @scala.inline
  def apply(
    bounce: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreGlobalPause: js.UndefOr[scala.Boolean] = js.undefined,
    loop: scala.Int | scala.Double = null,
    onChange: js.Function1[/* e */ createjsDashLibLib.createjsNs.Event, scala.Unit] = null,
    onComplete: js.Function1[/* e */ createjsDashLibLib.createjsNs.Event, scala.Unit] = null,
    `override`: js.UndefOr[scala.Boolean] = js.undefined,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    pluginData: js.Any = null,
    position: scala.Int | scala.Double = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    timeScale: scala.Int | scala.Double = null,
    useTicks: js.UndefOr[scala.Boolean] = js.undefined
  ): TweenProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bounce)) __obj.updateDynamic("bounce")(bounce)
    if (!js.isUndefined(ignoreGlobalPause)) __obj.updateDynamic("ignoreGlobalPause")(ignoreGlobalPause)
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (pluginData != null) __obj.updateDynamic("pluginData")(pluginData)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    if (!js.isUndefined(useTicks)) __obj.updateDynamic("useTicks")(useTicks)
    __obj.asInstanceOf[TweenProps]
  }
}

