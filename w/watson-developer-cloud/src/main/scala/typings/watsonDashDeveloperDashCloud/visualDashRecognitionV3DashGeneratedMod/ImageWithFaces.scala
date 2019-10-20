package typings.watsonDashDeveloperDashCloud.visualDashRecognitionV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about faces in the image. */
trait ImageWithFaces extends js.Object {
  /** Information about what might have caused a failure, such as an image that is too large. Not returned when there is no error. */
  var error: js.UndefOr[ErrorInfo] = js.undefined
  /** Faces detected in the images. */
  var faces: js.Array[Face]
  /** Relative path of the image file if uploaded directly. Not returned when the image is passed by URL. */
  var image: js.UndefOr[String] = js.undefined
  /** Fully resolved URL of the image after redirects are followed. Not returned when the image is uploaded. */
  var resolved_url: js.UndefOr[String] = js.undefined
  /** Source of the image before any redirects. Not returned when the image is uploaded. */
  var source_url: js.UndefOr[String] = js.undefined
}

object ImageWithFaces {
  @scala.inline
  def apply(
    faces: js.Array[Face],
    error: ErrorInfo = null,
    image: String = null,
    resolved_url: String = null,
    source_url: String = null
  ): ImageWithFaces = {
    val __obj = js.Dynamic.literal(faces = faces)
    if (error != null) __obj.updateDynamic("error")(error)
    if (image != null) __obj.updateDynamic("image")(image)
    if (resolved_url != null) __obj.updateDynamic("resolved_url")(resolved_url)
    if (source_url != null) __obj.updateDynamic("source_url")(source_url)
    __obj.asInstanceOf[ImageWithFaces]
  }
}

