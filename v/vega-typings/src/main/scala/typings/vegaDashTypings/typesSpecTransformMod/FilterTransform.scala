package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.vegaDashTypingsStrings.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterTransform extends _Transforms {
  var expr: String
  var `type`: filter
}

object FilterTransform {
  @scala.inline
  def apply(expr: String, `type`: filter): FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FilterTransform]
  }
}

