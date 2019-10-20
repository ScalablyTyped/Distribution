package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** RecognitionJobs. */
trait RecognitionJobs extends js.Object {
  /** An array of `RecognitionJob` objects that provides the status for each of the user's current jobs. The array is empty if the user has no current jobs. */
  var recognitions: js.Array[RecognitionJob]
}

object RecognitionJobs {
  @scala.inline
  def apply(recognitions: js.Array[RecognitionJob]): RecognitionJobs = {
    val __obj = js.Dynamic.literal(recognitions = recognitions)
  
    __obj.asInstanceOf[RecognitionJobs]
  }
}

