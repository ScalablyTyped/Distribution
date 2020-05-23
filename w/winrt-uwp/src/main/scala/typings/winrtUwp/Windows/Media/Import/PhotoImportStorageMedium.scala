package typings.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a storage medium exposed by a photo import source device. */
trait PhotoImportStorageMedium extends js.Object {
  /** Gets the available space on the storage medium, in bytes. */
  var availableSpaceInBytes: Double
  /** Gets the capacity of the storage media, in bytes. */
  var capacityInBytes: Double
  /** Gets a description of the storage medium. */
  var description: String
  /** Gets the name of the storage medium. */
  var name: String
  /** Gets the serial number of the storage medium. */
  var serialNumber: String
  /** Gets the type of the storage medium. */
  var storageMediumType: PhotoImportStorageMediumType
  /** Gets a value indicating the access modes supported by the storage medium. */
  var supportedAccessMode: PhotoImportAccessMode
  /** Refreshes the information about the storage medium. */
  def refresh(): Unit
}

object PhotoImportStorageMedium {
  @scala.inline
  def apply(
    availableSpaceInBytes: Double,
    capacityInBytes: Double,
    description: String,
    name: String,
    refresh: () => Unit,
    serialNumber: String,
    storageMediumType: PhotoImportStorageMediumType,
    supportedAccessMode: PhotoImportAccessMode
  ): PhotoImportStorageMedium = {
    val __obj = js.Dynamic.literal(availableSpaceInBytes = availableSpaceInBytes.asInstanceOf[js.Any], capacityInBytes = capacityInBytes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), serialNumber = serialNumber.asInstanceOf[js.Any], storageMediumType = storageMediumType.asInstanceOf[js.Any], supportedAccessMode = supportedAccessMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportStorageMedium]
  }
}

