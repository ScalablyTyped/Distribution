package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about the face. */
trait Face extends js.Object {
  /** Age information about a face. */
  var age: js.UndefOr[FaceAge] = js.undefined
  /** The location of the bounding box around the face. */
  var face_location: js.UndefOr[FaceLocation] = js.undefined
  /** Information about the gender of the face. */
  var gender: js.UndefOr[FaceGender] = js.undefined
}

object Face {
  @scala.inline
  def apply(age: FaceAge = null, face_location: FaceLocation = null, gender: FaceGender = null): Face = {
    val __obj = js.Dynamic.literal()
    if (age != null) __obj.updateDynamic("age")(age)
    if (face_location != null) __obj.updateDynamic("face_location")(face_location)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    __obj.asInstanceOf[Face]
  }
}

