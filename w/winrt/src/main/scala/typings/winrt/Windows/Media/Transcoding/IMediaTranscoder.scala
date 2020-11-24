package typings.winrt.Windows.Media.Transcoding

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaTranscoder extends js.Object {
  
  def addAudioEffect(activatableClassId: String): Unit = js.native
  def addAudioEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
  
  def addVideoEffect(activatableClassId: String): Unit = js.native
  def addVideoEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
  
  var alwaysReencode: Boolean = js.native
  
  def clearEffects(): Unit = js.native
  
  var hardwareAccelerationEnabled: Boolean = js.native
  
  def prepareFileTranscodeAsync(source: IStorageFile, destination: IStorageFile, profile: MediaEncodingProfile): IAsyncOperation[PrepareTranscodeResult] = js.native
  
  def prepareStreamTranscodeAsync(source: IRandomAccessStream, destination: IRandomAccessStream, profile: MediaEncodingProfile): IAsyncOperation[PrepareTranscodeResult] = js.native
  
  var trimStartTime: Double = js.native
  
  var trimStopTime: Double = js.native
}
