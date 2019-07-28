package typings.winrtDashUwp.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows photo file properties. */
@JSGlobal("Windows.Storage.SystemPhotoProperties")
@js.native
abstract class SystemPhotoProperties () extends js.Object {
  /** Gets the name of the System.Photo.CameraManufacturer property (one of the Windows photo file properties). */
  var cameraManufacturer: String = js.native
  /** Gets the name of the System.Photo.CameraModel property (one of the Windows photo file properties). */
  var cameraModel: String = js.native
  /** Gets the name of the System.Photo.DateTaken property (one of the Windows photo file properties). */
  var dateTaken: String = js.native
  /** Gets the name of the System.Photo.Orientation property (one of the Windows photo file properties). */
  var orientation: String = js.native
  /** Gets the name of the System.Photo.PeopleNames property (one of the Windows photo file properties). */
  var peopleNames: String = js.native
}

