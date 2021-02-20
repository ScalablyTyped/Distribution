package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapDecoder extends StObject {
  
  var bitmapContainerProperties: BitmapPropertiesView = js.native
  
  var decoderInformation: BitmapCodecInformation = js.native
  
  var frameCount: Double = js.native
  
  def getFrameAsync(frameIndex: Double): IAsyncOperation[BitmapFrame] = js.native
  
  def getPreviewAsync(): IAsyncOperation[ImageStream] = js.native
}
object IBitmapDecoder {
  
  @scala.inline
  def apply(
    bitmapContainerProperties: BitmapPropertiesView,
    decoderInformation: BitmapCodecInformation,
    frameCount: Double,
    getFrameAsync: Double => IAsyncOperation[BitmapFrame],
    getPreviewAsync: () => IAsyncOperation[ImageStream]
  ): IBitmapDecoder = {
    val __obj = js.Dynamic.literal(bitmapContainerProperties = bitmapContainerProperties.asInstanceOf[js.Any], decoderInformation = decoderInformation.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], getFrameAsync = js.Any.fromFunction1(getFrameAsync), getPreviewAsync = js.Any.fromFunction0(getPreviewAsync))
    __obj.asInstanceOf[IBitmapDecoder]
  }
  
  @scala.inline
  implicit class IBitmapDecoderMutableBuilder[Self <: IBitmapDecoder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitmapContainerProperties(value: BitmapPropertiesView): Self = StObject.set(x, "bitmapContainerProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoderInformation(value: BitmapCodecInformation): Self = StObject.set(x, "decoderInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameCount(value: Double): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFrameAsync(value: Double => IAsyncOperation[BitmapFrame]): Self = StObject.set(x, "getFrameAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPreviewAsync(value: () => IAsyncOperation[ImageStream]): Self = StObject.set(x, "getPreviewAsync", js.Any.fromFunction0(value))
  }
}
