package typings.vueTemplateCompiler.mod

import typings.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import org.scalablytyped.runtime.StObject
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
  implicit class CompilerOptionsWithSourceRangeMutableBuilder[Self <: CompilerOptionsWithSourceRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputSourceRange(value: `true`): Self = StObject.set(x, "outputSourceRange", value.asInstanceOf[js.Any])
  }
}
