package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Download Response
trait DownloadProgressResponse
  extends StObject
     with ProgressResponseBase {
  
  val finalUrl: String
}
object DownloadProgressResponse {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: DownloadProgressResponse] (val x: Self) extends AnyVal {
    
    inline def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
  }
}
