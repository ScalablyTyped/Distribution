package typings.typedoc.distLibConverterConverterMod

import typings.typedoc.distLibModelsMod.ProjectReflection
import typings.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterResult extends js.Object {
  var errors: js.Array[Diagnostic]
  var project: ProjectReflection
}

object ConverterResult {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], project: ProjectReflection): ConverterResult = {
    val __obj = js.Dynamic.literal(errors = errors, project = project)
  
    __obj.asInstanceOf[ConverterResult]
  }
}

