package typings.workboxBuild.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAgeSeconds extends js.Object {
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

object MaxAgeSeconds {
  @scala.inline
  def apply(maxAgeSeconds: js.UndefOr[Double] = js.undefined, maxEntries: js.UndefOr[Double] = js.undefined): MaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAgeSeconds)) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxEntries)) __obj.updateDynamic("maxEntries")(maxEntries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeSeconds]
  }
}

