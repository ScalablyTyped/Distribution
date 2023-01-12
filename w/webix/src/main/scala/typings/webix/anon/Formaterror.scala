package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formaterror extends StObject {
  
  var `format-error`: String
  
  var `math-error`: String
  
  var `math-ref-error`: String
}
object Formaterror {
  
  inline def apply(`format-error`: String, `math-error`: String, `math-ref-error`: String): Formaterror = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format-error")(`format-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("math-error")(`math-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("math-ref-error")(`math-ref-error`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formaterror]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Formaterror] (val x: Self) extends AnyVal {
    
    inline def `setFormat-error`(value: String): Self = StObject.set(x, "format-error", value.asInstanceOf[js.Any])
    
    inline def `setMath-error`(value: String): Self = StObject.set(x, "math-error", value.asInstanceOf[js.Any])
    
    inline def `setMath-ref-error`(value: String): Self = StObject.set(x, "math-ref-error", value.asInstanceOf[js.Any])
  }
}
