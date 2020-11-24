package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LintResult extends js.Object {
  
  var deprecations: js.Array[String] = js.native
  
  var errored: js.UndefOr[Boolean] = js.native
  
  var ignored: js.UndefOr[Boolean] = js.native
  
  var invalidOptionWarnings: js.Array[_] = js.native
  
  var source: String = js.native
  
  var warnings: js.Array[Warning] = js.native
}
object LintResult {
  
  @scala.inline
  def apply(
    deprecations: js.Array[String],
    invalidOptionWarnings: js.Array[_],
    source: String,
    warnings: js.Array[Warning]
  ): LintResult = {
    val __obj = js.Dynamic.literal(deprecations = deprecations.asInstanceOf[js.Any], invalidOptionWarnings = invalidOptionWarnings.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  
  @scala.inline
  implicit class LintResultOps[Self <: LintResult] (val x: Self) extends AnyVal {
    
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
    def setDeprecationsVarargs(value: String*): Self = this.set("deprecations", js.Array(value :_*))
    
    @scala.inline
    def setDeprecations(value: js.Array[String]): Self = this.set("deprecations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidOptionWarningsVarargs(value: js.Any*): Self = this.set("invalidOptionWarnings", js.Array(value :_*))
    
    @scala.inline
    def setInvalidOptionWarnings(value: js.Array[_]): Self = this.set("invalidOptionWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: Warning*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[Warning]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrored(value: Boolean): Self = this.set("errored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrored: Self = this.set("errored", js.undefined)
    
    @scala.inline
    def setIgnored(value: Boolean): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
  }
}
