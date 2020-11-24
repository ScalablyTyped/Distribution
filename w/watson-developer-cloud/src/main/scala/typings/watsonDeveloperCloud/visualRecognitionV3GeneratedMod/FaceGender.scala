package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the gender of the face. */
@js.native
trait FaceGender extends js.Object {
  
  /** Gender identified by the face. For example, `MALE` or `FEMALE`. */
  var gender: String = js.native
  
  /** The word for "male" or "female" in the language defined by the **Accept-Language** request header. */
  var gender_label: String = js.native
  
  /** Confidence score in the range of 0 to 1. A higher score indicates greater confidence in the estimated value for the property. */
  var score: Double = js.native
}
object FaceGender {
  
  @scala.inline
  def apply(gender: String, gender_label: String, score: Double): FaceGender = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], gender_label = gender_label.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceGender]
  }
  
  @scala.inline
  implicit class FaceGenderOps[Self <: FaceGender] (val x: Self) extends AnyVal {
    
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
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGender_label(value: String): Self = this.set("gender_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
}
