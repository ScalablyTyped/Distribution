package typings.workboxBuild.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  /**
    * The `headers` property to use when creating the
    * [`CacheableResponsePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-cacheable-response.CacheableResponsePlugin).
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
    * The `statuses` property to use when creating the
    * [`CacheableResponsePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-cacheable-response.CacheableResponsePlugin).
    */
  var statuses: js.UndefOr[js.Array[Double]] = js.undefined
}

object Headers {
  @scala.inline
  def apply(headers: js.Object = null, statuses: js.Array[Double] = null): Headers = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

