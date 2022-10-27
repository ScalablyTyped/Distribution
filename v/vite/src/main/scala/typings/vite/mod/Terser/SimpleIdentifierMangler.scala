package typings.vite.mod.Terser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleIdentifierMangler extends StObject {
  
  /**
    * Obtains the nth most favored (usually shortest) identifier to rename a variable to.
    * The mangler will increment n and retry until the return value is not in use in scope, and is not a reserved word.
    * This function is expected to be stable; Evaluating get(n) === get(n) should always return true.
    * @param n - The ordinal of the identifier.
    */
  def get(n: Double): String
}
object SimpleIdentifierMangler {
  
  inline def apply(get: Double => String): SimpleIdentifierMangler = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[SimpleIdentifierMangler]
  }
  
  extension [Self <: SimpleIdentifierMangler](x: Self) {
    
    inline def setGet(value: Double => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
