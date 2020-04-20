package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The location of the bounding box around the face. */
trait FaceLocation extends js.Object {
  /** Height in pixels of face region. */
  var height: Double
  /** X-position of top-left pixel of face region. */
  var left: Double
  /** Y-position of top-left pixel of face region. */
  var top: Double
  /** Width in pixels of face region. */
  var width: Double
}

object FaceLocation {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): FaceLocation = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceLocation]
  }
}

