package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyPrefix[Prefix /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends StObject {
  
  var empty: Prefix = js.native
  
  var infinite: CODENAME = js.native
  
  var nonEmpty: js.Any = js.native
}
object EmptyPrefix {
  
  @scala.inline
  def apply[Prefix /* <: js.Array[_] */, Tuple /* <: js.Array[_] */](empty: Prefix, infinite: CODENAME, nonEmpty: js.Any): EmptyPrefix[Prefix, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyPrefix[Prefix, Tuple]]
  }
  
  @scala.inline
  implicit class EmptyPrefixMutableBuilder[Self <: EmptyPrefix[_, _], Prefix /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] (val x: Self with (EmptyPrefix[Prefix, Tuple])) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: Prefix): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinite(value: CODENAME): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEmpty(value: js.Any): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
