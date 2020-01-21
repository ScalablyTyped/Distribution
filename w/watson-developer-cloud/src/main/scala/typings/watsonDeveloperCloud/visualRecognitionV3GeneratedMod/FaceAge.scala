package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Age information about a face. */
trait FaceAge extends js.Object {
  /** Estimated maximum age. */
  var max: js.UndefOr[Double] = js.undefined
  /** Estimated minimum age. */
  var min: js.UndefOr[Double] = js.undefined
  /** Confidence score in the range of 0 to 1. A higher score indicates greater confidence in the estimated value for the property. */
  var score: Double
}

object FaceAge {
  @scala.inline
  def apply(score: Double, max: Int | Double = null, min: Int | Double = null): FaceAge = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceAge]
  }
}

