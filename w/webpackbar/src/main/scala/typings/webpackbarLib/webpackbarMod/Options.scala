package typings
package webpackbarLib.webpackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Color output of the progress bar */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Show compiled in time */
  var compiledIn: js.UndefOr[scala.Boolean] = js.undefined
  /** Function called when all builds are finished */
  var done: js.UndefOr[js.Function2[/* sharedState */ SharedState, /* ctx */ WebpackBar, scala.Unit]] = js.undefined
  /** Minimal output */
  var minimal: js.UndefOr[scala.Boolean] = js.undefined
  /** Display name */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Enable the profiler for files and loaders */
  var profile: js.UndefOr[scala.Boolean] = js.undefined
  /** Stream to rwite to */
  var stream: js.UndefOr[nodeLib.NodeJSNs.WriteStream] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    compiledIn: js.UndefOr[scala.Boolean] = js.undefined,
    done: (/* sharedState */ SharedState, /* ctx */ WebpackBar) => scala.Unit = null,
    minimal: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    profile: js.UndefOr[scala.Boolean] = js.undefined,
    stream: nodeLib.NodeJSNs.WriteStream = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(compiledIn)) __obj.updateDynamic("compiledIn")(compiledIn)
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction2(done))
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Options]
  }
}

