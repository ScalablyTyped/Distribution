package typings.winrt.Windows.Media.Devices

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Media.Capture.MediaStreamType
import typings.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaDeviceController extends StObject {
  
  def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties]
  
  def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties
  
  def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction
}
object IMediaDeviceController {
  
  inline def apply(
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction
  ): IMediaDeviceController = {
    val __obj = js.Dynamic.literal(getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync))
    __obj.asInstanceOf[IMediaDeviceController]
  }
  
  extension [Self <: IMediaDeviceController](x: Self) {
    
    inline def setGetAvailableMediaStreamProperties(value: MediaStreamType => IVectorView[IMediaEncodingProperties]): Self = StObject.set(x, "getAvailableMediaStreamProperties", js.Any.fromFunction1(value))
    
    inline def setGetMediaStreamProperties(value: MediaStreamType => IMediaEncodingProperties): Self = StObject.set(x, "getMediaStreamProperties", js.Any.fromFunction1(value))
    
    inline def setSetMediaStreamPropertiesAsync(value: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction): Self = StObject.set(x, "setMediaStreamPropertiesAsync", js.Any.fromFunction2(value))
  }
}
