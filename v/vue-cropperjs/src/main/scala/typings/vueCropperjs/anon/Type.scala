package typings.vueCropperjs.anon

import typings.vueCropperjs.vueCropperjsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var default: `true`
  var `type`: Boolean
}

object Type {
  @scala.inline
  def apply(default: `true`, `type`: Boolean): Type = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

