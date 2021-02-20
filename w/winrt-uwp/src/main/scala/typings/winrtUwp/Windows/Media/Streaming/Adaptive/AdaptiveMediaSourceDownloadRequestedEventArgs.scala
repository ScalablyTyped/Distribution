package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DownloadRequested event. */
@js.native
trait AdaptiveMediaSourceDownloadRequestedEventArgs extends StObject {
  
  /**
    * Gets a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content.
    * @return A deferral that can be used to defer the completion of the DownloadRequested event.
    */
  def getDeferral(): AdaptiveMediaSourceDownloadRequestedDeferral = js.native
  
  /** Gets the byte range length of the media download request. */
  var resourceByteRangeLength: Double = js.native
  
  /** Gets the byte range offset of the media download request. */
  var resourceByteRangeOffset: Double = js.native
  
  /** Gets the resource type of the media download request. */
  var resourceType: AdaptiveMediaSourceResourceType = js.native
  
  /** Gets the resource URI of the media download request. */
  var resourceUri: Uri = js.native
  
  /** Gets an AdaptiveMediaSourceDownloadResult object representing the result of the media download request. */
  var result: AdaptiveMediaSourceDownloadResult = js.native
}
object AdaptiveMediaSourceDownloadRequestedEventArgs {
  
  @scala.inline
  def apply(
    getDeferral: () => AdaptiveMediaSourceDownloadRequestedDeferral,
    resourceByteRangeLength: Double,
    resourceByteRangeOffset: Double,
    resourceType: AdaptiveMediaSourceResourceType,
    resourceUri: Uri,
    result: AdaptiveMediaSourceDownloadResult
  ): AdaptiveMediaSourceDownloadRequestedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), resourceByteRangeLength = resourceByteRangeLength.asInstanceOf[js.Any], resourceByteRangeOffset = resourceByteRangeOffset.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadRequestedEventArgs]
  }
  
  @scala.inline
  implicit class AdaptiveMediaSourceDownloadRequestedEventArgsMutableBuilder[Self <: AdaptiveMediaSourceDownloadRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => AdaptiveMediaSourceDownloadRequestedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResourceByteRangeLength(value: Double): Self = StObject.set(x, "resourceByteRangeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceByteRangeOffset(value: Double): Self = StObject.set(x, "resourceByteRangeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: AdaptiveMediaSourceResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUri(value: Uri): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: AdaptiveMediaSourceDownloadResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
