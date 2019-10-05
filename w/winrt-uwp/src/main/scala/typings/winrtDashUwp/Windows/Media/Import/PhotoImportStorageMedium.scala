package typings.winrtDashUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a storage medium exposed by a photo import source device. */
@JSGlobal("Windows.Media.Import.PhotoImportStorageMedium")
@js.native
abstract class PhotoImportStorageMedium () extends js.Object {
  /** Gets the available space on the storage medium, in bytes. */
  var availableSpaceInBytes: Double = js.native
  /** Gets the capacity of the storage media, in bytes. */
  var capacityInBytes: Double = js.native
  /** Gets a description of the storage medium. */
  var description: String = js.native
  /** Gets the name of the storage medium. */
  var name: String = js.native
  /** Gets the serial number of the storage medium. */
  var serialNumber: String = js.native
  /** Gets the type of the storage medium. */
  var storageMediumType: PhotoImportStorageMediumType = js.native
  /** Gets a value indicating the access modes supported by the storage medium. */
  var supportedAccessMode: PhotoImportAccessMode = js.native
  /** Refreshes the information about the storage medium. */
  def refresh(): Unit = js.native
}

