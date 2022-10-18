package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in 'typescript' ]: object} */
trait CompilerOptions extends StObject {
  
  var typescript: js.Object
}
object CompilerOptions {
  
  inline def apply(typescript: js.Object): CompilerOptions = {
    val __obj = js.Dynamic.literal(typescript = typescript.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerOptions]
  }
  
  extension [Self <: CompilerOptions](x: Self) {
    
    inline def setTypescript(value: js.Object): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
  }
}
