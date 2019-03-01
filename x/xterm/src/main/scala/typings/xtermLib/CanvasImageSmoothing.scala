package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasImageSmoothing extends js.Object {
  var imageSmoothingEnabled: scala.Boolean
  var imageSmoothingQuality: ImageSmoothingQuality
}

object CanvasImageSmoothing {
  @scala.inline
  def apply(imageSmoothingEnabled: scala.Boolean, imageSmoothingQuality: ImageSmoothingQuality): CanvasImageSmoothing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imageSmoothingEnabled")(imageSmoothingEnabled)
    __obj.updateDynamic("imageSmoothingQuality")(imageSmoothingQuality)
    __obj.asInstanceOf[CanvasImageSmoothing]
  }
}

