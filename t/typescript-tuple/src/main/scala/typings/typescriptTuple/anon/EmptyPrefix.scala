package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyPrefix[Prefix /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */] extends StObject {
  
  var empty: Prefix
  
  var infinite: CODENAME
  
  var nonEmpty: js.Any
}
object EmptyPrefix {
  
  inline def apply[Prefix /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */](empty: Prefix, infinite: CODENAME, nonEmpty: js.Any): EmptyPrefix[Prefix, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyPrefix[Prefix, Tuple]]
  }
  
  extension [Self <: EmptyPrefix[?, ?], Prefix /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */](x: Self & (EmptyPrefix[Prefix, Tuple])) {
    
    inline def setEmpty(value: Prefix): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setInfinite(value: CODENAME): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setNonEmpty(value: js.Any): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
