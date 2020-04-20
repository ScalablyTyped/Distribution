package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWidth extends js.Object {
  var height: Double
  var heightSegments: Double
  var width: Double
  var widthSegments: Double
}

object AnonWidth {
  @scala.inline
  def apply(height: Double, heightSegments: Double, width: Double, widthSegments: Double): AnonWidth = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWidth]
  }
}

