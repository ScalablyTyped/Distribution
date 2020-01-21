package typings.webpackbar.mod

import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Color output of the progress bar */
  var color: js.UndefOr[String] = js.undefined
  /** Show compiled in time */
  var compiledIn: js.UndefOr[Boolean] = js.undefined
  /** Function called when all builds are finished */
  var done: js.UndefOr[js.Function2[/* sharedState */ SharedState, /* ctx */ WebpackBar, Unit]] = js.undefined
  /** Minimal output */
  var minimal: js.UndefOr[Boolean] = js.undefined
  /** Display name */
  var name: js.UndefOr[String] = js.undefined
  /** Enable the profiler for files and loaders */
  var profile: js.UndefOr[Boolean] = js.undefined
  /** Stream to rwite to */
  var stream: js.UndefOr[WriteStream] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: String = null,
    compiledIn: js.UndefOr[Boolean] = js.undefined,
    done: (/* sharedState */ SharedState, /* ctx */ WebpackBar) => Unit = null,
    minimal: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    profile: js.UndefOr[Boolean] = js.undefined,
    stream: WriteStream = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(compiledIn)) __obj.updateDynamic("compiledIn")(compiledIn.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction2(done))
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

