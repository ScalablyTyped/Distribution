package typings
package watchpackLib.watchpackMod.WatchpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherOptions extends js.Object {
  var ignored: js.UndefOr[
    js.Array[java.lang.String] | java.lang.String | stdLib.RegExp | (js.Function1[/* path */ java.lang.String, scala.Boolean])
  ] = js.undefined
  var poll: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
}

object WatcherOptions {
  @scala.inline
  def apply(
    ignored: js.Array[java.lang.String] | java.lang.String | stdLib.RegExp | (js.Function1[/* path */ java.lang.String, scala.Boolean]) = null,
    poll: scala.Boolean | scala.Double = null
  ): WatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherOptions]
  }
}

