package typings.workboxWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAgeSeconds extends js.Object {
  /**
    * Cache will only hold entries for X seconds.
    */
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  /**
    * Cache will only hold X entries.
    */
  var maxEntries: js.UndefOr[Double] = js.undefined
}

object MaxAgeSeconds {
  @scala.inline
  def apply(maxAgeSeconds: js.UndefOr[Double] = js.undefined, maxEntries: js.UndefOr[Double] = js.undefined): MaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAgeSeconds)) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxEntries)) __obj.updateDynamic("maxEntries")(maxEntries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeSeconds]
  }
}

