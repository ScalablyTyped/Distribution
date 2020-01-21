package typings.watchpack.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherOptions extends js.Object {
  var ignored: js.UndefOr[js.Array[String] | String | RegExp | (js.Function1[/* path */ String, Boolean])] = js.undefined
  var poll: js.UndefOr[Boolean | Double] = js.undefined
}

object WatcherOptions {
  @scala.inline
  def apply(
    ignored: js.Array[String] | String | RegExp | (js.Function1[/* path */ String, Boolean]) = null,
    poll: Boolean | Double = null
  ): WatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherOptions]
  }
}

