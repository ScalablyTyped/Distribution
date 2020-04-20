package typings.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleDataRef extends js.Object {
  var data: String
  var field: ScaleField
}

object ScaleDataRef {
  @scala.inline
  def apply(data: String, field: ScaleField): ScaleDataRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleDataRef]
  }
}

