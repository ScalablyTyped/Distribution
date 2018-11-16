package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CastingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a physical device that is capable of supporting casting connections and rendering media content sent to it. */
@JSGlobal("Windows.Media.Casting.CastingDevice")
@js.native
abstract class CastingDevice () extends js.Object {
  /** A human-readable name for the device, retrieved from the device itself. */
  var friendlyName: java.lang.String = js.native
  /** An icon representing the device. */
  var icon: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType = js.native
  /** The device ID. This is the same ID used with Windows.Devices.Enumeration APIs. */
  var id: java.lang.String = js.native
  /**
                   * Creates a new CastingConnection object. This method does not establish a connection to the casting device.
                   * @return The object that represents the casting connection.
                   */
  def createCastingConnection(): CastingConnection = js.native
  /**
                   * Gets the media types supported by the device. containing
                   * @return The media types, CastingPlaybackTypes , supported by the device.
                   */
  def getSupportedCastingPlaybackTypesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[CastingPlaybackTypes] = js.native
}

/** Represents a physical device that is capable of supporting casting connections and rendering media content sent to it. */
@JSGlobal("Windows.Media.Casting.CastingDevice")
@js.native
object CastingDevice extends js.Object {
  /**
                   * Indicates whether the given device (a DeviceInformation object) supports casting.
                   * @param device The device you want to know about.
                   * @return True if the device supports casting; false otherwise.
                   */
  def deviceInfoSupportsCastingAsync(device: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Gets a CastingDevice object for a given a device ID (acquired from a query using the Windows.Devices.Enumeration APIs).
                   * @param value The device ID.
                   * @return The object representing the casting device.
                   */
  def fromIdAsync(value: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingDevice] = js.native
  /**
                   * Gets an AQS filter string to be used with the Windows.Devices.Enumeration APIs for a given CastingPlaybackTypes .
                   * @param type The casting playback type.
                   * @return The AQS filter string.
                   */
  def getDeviceSelector(`type`: winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingPlaybackTypes): java.lang.String = js.native
  /**
                   * Gets an AQS filter string to be used with the Windows.Devices.Enumeration APIs for a given CastingSource .
                   * @param castingSource The casting source.
                   * @return The AQS filter string.
                   */
  def getDeviceSelectorFromCastingSourceAsync(castingSource: winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingSource): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
}

