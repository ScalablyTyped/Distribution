package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Download Response
trait DownloadProgressResponse extends ProgressResponseBase {
  val finalUrl: java.lang.String
}

object DownloadProgressResponse {
  @scala.inline
  def apply(
    done: scala.Double,
    finalUrl: java.lang.String,
    lengthComputable: scala.Boolean,
    loaded: scala.Double,
    position: scala.Double,
    total: scala.Double,
    totalSize: scala.Double
  ): DownloadProgressResponse = {
    val __obj = js.Dynamic.literal(done = done, finalUrl = finalUrl, lengthComputable = lengthComputable, loaded = loaded, position = position, total = total, totalSize = totalSize)
  
    __obj.asInstanceOf[DownloadProgressResponse]
  }
}

