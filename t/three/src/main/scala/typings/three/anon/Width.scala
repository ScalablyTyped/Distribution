package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Width extends js.Object {
  var height: Double
  var heightSegments: Double
  var width: Double
  var widthSegments: Double
}

object Width {
  @scala.inline
  def apply(height: Double, heightSegments: Double, width: Double, widthSegments: Double): Width = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
}

