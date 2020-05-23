package typings.winrtUwp.global.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a storage medium exposed by a photo import source device. */
@JSGlobal("Windows.Media.Import.PhotoImportStorageMedium")
@js.native
abstract class PhotoImportStorageMedium ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMedium {
  /** Gets the available space on the storage medium, in bytes. */
  /* CompleteClass */
  override var availableSpaceInBytes: Double = js.native
  /** Gets the capacity of the storage media, in bytes. */
  /* CompleteClass */
  override var capacityInBytes: Double = js.native
  /** Gets a description of the storage medium. */
  /* CompleteClass */
  override var description: String = js.native
  /** Gets the name of the storage medium. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets the serial number of the storage medium. */
  /* CompleteClass */
  override var serialNumber: String = js.native
  /** Gets the type of the storage medium. */
  /* CompleteClass */
  override var storageMediumType: typings.winrtUwp.Windows.Media.Import.PhotoImportStorageMediumType = js.native
  /** Gets a value indicating the access modes supported by the storage medium. */
  /* CompleteClass */
  override var supportedAccessMode: typings.winrtUwp.Windows.Media.Import.PhotoImportAccessMode = js.native
  /** Refreshes the information about the storage medium. */
  /* CompleteClass */
  override def refresh(): Unit = js.native
}

