package typings.winrt.Windows.Graphics.Imaging

import typings.std.Uint8Array
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapEncoder extends StObject {
  
  var bitmapContainerProperties: BitmapProperties = js.native
  
  var bitmapProperties: BitmapProperties = js.native
  
  var bitmapTransform: BitmapTransform = js.native
  
  var encoderInformation: BitmapCodecInformation = js.native
  
  def flushAsync(): IAsyncAction = js.native
  
  var generatedThumbnailHeight: Double = js.native
  
  var generatedThumbnailWidth: Double = js.native
  
  def goToNextFrameAsync(): IAsyncAction = js.native
  def goToNextFrameAsync(encodingOptions: IIterable[IKeyValuePair[String, BitmapTypedValue]]): IAsyncAction = js.native
  
  var isThumbnailGenerated: Boolean = js.native
  
  def setPixelData(
    pixelFormat: BitmapPixelFormat,
    alphaMode: BitmapAlphaMode,
    width: Double,
    height: Double,
    dpiX: Double,
    dpiY: Double,
    pixels: Uint8Array
  ): Unit = js.native
}
