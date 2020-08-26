package typings.webpackBlocksAssets.mod.css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlOptions extends js.Object {
  var fallback: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double | Boolean | String] = js.native
  var mimetype: js.UndefOr[String] = js.native
}

object UrlOptions {
  @scala.inline
  def apply(): UrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlOptions]
  }
  @scala.inline
  implicit class UrlOptionsOps[Self <: UrlOptions] (val x: Self) extends AnyVal {
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
    def setFallback(value: String): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setLimit(value: Double | Boolean | String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMimetype(value: String): Self = this.set("mimetype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimetype: Self = this.set("mimetype", js.undefined)
  }
  
}

