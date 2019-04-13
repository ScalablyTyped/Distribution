package typings
package watchifyLib.watchifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The amount of time in milliseconds to wait before emitting an "update" event after a change.
    * Default: 100
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /** Ignores monitoring files for changes. If set to true, then ** /node_modules/ ** will be ignored. For other possible values see Chokidar's documentation on "ignored"
    * Also see anymatch package: https://github.com/es128/anymatch#usage
    */
  var ignoreWatch: js.UndefOr[
    scala.Boolean | java.lang.String | stdLib.RegExp | (js.Function1[/* repeated */ js.Any, scala.Boolean]) | (js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* repeated */ _, scala.Boolean])
    ])
  ] = js.undefined
  /** Enables polling to monitor for changes. If set to true, then a polling interval of 100 ms is used.
    * If set to a number, then that amount of milliseconds will be the polling interval. For more info see
    * Chokidar's documentation on "usePolling" and "interval".
    * This option is useful if you're watching an NFS volume
    * Also see chokidar package: https://github.com/paulmillr/chokidar#path-filtering
    */
  var poll: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    ignoreWatch: scala.Boolean | java.lang.String | stdLib.RegExp | (js.Function1[/* repeated */ js.Any, scala.Boolean]) | (js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* repeated */ _, scala.Boolean])
    ]) = null,
    poll: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (ignoreWatch != null) __obj.updateDynamic("ignoreWatch")(ignoreWatch.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

