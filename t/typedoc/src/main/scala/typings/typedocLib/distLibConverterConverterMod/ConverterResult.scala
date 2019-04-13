package typings
package typedocLib.distLibConverterConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterResult extends js.Object {
  var errors: js.Array[typescriptLib.typescriptMod.Diagnostic]
  var project: typedocLib.distLibModelsMod.ProjectReflection
}

object ConverterResult {
  @scala.inline
  def apply(
    errors: js.Array[typescriptLib.typescriptMod.Diagnostic],
    project: typedocLib.distLibModelsMod.ProjectReflection
  ): ConverterResult = {
    val __obj = js.Dynamic.literal(errors = errors, project = project)
  
    __obj.asInstanceOf[ConverterResult]
  }
}

