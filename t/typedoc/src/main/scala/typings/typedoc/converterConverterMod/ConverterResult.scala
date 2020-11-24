package typings.typedoc.converterConverterMod

import typings.typedoc.modelsMod.ProjectReflection
import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterResult extends js.Object {
  
  var errors: js.Array[Diagnostic] = js.native
  
  var project: ProjectReflection = js.native
}
object ConverterResult {
  
  @scala.inline
  def apply(errors: js.Array[Diagnostic], project: ProjectReflection): ConverterResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterResult]
  }
  
  @scala.inline
  implicit class ConverterResultOps[Self <: ConverterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorsVarargs(value: Diagnostic*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Diagnostic]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ProjectReflection): Self = this.set("project", value.asInstanceOf[js.Any])
  }
}
