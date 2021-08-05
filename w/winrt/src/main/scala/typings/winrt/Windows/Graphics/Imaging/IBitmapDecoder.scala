package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapDecoder extends StObject {
  
  var bitmapContainerProperties: BitmapPropertiesView
  
  var decoderInformation: BitmapCodecInformation
  
  var frameCount: Double
  
  def getFrameAsync(frameIndex: Double): IAsyncOperation[BitmapFrame]
  
  def getPreviewAsync(): IAsyncOperation[ImageStream]
}
object IBitmapDecoder {
  
  inline def apply(
    bitmapContainerProperties: BitmapPropertiesView,
    decoderInformation: BitmapCodecInformation,
    frameCount: Double,
    getFrameAsync: Double => IAsyncOperation[BitmapFrame],
    getPreviewAsync: () => IAsyncOperation[ImageStream]
  ): IBitmapDecoder = {
    val __obj = js.Dynamic.literal(bitmapContainerProperties = bitmapContainerProperties.asInstanceOf[js.Any], decoderInformation = decoderInformation.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], getFrameAsync = js.Any.fromFunction1(getFrameAsync), getPreviewAsync = js.Any.fromFunction0(getPreviewAsync))
    __obj.asInstanceOf[IBitmapDecoder]
  }
  
  extension [Self <: IBitmapDecoder](x: Self) {
    
    inline def setBitmapContainerProperties(value: BitmapPropertiesView): Self = StObject.set(x, "bitmapContainerProperties", value.asInstanceOf[js.Any])
    
    inline def setDecoderInformation(value: BitmapCodecInformation): Self = StObject.set(x, "decoderInformation", value.asInstanceOf[js.Any])
    
    inline def setFrameCount(value: Double): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    inline def setGetFrameAsync(value: Double => IAsyncOperation[BitmapFrame]): Self = StObject.set(x, "getFrameAsync", js.Any.fromFunction1(value))
    
    inline def setGetPreviewAsync(value: () => IAsyncOperation[ImageStream]): Self = StObject.set(x, "getPreviewAsync", js.Any.fromFunction0(value))
  }
}
