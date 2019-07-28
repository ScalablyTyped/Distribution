package typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFolder
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the source device for a photo import session. */
@JSGlobal("Windows.Media.Import.PhotoImportSource")
@js.native
abstract class PhotoImportSource () extends js.Object {
  /** The battery level of the source device. */
  var batteryLevelPercent: Double = js.native
  /** Gets the connection protocol that is being used to communicate with the source device. */
  var connectionProtocol: String = js.native
  /** Gets a value indicating the transport mechanism that is being used for importing items from the source device. */
  var connectionTransport: PhotoImportConnectionTransport = js.native
  /** Gets the current date and time on the device. */
  var dateTime: Date = js.native
  /** Gets a human-readable description of the source device. */
  var description: String = js.native
  /** Gets the human-readable display name for the source device. */
  var displayName: String = js.native
  /** Gets a unique 16-byte identifier that is common across multiple transports supported by the device. */
  var id: String = js.native
  /** Gets a value indicating if the source device is locked. */
  var isLocked: Boolean = js.native
  /** Gets a value indicating if the source device is a mass storage device. */
  var isMassStorage: Boolean = js.native
  /** Gets the source device's human-readable manufacturer name. */
  var manufacturer: String = js.native
  /** Gets the device model name. */
  var model: String = js.native
  /** Gets a value indicating the type of power source being used by the source device, if it is known. */
  var powerSource: PhotoImportPowerSource = js.native
  /** Gets the serial number of the device. */
  var serialNumber: String = js.native
  /** Gets a list of objects representing the different storage media exposed by the source device. */
  var storageMedia: IVectorView[PhotoImportStorageMedium] = js.native
  /** Gets a reference to a stream containing the thumbnail image for the source device. */
  var thumbnail: IRandomAccessStreamReference = js.native
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
  def fromFolderAsync(sourceRootFolder: IStorageFolder): IPromiseWithIAsyncOperation[PhotoImportSource] = js.native
  /**
    * Creates a new instance of PhotoImportSource from the specified device ID.
    * @param sourceId The root folder from which the photo import source is created.
    * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
    */
  def fromIdAsync(sourceId: String): IPromiseWithIAsyncOperation[PhotoImportSource] = js.native
}

