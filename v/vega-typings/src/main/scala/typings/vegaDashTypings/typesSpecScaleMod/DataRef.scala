package typings.vegaDashTypings.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRef extends js.Object {
  var data: String
  var field: ScaleField
}

object DataRef {
  @scala.inline
  def apply(data: String, field: ScaleField): DataRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataRef]
  }
}

