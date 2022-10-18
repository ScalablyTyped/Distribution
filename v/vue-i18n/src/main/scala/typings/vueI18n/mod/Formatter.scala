package typings.vueI18n.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatter extends StObject {
  
  def interpolate(message: String, values: Any, path: String): js.Array[Any] | Null
}
object Formatter {
  
  inline def apply(interpolate: (String, Any, String) => js.Array[Any] | Null): Formatter = {
    val __obj = js.Dynamic.literal(interpolate = js.Any.fromFunction3(interpolate))
    __obj.asInstanceOf[Formatter]
  }
  
  extension [Self <: Formatter](x: Self) {
    
    inline def setInterpolate(value: (String, Any, String) => js.Array[Any] | Null): Self = StObject.set(x, "interpolate", js.Any.fromFunction3(value))
  }
}
