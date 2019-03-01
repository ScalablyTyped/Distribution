package typings
package typedocLib.distLibConverterConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterResult extends js.Object {
  var errors: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  var project: typedocLib.distLibModelsMod.ProjectReflection
}

object ConverterResult {
  @scala.inline
  def apply(
    errors: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    project: typedocLib.distLibModelsMod.ProjectReflection
  ): ConverterResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[ConverterResult]
  }
}

