package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S extends StObject {
  
  var s: String
}
object S {
  
  inline def apply(s: String): S = {
    val __obj = js.Dynamic.literal(s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[S]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S] (val x: Self) extends AnyVal {
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
