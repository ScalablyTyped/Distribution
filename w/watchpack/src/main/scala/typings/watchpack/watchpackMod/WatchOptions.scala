package typings.watchpack.watchpackMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends WatcherOptions {
  var aggregateTimeout: js.UndefOr[Double] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    aggregateTimeout: Int | Double = null,
    ignored: js.Array[String] | String | RegExp | (js.Function1[/* path */ String, Boolean]) = null,
    poll: Boolean | Double = null
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregateTimeout != null) __obj.updateDynamic("aggregateTimeout")(aggregateTimeout.asInstanceOf[js.Any])
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}

