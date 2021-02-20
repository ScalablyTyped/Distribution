package typings.winrt.Windows.Media.Devices

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Media.Capture.MediaStreamType
import typings.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaDeviceController extends StObject {
  
  def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  
  def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  
  def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction = js.native
}
object IMediaDeviceController {
  
  @scala.inline
  def apply(
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction
  ): IMediaDeviceController = {
    val __obj = js.Dynamic.literal(getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync))
    __obj.asInstanceOf[IMediaDeviceController]
  }
  
  @scala.inline
  implicit class IMediaDeviceControllerMutableBuilder[Self <: IMediaDeviceController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAvailableMediaStreamProperties(value: MediaStreamType => IVectorView[IMediaEncodingProperties]): Self = StObject.set(x, "getAvailableMediaStreamProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMediaStreamProperties(value: MediaStreamType => IMediaEncodingProperties): Self = StObject.set(x, "getMediaStreamProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMediaStreamPropertiesAsync(value: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction): Self = StObject.set(x, "setMediaStreamPropertiesAsync", js.Any.fromFunction2(value))
  }
}
