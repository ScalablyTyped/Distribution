package typings
package workboxDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxAgeSeconds extends js.Object {
  /**
  		 * Cache will only hold entries for X seconds.
  		 */
  var maxAgeSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Cache will only hold X entries.
  		 */
  var maxEntries: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxAgeSeconds {
  @scala.inline
  def apply(maxAgeSeconds: scala.Int | scala.Double = null, maxEntries: scala.Int | scala.Double = null): Anon_MaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    if (maxEntries != null) __obj.updateDynamic("maxEntries")(maxEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxAgeSeconds]
  }
}

