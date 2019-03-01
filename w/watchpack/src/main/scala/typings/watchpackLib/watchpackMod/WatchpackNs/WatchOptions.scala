package typings
package watchpackLib.watchpackMod.WatchpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends WatcherOptions {
  var aggregateTimeout: js.UndefOr[scala.Double] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    aggregateTimeout: scala.Int | scala.Double = null,
    ignored: js.Array[java.lang.String] | java.lang.String | stdLib.RegExp | (js.Function1[/* path */ java.lang.String, scala.Boolean]) = null,
    poll: scala.Boolean | scala.Double = null
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregateTimeout != null) __obj.updateDynamic("aggregateTimeout")(aggregateTimeout.asInstanceOf[js.Any])
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}

