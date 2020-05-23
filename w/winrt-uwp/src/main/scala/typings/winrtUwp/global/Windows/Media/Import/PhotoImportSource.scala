package typings.winrtUwp.global.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFolder
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the source device for a photo import session. */
@JSGlobal("Windows.Media.Import.PhotoImportSource")
@js.native
abstract class PhotoImportSource ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportSource {
  /** The battery level of the source device. */
  /* CompleteClass */
  override var batteryLevelPercent: Double = js.native
  /** Gets the connection protocol that is being used to communicate with the source device. */
  /* CompleteClass */
  override var connectionProtocol: String = js.native
  /** Gets a value indicating the transport mechanism that is being used for importing items from the source device. */
  /* CompleteClass */
  override var connectionTransport: typings.winrtUwp.Windows.Media.Import.PhotoImportConnectionTransport = js.native
  /** Gets the current date and time on the device. */
  /* CompleteClass */
  override var dateTime: Date = js.native
  /** Gets a human-readable description of the source device. */
  /* CompleteClass */
  override var description: String = js.native
  /** Gets the human-readable display name for the source device. */
  /* CompleteClass */
  override var displayName: String = js.native
  /** Gets a unique 16-byte identifier that is common across multiple transports supported by the device. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets a value indicating if the source device is locked. */
  /* CompleteClass */
  override var isLocked: Boolean = js.native
  /** Gets a value indicating if the source device is a mass storage device. */
  /* CompleteClass */
  override var isMassStorage: Boolean = js.native
  /** Gets the source device's human-readable manufacturer name. */
  /* CompleteClass */
  override var manufacturer: String = js.native
  /** Gets the device model name. */
  /* CompleteClass */
  override var model: String = js.native
  /** Gets a value indicating the type of power source being used by the source device, if it is known. */
  /* CompleteClass */
  override var powerSource: typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource = js.native
  /** Gets the serial number of the device. */
  /* CompleteClass */
  override var serialNumber: String = js.native
  /** Gets a list of objects representing the different storage media exposed by the source device. */
  /* CompleteClass */
  override var storageMedia: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMedium] = js.native
  /** Gets a reference to a stream containing the thumbnail image for the source device. */
  /* CompleteClass */
  override var thumbnail: IRandomAccessStreamReference = js.native
  /** Gets a value indicating the type of the source device. */
  /* CompleteClass */
  override var `type`: typings.winrtUwp.Windows.Media.Import.PhotoImportSourceType = js.native
  /**
    * Creates a new photo import session.
    * @return The new PhotoImportSession object.
    */
  /* CompleteClass */
  override def createImportSession(): typings.winrtUwp.Windows.Media.Import.PhotoImportSession = js.native
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
  def fromFolderAsync(sourceRootFolder: IStorageFolder): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Import.PhotoImportSource] = js.native
  /**
    * Creates a new instance of PhotoImportSource from the specified device ID.
    * @param sourceId The root folder from which the photo import source is created.
    * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
    */
  def fromIdAsync(sourceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Import.PhotoImportSource] = js.native
}

