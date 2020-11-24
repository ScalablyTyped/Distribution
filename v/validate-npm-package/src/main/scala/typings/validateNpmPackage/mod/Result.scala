package typings.validateNpmPackage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var errors: js.Array[String] = js.native
  
  var validForNewPackages: Boolean = js.native
  
  var validForOldPackages: Boolean = js.native
  
  var warnings: js.Array[String] = js.native
}
object Result {
  
  @scala.inline
  def apply(
    errors: js.Array[String],
    validForNewPackages: Boolean,
    validForOldPackages: Boolean,
    warnings: js.Array[String]
  ): Result = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], validForNewPackages = validForNewPackages.asInstanceOf[js.Any], validForOldPackages = validForOldPackages.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidForNewPackages(value: Boolean): Self = this.set("validForNewPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidForOldPackages(value: Boolean): Self = this.set("validForOldPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
  }
}
