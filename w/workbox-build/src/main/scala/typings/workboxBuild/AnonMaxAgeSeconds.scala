package typings.workboxBuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxAgeSeconds extends js.Object {
  /**
    * The `maxAgeSeconds` property to use when creating the
    * [`ExpirationPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-expiration.ExpirationPlugin.html)
    */
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  /**
    * The `maxEntries` property to use when creating the
    * [`ExpirationPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-expiration.ExpirationPlugin.html)
    */
  var maxEntries: js.UndefOr[Double] = js.undefined
}

object AnonMaxAgeSeconds {
  @scala.inline
  def apply(maxAgeSeconds: Int | Double = null, maxEntries: Int | Double = null): AnonMaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    if (maxEntries != null) __obj.updateDynamic("maxEntries")(maxEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxAgeSeconds]
  }
}

