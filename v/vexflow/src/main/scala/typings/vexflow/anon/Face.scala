package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Face extends js.Object {
  var face: String
  var point: Double
  var style: String
}

object Face {
  @scala.inline
  def apply(face: String, point: Double, style: String): Face = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Face]
  }
}

