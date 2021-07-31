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
  
  @scala.inline
  def apply[Prefix /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */](empty: Prefix, infinite: CODENAME, nonEmpty: js.Any): EmptyPrefix[Prefix, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyPrefix[Prefix, Tuple]]
  }
  
  @scala.inline
  implicit class EmptyPrefixMutableBuilder[Self <: EmptyPrefix[?, ?], Prefix /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */] (val x: Self & (EmptyPrefix[Prefix, Tuple])) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: Prefix): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinite(value: CODENAME): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEmpty(value: js.Any): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
