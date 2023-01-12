package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageServicesDiagnostics extends StObject {
  
  def log(content: String): Unit
}
object ILanguageServicesDiagnostics {
  
  inline def apply(log: String => Unit): ILanguageServicesDiagnostics = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[ILanguageServicesDiagnostics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILanguageServicesDiagnostics] (val x: Self) extends AnyVal {
    
    inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
  }
}
