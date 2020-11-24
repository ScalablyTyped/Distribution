package typings.vueTemplateCompiler.mod

import typings.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilerOptionsWithSourceRange extends CompilerOptions {
  
  @JSName("outputSourceRange")
  var outputSourceRange_CompilerOptionsWithSourceRange: `true` = js.native
}
object CompilerOptionsWithSourceRange {
  
  @scala.inline
  def apply(outputSourceRange: `true`): CompilerOptionsWithSourceRange = {
    val __obj = js.Dynamic.literal(outputSourceRange = outputSourceRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerOptionsWithSourceRange]
  }
  
  @scala.inline
  implicit class CompilerOptionsWithSourceRangeOps[Self <: CompilerOptionsWithSourceRange] (val x: Self) extends AnyVal {
    
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
    def setOutputSourceRange(value: `true`): Self = this.set("outputSourceRange", value.asInstanceOf[js.Any])
  }
}
