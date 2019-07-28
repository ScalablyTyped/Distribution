package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.vegaDashTypingsStrings.extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentTransform extends _Transforms {
  var field: String | TransformField
  var signal: String
  var `type`: extent
}

object ExtentTransform {
  @scala.inline
  def apply(field: String | TransformField, signal: String, `type`: extent): ExtentTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], signal = signal)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExtentTransform]
  }
}

