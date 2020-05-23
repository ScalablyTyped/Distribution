package typings.winrtUwp.Windows.Media.Casting

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a physical device that is capable of supporting casting connections and rendering media content sent to it. */
trait CastingDevice extends js.Object {
  /** A human-readable name for the device, retrieved from the device itself. */
  var friendlyName: String
  /** An icon representing the device. */
  var icon: IRandomAccessStreamWithContentType
  /** The device ID. This is the same ID used with Windows.Devices.Enumeration APIs. */
  var id: String
  /**
    * Creates a new CastingConnection object. This method does not establish a connection to the casting device.
    * @return The object that represents the casting connection.
    */
  def createCastingConnection(): CastingConnection
  /**
    * Gets the media types supported by the device. containing
    * @return The media types, CastingPlaybackTypes , supported by the device.
    */
  def getSupportedCastingPlaybackTypesAsync(): IPromiseWithIAsyncOperation[CastingPlaybackTypes]
}

object CastingDevice {
  @scala.inline
  def apply(
    createCastingConnection: () => CastingConnection,
    friendlyName: String,
    getSupportedCastingPlaybackTypesAsync: () => IPromiseWithIAsyncOperation[CastingPlaybackTypes],
    icon: IRandomAccessStreamWithContentType,
    id: String
  ): CastingDevice = {
    val __obj = js.Dynamic.literal(createCastingConnection = js.Any.fromFunction0(createCastingConnection), friendlyName = friendlyName.asInstanceOf[js.Any], getSupportedCastingPlaybackTypesAsync = js.Any.fromFunction0(getSupportedCastingPlaybackTypesAsync), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingDevice]
  }
}

