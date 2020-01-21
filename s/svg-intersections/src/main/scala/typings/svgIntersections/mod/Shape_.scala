package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape_ extends js.Object {
  var meta: js.Object
  var params: js.Object
  var `type`: String
}

object Shape_ {
  @scala.inline
  def apply(meta: js.Object, params: js.Object, `type`: String): Shape_ = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape_]
  }
}

