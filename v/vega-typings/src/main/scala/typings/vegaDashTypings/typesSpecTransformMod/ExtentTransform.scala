package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.vegaDashTypingsStrings.extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentTransform extends _Transforms {
  var field: String | TransformField
  var signal: js.UndefOr[String] = js.undefined
  var `type`: extent
}

object ExtentTransform {
  @scala.inline
  def apply(field: String | TransformField, `type`: extent, signal: String = null): ExtentTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ExtentTransform]
  }
}

