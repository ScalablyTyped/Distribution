package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "UploadingFileError")
@js.native
class UploadingFileError protected () extends SurveyError {
  def this(text: String) = this()
  def this(text: String, errorOwner: ISurveyErrorOwner) = this()
}

