package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Download Response
@js.native
trait DownloadProgressResponse extends ProgressResponseBase {
  val finalUrl: String = js.native
}

object DownloadProgressResponse {
  @scala.inline
  def apply(
    done: Double,
    finalUrl: String,
    lengthComputable: Boolean,
    loaded: Double,
    position: Double,
    total: Double,
    totalSize: Double
  ): DownloadProgressResponse = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], finalUrl = finalUrl.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgressResponse]
  }
  @scala.inline
  implicit class DownloadProgressResponseOps[Self <: DownloadProgressResponse] (val x: Self) extends AnyVal {
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
    def setFinalUrl(value: String): Self = this.set("finalUrl", value.asInstanceOf[js.Any])
  }
  
}

