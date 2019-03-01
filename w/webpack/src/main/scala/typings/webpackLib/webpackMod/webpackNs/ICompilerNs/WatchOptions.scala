package typings
package webpackLib.webpackMod.webpackNs.ICompilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  /**
    * Add a delay before rebuilding once the first file changed. This allows webpack to aggregate any other
    * changes made during this time period into one rebuild.
    * Pass a value in milliseconds. Default: 300.
    */
  var aggregateTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * For some systems, watching many file systems can result in a lot of CPU or memory usage.
    * It is possible to exclude a huge folder like node_modules.
    * It is also possible to use anymatch patterns.
    */
  var ignored: js.UndefOr[anymatchLib.anymatchMod.anymatchNs.Matcher] = js.undefined
  /** Turn on polling by passing true, or specifying a poll interval in milliseconds. */
  var poll: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    aggregateTimeout: scala.Int | scala.Double = null,
    ignored: anymatchLib.anymatchMod.anymatchNs.Matcher = null,
    poll: scala.Boolean | scala.Double = null
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregateTimeout != null) __obj.updateDynamic("aggregateTimeout")(aggregateTimeout.asInstanceOf[js.Any])
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}

