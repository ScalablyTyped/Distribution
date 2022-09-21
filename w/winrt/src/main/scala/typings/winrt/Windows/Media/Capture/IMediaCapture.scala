package typings.winrt.Windows.Media.Capture

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Media.Devices.AudioDeviceController
import typings.winrt.Windows.Media.Devices.VideoDeviceController
import typings.winrt.Windows.Media.IMediaExtension
import typings.winrt.Windows.Media.MediaProperties.ImageEncodingProperties
import typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaCapture extends StObject {
  
  def addEffectAsync(mediaStreamType: MediaStreamType, effectActivationID: String, effectSettings: IPropertySet): IAsyncAction = js.native
  
  var audioDeviceController: AudioDeviceController = js.native
  
  def capturePhotoToStorageFileAsync(`type`: ImageEncodingProperties, file: IStorageFile): IAsyncAction = js.native
  
  def capturePhotoToStreamAsync(`type`: ImageEncodingProperties, stream: IRandomAccessStream): IAsyncAction = js.native
  
  def clearEffectsAsync(mediaStreamType: MediaStreamType): IAsyncAction = js.native
  
  def getEncoderProperty(mediaStreamType: MediaStreamType, propertyId: String): Any = js.native
  
  def getPreviewMirroring(): Boolean = js.native
  
  def getPreviewRotation(): VideoRotation = js.native
  
  def getRecordRotation(): VideoRotation = js.native
  
  def initializeAsync(): IAsyncAction = js.native
  def initializeAsync(mediaCaptureInitializationSettings: MediaCaptureInitializationSettings): IAsyncAction = js.native
  
  var mediaCaptureSettings: MediaCaptureSettings = js.native
  
  var onfailed: Any = js.native
  
  var onrecordlimitationexceeded: Any = js.native
  
  def setEncoderProperty(mediaStreamType: MediaStreamType, propertyId: String, propertyValue: Any): Unit = js.native
  
  def setPreviewMirroring(value: Boolean): Unit = js.native
  
  def setPreviewRotation(value: VideoRotation): Unit = js.native
  
  def setRecordRotation(value: VideoRotation): Unit = js.native
  
  def startRecordToCustomSinkAsync(encodingProfile: MediaEncodingProfile, customMediaSink: IMediaExtension): IAsyncAction = js.native
  def startRecordToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile,
    customSinkActivationId: String,
    customSinkSettings: IPropertySet
  ): IAsyncAction = js.native
  
  def startRecordToStorageFileAsync(encodingProfile: MediaEncodingProfile, file: IStorageFile): IAsyncAction = js.native
  
  def startRecordToStreamAsync(encodingProfile: MediaEncodingProfile, stream: IRandomAccessStream): IAsyncAction = js.native
  
  def stopRecordAsync(): IAsyncAction = js.native
  
  var videoDeviceController: VideoDeviceController = js.native
}
