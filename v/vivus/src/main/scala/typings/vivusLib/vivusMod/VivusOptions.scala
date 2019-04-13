package typings
package vivusLib.vivusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VivusOptions extends js.Object {
  /**
    * Timing animation function for the complete SVG.
    * It must accept a `number` as a parameter (between 0 to 1), and return a `number` (also between 0 and 1) as a result.
    *
    * See the [timing function documentation](https://github.com/maxwellito/vivus#timing-function).
    */
  var animTimingFunction: js.UndefOr[TimingFunction] = js.undefined
  /**
    * Whitespace extra margin between dashes.
    * Increase it in case of glitches at the initial state of the animation.
    *
    * (default: `2`)
    */
  var dashGap: js.UndefOr[scala.Double] = js.undefined
  /**
    * 	Time between the drawing of first and last path, in frames (only for `delayed` animations).
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation duration, in frames.
    * (default: `200`)
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Link to the SVG to animate.
    * If set, Vivus will create an object tag and append it to the DOM element given to the constructor.
    * Be careful, use the `onReady` callback before playing with the Vivus instance.
    */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Force the browser to re-render all updated path items.
    * By default, the value is `true` on IE only.
    *
    * See [the troubleshooting documentation for more details](https://github.com/maxwellito/vivus#troubleshoot).
    */
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function called when the instance is ready to play.
    */
  var onReady: js.UndefOr[js.Function1[/* vivusInstance */ Vivus, scala.Unit]] = js.undefined
  /**
    * Timing animation function for each path element of the SVG.
    * It must accept a `number` as a parameter (between 0 to 1), and return a `number` (also between 0 and 1) as a result.
    *
    * See the [timing function documentation](https://github.com/maxwellito/vivus#timing-function).
    */
  var pathTimingFunction: js.UndefOr[TimingFunction] = js.undefined
  /**
    * Reverse the order of execution.
    * The default behaviour is to render from the first 'path' in the SVG to the last one.
    * This option allow you to reverse the order.
    *
    * (default: `false`)
    */
  var reverseStack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Removes all extra styling on the SVG, and leaves it as original.
    */
  var selfDestroy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Automatically starts the animation.
    * Can be `'inViewport'`, `'manual'`, or `'autostart'`
    * (default: `'inViewport'`)
    */
  var start: js.UndefOr[
    vivusLib.vivusLibStrings.inViewport | vivusLib.vivusLibStrings.manual | vivusLib.vivusLibStrings.autostart
  ] = js.undefined
  /**
    * Determines if the item must be drawn asynchronously or not.
    * Can be `'delayed'`, `'sync'`, `'oneByOne'`, `'script'`, `'scenario'`, or `'scenario-sync'`.
    * (default: `'delayed'`)
    */
  var `type`: js.UndefOr[
    vivusLib.vivusLibStrings.delayed | vivusLib.vivusLibStrings.sync | vivusLib.vivusLibStrings.oneByOne | vivusLib.vivusLibStrings.script | vivusLib.vivusLibStrings.scenario | vivusLib.vivusLibStrings.`scenario-sync`
  ] = js.undefined
}

object VivusOptions {
  @scala.inline
  def apply(
    animTimingFunction: TimingFunction = null,
    dashGap: scala.Int | scala.Double = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    file: java.lang.String = null,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    onReady: /* vivusInstance */ Vivus => scala.Unit = null,
    pathTimingFunction: TimingFunction = null,
    reverseStack: js.UndefOr[scala.Boolean] = js.undefined,
    selfDestroy: js.UndefOr[scala.Boolean] = js.undefined,
    start: vivusLib.vivusLibStrings.inViewport | vivusLib.vivusLibStrings.manual | vivusLib.vivusLibStrings.autostart = null,
    `type`: vivusLib.vivusLibStrings.delayed | vivusLib.vivusLibStrings.sync | vivusLib.vivusLibStrings.oneByOne | vivusLib.vivusLibStrings.script | vivusLib.vivusLibStrings.scenario | vivusLib.vivusLibStrings.`scenario-sync` = null
  ): VivusOptions = {
    val __obj = js.Dynamic.literal()
    if (animTimingFunction != null) __obj.updateDynamic("animTimingFunction")(animTimingFunction)
    if (dashGap != null) __obj.updateDynamic("dashGap")(dashGap.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (pathTimingFunction != null) __obj.updateDynamic("pathTimingFunction")(pathTimingFunction)
    if (!js.isUndefined(reverseStack)) __obj.updateDynamic("reverseStack")(reverseStack)
    if (!js.isUndefined(selfDestroy)) __obj.updateDynamic("selfDestroy")(selfDestroy)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VivusOptions]
  }
}

