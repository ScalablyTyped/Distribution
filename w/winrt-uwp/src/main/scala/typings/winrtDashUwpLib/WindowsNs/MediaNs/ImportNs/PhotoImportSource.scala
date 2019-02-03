package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the source device for a photo import session. */
@JSGlobal("Windows.Media.Import.PhotoImportSource")
@js.native
abstract class PhotoImportSource () extends js.Object {
  /** The battery level of the source device. */
  var batteryLevelPercent: scala.Double = js.native
  /** Gets the connection protocol that is being used to communicate with the source device. */
  var connectionProtocol: java.lang.String = js.native
  /** Gets a value indicating the transport mechanism that is being used for importing items from the source device. */
  var connectionTransport: PhotoImportConnectionTransport = js.native
  /** Gets the current date and time on the device. */
  var dateTime: stdLib.Date = js.native
  /** Gets a human-readable description of the source device. */
  var description: java.lang.String = js.native
  /** Gets the human-readable display name for the source device. */
  var displayName: java.lang.String = js.native
  /** Gets a unique 16-byte identifier that is common across multiple transports supported by the device. */
  var id: java.lang.String = js.native
  /** Gets a value indicating if the source device is locked. */
  var isLocked: scala.Boolean = js.native
  /** Gets a value indicating if the source device is a mass storage device. */
  var isMassStorage: scala.Boolean = js.native
  /** Gets the source device's human-readable manufacturer name. */
  var manufacturer: java.lang.String = js.native
  /** Gets the device model name. */
  var model: java.lang.String = js.native
  /** Gets a value indicating the type of power source being used by the source device, if it is known. */
  var powerSource: PhotoImportPowerSource = js.native
  /** Gets the serial number of the device. */
  var serialNumber: java.lang.String = js.native
  /** Gets a list of objects representing the different storage media exposed by the source device. */
  var storageMedia: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PhotoImportStorageMedium] = js.native
  /** Gets a reference to a stream containing the thumbnail image for the source device. */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets a value indicating the type of the source device. */
  var `type`: PhotoImportSourceType = js.native
  /**
    * Creates a new photo import session.
    * @return The new PhotoImportSession object.
    */
  def createImportSession(): PhotoImportSession = js.native
}

/* static members */
@JSGlobal("Windows.Media.Import.PhotoImportSource")
@js.native
object PhotoImportSource extends js.Object {
  /**
    * Creates a new instance of PhotoImportSource from the specified root folder.
    * @param sourceRootFolder The root folder from which the photo import source is created.
    * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
    */
  def fromFolderAsync(sourceRootFolder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSource] = js.native
  /**
    * Creates a new instance of PhotoImportSource from the specified device ID.
    * @param sourceId The root folder from which the photo import source is created.
    * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
    */
  def fromIdAsync(sourceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSource] = js.native
}

