package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompilerDiagnostics {
  
  trait IDiagnosticWriter extends StObject {
    
    def Alert(output: String): Unit
  }
  object IDiagnosticWriter {
    
    inline def apply(Alert: String => Unit): IDiagnosticWriter = {
      val __obj = js.Dynamic.literal(Alert = js.Any.fromFunction1(Alert))
      __obj.asInstanceOf[IDiagnosticWriter]
    }
    
    extension [Self <: IDiagnosticWriter](x: Self) {
      
      inline def setAlert(value: String => Unit): Self = StObject.set(x, "Alert", js.Any.fromFunction1(value))
    }
  }
}
