package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows photo file properties. */
trait SystemPhotoProperties extends js.Object {
  /** Gets the name of the System.Photo.CameraManufacturer property (one of the Windows photo file properties). */
  var cameraManufacturer: String
  /** Gets the name of the System.Photo.CameraModel property (one of the Windows photo file properties). */
  var cameraModel: String
  /** Gets the name of the System.Photo.DateTaken property (one of the Windows photo file properties). */
  var dateTaken: String
  /** Gets the name of the System.Photo.Orientation property (one of the Windows photo file properties). */
  var orientation: String
  /** Gets the name of the System.Photo.PeopleNames property (one of the Windows photo file properties). */
  var peopleNames: String
}

object SystemPhotoProperties {
  @scala.inline
  def apply(
    cameraManufacturer: String,
    cameraModel: String,
    dateTaken: String,
    orientation: String,
    peopleNames: String
  ): SystemPhotoProperties = {
    val __obj = js.Dynamic.literal(cameraManufacturer = cameraManufacturer.asInstanceOf[js.Any], cameraModel = cameraModel.asInstanceOf[js.Any], dateTaken = dateTaken.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], peopleNames = peopleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemPhotoProperties]
  }
}

