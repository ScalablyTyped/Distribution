package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Web.Http.HttpResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DownloadCompleted event. */
@js.native
trait AdaptiveMediaSourceDownloadCompletedEventArgs extends StObject {
  
  /** Gets the http response message, if any, returned from the completed media download request. */
  var httpResponseMessage: HttpResponseMessage = js.native
  
  /** Gets the byte range length of the completed media download request. */
  var resourceByteRangeLength: Double = js.native
  
  /** Gets the byte range offset of the completed media download request. */
  var resourceByteRangeOffset: Double = js.native
  
  /** Gets the resource type of the completed media download request. */
  var resourceType: AdaptiveMediaSourceResourceType = js.native
  
  /** Gets the resource URI of the completed media download request. */
  var resourceUri: Uri = js.native
}
object AdaptiveMediaSourceDownloadCompletedEventArgs {
  
  @scala.inline
  def apply(
    httpResponseMessage: HttpResponseMessage,
    resourceByteRangeLength: Double,
    resourceByteRangeOffset: Double,
    resourceType: AdaptiveMediaSourceResourceType,
    resourceUri: Uri
  ): AdaptiveMediaSourceDownloadCompletedEventArgs = {
    val __obj = js.Dynamic.literal(httpResponseMessage = httpResponseMessage.asInstanceOf[js.Any], resourceByteRangeLength = resourceByteRangeLength.asInstanceOf[js.Any], resourceByteRangeOffset = resourceByteRangeOffset.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadCompletedEventArgs]
  }
  
  @scala.inline
  implicit class AdaptiveMediaSourceDownloadCompletedEventArgsMutableBuilder[Self <: AdaptiveMediaSourceDownloadCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpResponseMessage(value: HttpResponseMessage): Self = StObject.set(x, "httpResponseMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceByteRangeLength(value: Double): Self = StObject.set(x, "resourceByteRangeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceByteRangeOffset(value: Double): Self = StObject.set(x, "resourceByteRangeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: AdaptiveMediaSourceResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUri(value: Uri): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
  }
}
