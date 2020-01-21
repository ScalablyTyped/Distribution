package typings.webpackBlocksDevServer.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  var aggregateTimeout: js.UndefOr[Double] = js.undefined
  var ignored: js.UndefOr[RegExp] = js.undefined
  var poll: js.UndefOr[Boolean | Double] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(aggregateTimeout: Int | Double = null, ignored: RegExp = null, poll: Boolean | Double = null): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregateTimeout != null) __obj.updateDynamic("aggregateTimeout")(aggregateTimeout.asInstanceOf[js.Any])
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}

