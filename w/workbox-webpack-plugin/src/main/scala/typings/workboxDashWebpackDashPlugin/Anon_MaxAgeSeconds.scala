package typings.workboxDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxAgeSeconds extends js.Object {
  /**
  		 * Cache will only hold entries for X seconds.
  		 */
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  /**
  		 * Cache will only hold X entries.
  		 */
  var maxEntries: js.UndefOr[Double] = js.undefined
}

object Anon_MaxAgeSeconds {
  @scala.inline
  def apply(maxAgeSeconds: Int | Double = null, maxEntries: Int | Double = null): Anon_MaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    if (maxEntries != null) __obj.updateDynamic("maxEntries")(maxEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxAgeSeconds]
  }
}

