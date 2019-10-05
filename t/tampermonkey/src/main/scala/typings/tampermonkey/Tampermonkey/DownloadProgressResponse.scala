package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Download Response
trait DownloadProgressResponse extends ProgressResponseBase {
  val finalUrl: String
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
    val __obj = js.Dynamic.literal(done = done, finalUrl = finalUrl, lengthComputable = lengthComputable, loaded = loaded, position = position, total = total, totalSize = totalSize)
  
    __obj.asInstanceOf[DownloadProgressResponse]
  }
}

