package typings.vueTemplateCompiler.mod

import typings.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerOptionsWithSourceRange
  extends StObject
     with CompilerOptions {
  
  @JSName("outputSourceRange")
  var outputSourceRange_CompilerOptionsWithSourceRange: `true`
}
object CompilerOptionsWithSourceRange {
  
  inline def apply(): CompilerOptionsWithSourceRange = {
    val __obj = js.Dynamic.literal(outputSourceRange = true)
    __obj.asInstanceOf[CompilerOptionsWithSourceRange]
  }
  
  extension [Self <: CompilerOptionsWithSourceRange](x: Self) {
    
    inline def setOutputSourceRange(value: `true`): Self = StObject.set(x, "outputSourceRange", value.asInstanceOf[js.Any])
  }
}
