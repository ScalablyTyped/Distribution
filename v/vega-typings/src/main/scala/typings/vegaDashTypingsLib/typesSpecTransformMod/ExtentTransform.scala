package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentTransform extends _Transforms {
  var field: java.lang.String | TransformField
  var signal: java.lang.String
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.extent
}

object ExtentTransform {
  @scala.inline
  def apply(
    field: java.lang.String | TransformField,
    signal: java.lang.String,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.extent
  ): ExtentTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], signal = signal)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExtentTransform]
  }
}

