package typings
package winrtLib.WindowsNs.MediaNs.TranscodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaTranscoder extends js.Object {
  var alwaysReencode: scala.Boolean = js.native
  var hardwareAccelerationEnabled: scala.Boolean = js.native
  var trimStartTime: scala.Double = js.native
  var trimStopTime: scala.Double = js.native
  def addAudioEffect(activatableClassId: java.lang.String): scala.Unit = js.native
  def addAudioEffect(
    activatableClassId: java.lang.String,
    effectRequired: scala.Boolean,
    configuration: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
  def addVideoEffect(activatableClassId: java.lang.String): scala.Unit = js.native
  def addVideoEffect(
    activatableClassId: java.lang.String,
    effectRequired: scala.Boolean,
    configuration: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
  def clearEffects(): scala.Unit = js.native
  def prepareFileTranscodeAsync(
    source: winrtLib.WindowsNs.StorageNs.IStorageFile,
    destination: winrtLib.WindowsNs.StorageNs.IStorageFile,
    profile: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[PrepareTranscodeResult] = js.native
  def prepareStreamTranscodeAsync(
    source: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    destination: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    profile: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[PrepareTranscodeResult] = js.native
}

