package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LateBoundPropertyNames extends StObject {
  
  /** Whether all constituents are literal names. */
  var known: Boolean
  
  var names: js.Array[PropertyName]
}
object LateBoundPropertyNames {
  
  inline def apply(known: Boolean, names: js.Array[PropertyName]): LateBoundPropertyNames = {
    val __obj = js.Dynamic.literal(known = known.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[LateBoundPropertyNames]
  }
  
  extension [Self <: LateBoundPropertyNames](x: Self) {
    
    inline def setKnown(value: Boolean): Self = StObject.set(x, "known", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[PropertyName]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: PropertyName*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
