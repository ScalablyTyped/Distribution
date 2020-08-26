package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about the face. */
@js.native
trait Face extends js.Object {
  /** Age information about a face. */
  var age: js.UndefOr[FaceAge] = js.native
  /** The location of the bounding box around the face. */
  var face_location: js.UndefOr[FaceLocation] = js.native
  /** Information about the gender of the face. */
  var gender: js.UndefOr[FaceGender] = js.native
}

object Face {
  @scala.inline
  def apply(): Face = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Face]
  }
  @scala.inline
  implicit class FaceOps[Self <: Face] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAge(value: FaceAge): Self = this.set("age", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    @scala.inline
    def setFace_location(value: FaceLocation): Self = this.set("face_location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFace_location: Self = this.set("face_location", js.undefined)
    @scala.inline
    def setGender(value: FaceGender): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
  }
  
}

