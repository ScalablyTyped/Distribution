package typings.watchify.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The amount of time in milliseconds to wait before emitting an "update" event after a change.
    * @default 100
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Ignores monitoring files for changes. If set to `true`, then ** /node_modules/ ** will be ignored.
    * For other possible values see Chokidar's documentation on "ignored"
    * Also see anymatch package: https://github.com/es128/anymatch#usage
    */
  var ignoreWatch: js.UndefOr[
    Boolean | String | RegExp | (js.Function1[/* repeated */ js.Any, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* repeated */ _, Boolean])])
  ] = js.undefined
  /**
    * Enables polling to monitor for changes. If set to `true`, then a polling interval of 100 ms is used.
    * If set to a number, then that amount of milliseconds will be the polling interval. For more info see
    * Chokidar's documentation on "usePolling" and "interval".
    * This option is useful if you're watching an NFS volume
    * Also see chokidar package: https://github.com/paulmillr/chokidar#path-filtering
    */
  var poll: js.UndefOr[Boolean | Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    ignoreWatch: Boolean | String | RegExp | (js.Function1[/* repeated */ js.Any, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* repeated */ _, Boolean])]) = null,
    poll: Boolean | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (ignoreWatch != null) __obj.updateDynamic("ignoreWatch")(ignoreWatch.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

