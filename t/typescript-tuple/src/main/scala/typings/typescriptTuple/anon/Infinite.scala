package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Infinite[Default, Tuple /* <: js.Array[_] */] extends StObject {
  
  var empty: Default = js.native
  
  var infinite: js.Any = js.native
  
  var multi: Default = js.native
  
  var single: js.Any = js.native
}
object Infinite {
  
  @scala.inline
  def apply[Default, Tuple /* <: js.Array[_] */](empty: Default, infinite: js.Any, multi: Default, single: js.Any): Infinite[Default, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any])
    __obj.asInstanceOf[Infinite[Default, Tuple]]
  }
  
  @scala.inline
  implicit class InfiniteMutableBuilder[Self <: Infinite[_, _], Default, Tuple /* <: js.Array[_] */] (val x: Self with (Infinite[Default, Tuple])) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: Default): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinite(value: js.Any): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulti(value: Default): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle(value: js.Any): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
  }
}
