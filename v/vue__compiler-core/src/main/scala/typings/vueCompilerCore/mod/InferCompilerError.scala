package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.CompilerError
  - typings.vueCompilerCore.mod.CoreCompilerError
*/
trait InferCompilerError[T] extends StObject
object InferCompilerError {
  
  inline def CompilerError(code: Double | String, message: String, name: String): typings.vueCompilerCore.mod.CompilerError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.CompilerError]
  }
  
  inline def CoreCompilerError(code: ErrorCodes, message: String, name: String): typings.vueCompilerCore.mod.CoreCompilerError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.CoreCompilerError]
  }
}
