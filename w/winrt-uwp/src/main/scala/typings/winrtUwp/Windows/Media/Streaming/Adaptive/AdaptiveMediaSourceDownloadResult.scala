package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the results of a resource download operation. */
@js.native
trait AdaptiveMediaSourceDownloadResult extends StObject {
  
  /** Gets or sets a buffer containing the downloaded resource. */
  var buffer: IBuffer = js.native
  
  /** Gets or sets a string that identifies the MIME content type of the downloaded resource. */
  var contentType: String = js.native
  
  /** Gets or sets an integer value that represents extended status information about the resource download operation. */
  var extendedStatus: Double = js.native
  
  /** Gets or sets an input stream containing the downloaded resource. */
  var inputStream: IInputStream = js.native
  
  /** Gets or sets the Uniform Resource Identifier (URI) of the downloaded resource. */
  var resourceUri: Uri = js.native
}
object AdaptiveMediaSourceDownloadResult {
  
  @scala.inline
  def apply(
    buffer: IBuffer,
    contentType: String,
    extendedStatus: Double,
    inputStream: IInputStream,
    resourceUri: Uri
  ): AdaptiveMediaSourceDownloadResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], extendedStatus = extendedStatus.asInstanceOf[js.Any], inputStream = inputStream.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadResult]
  }
  
  @scala.inline
  implicit class AdaptiveMediaSourceDownloadResultMutableBuilder[Self <: AdaptiveMediaSourceDownloadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: IBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatus(value: Double): Self = StObject.set(x, "extendedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStream(value: IInputStream): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUri(value: Uri): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
  }
}
