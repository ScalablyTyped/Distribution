package typings.workboxBuild.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  /**
    * The `headers` property to use when creating the
    * [`CacheableResponsePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-cacheable-response.CacheableResponsePlugin).
    */
  var headers: js.UndefOr[js.Object] = js.native
  /**
    * The `statuses` property to use when creating the
    * [`CacheableResponsePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-cacheable-response.CacheableResponsePlugin).
    */
  var statuses: js.UndefOr[js.Array[Double]] = js.native
}

object Headers {
  @scala.inline
  def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setStatusesVarargs(value: Double*): Self = this.set("statuses", js.Array(value :_*))
    @scala.inline
    def setStatuses(value: js.Array[Double]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatuses: Self = this.set("statuses", js.undefined)
  }
  
}

