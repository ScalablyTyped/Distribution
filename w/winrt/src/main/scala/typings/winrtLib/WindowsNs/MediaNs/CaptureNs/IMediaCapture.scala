package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaCapture extends js.Object {
  var audioDeviceController: winrtLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceController = js.native
  var mediaCaptureSettings: MediaCaptureSettings = js.native
  var onfailed: js.Any = js.native
  var onrecordlimitationexceeded: js.Any = js.native
  var videoDeviceController: winrtLib.WindowsNs.MediaNs.DevicesNs.VideoDeviceController = js.native
  def addEffectAsync(
    mediaStreamType: MediaStreamType,
    effectActivationID: java.lang.String,
    effectSettings: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def capturePhotoToStorageFileAsync(
    `type`: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties,
    file: winrtLib.WindowsNs.StorageNs.IStorageFile
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def capturePhotoToStreamAsync(
    `type`: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties,
    stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def clearEffectsAsync(mediaStreamType: MediaStreamType): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def getEncoderProperty(mediaStreamType: MediaStreamType, propertyId: java.lang.String): js.Any = js.native
  def getPreviewMirroring(): scala.Boolean = js.native
  def getPreviewRotation(): VideoRotation = js.native
  def getRecordRotation(): VideoRotation = js.native
  def initializeAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def initializeAsync(mediaCaptureInitializationSettings: MediaCaptureInitializationSettings): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def setEncoderProperty(mediaStreamType: MediaStreamType, propertyId: java.lang.String, propertyValue: js.Any): scala.Unit = js.native
  def setPreviewMirroring(value: scala.Boolean): scala.Unit = js.native
  def setPreviewRotation(value: VideoRotation): scala.Unit = js.native
  def setRecordRotation(value: VideoRotation): scala.Unit = js.native
  def startRecordToCustomSinkAsync(
    encodingProfile: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    customMediaSink: winrtLib.WindowsNs.MediaNs.IMediaExtension
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def startRecordToCustomSinkAsync(
    encodingProfile: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    customSinkActivationId: java.lang.String,
    customSinkSettings: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def startRecordToStorageFileAsync(
    encodingProfile: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    file: winrtLib.WindowsNs.StorageNs.IStorageFile
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def startRecordToStreamAsync(
    encodingProfile: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def stopRecordAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

