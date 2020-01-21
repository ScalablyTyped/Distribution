package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Results for all faces. */
trait DetectedFaces extends js.Object {
  /** The images. */
  var images: js.Array[ImageWithFaces]
  /** Number of images processed for the API call. */
  var images_processed: Double
  /** Information about what might cause less than optimal output. For example, a request sent with a corrupt .zip file and a list of image URLs will still complete, but does not return the expected output. Not returned when there is no warning. */
  var warnings: js.UndefOr[js.Array[WarningInfo]] = js.undefined
}

object DetectedFaces {
  @scala.inline
  def apply(images: js.Array[ImageWithFaces], images_processed: Double, warnings: js.Array[WarningInfo] = null): DetectedFaces = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], images_processed = images_processed.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedFaces]
  }
}

