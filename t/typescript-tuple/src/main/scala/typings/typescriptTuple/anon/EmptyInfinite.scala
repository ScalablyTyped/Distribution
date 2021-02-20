package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyInfinite[NotFound, Tuple /* <: js.Array[_] */, Type, Count /* <: js.Array[_] */] extends StObject {
  
  var empty: NotFound = js.native
  
  var infinite: js.Any = js.native
  
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any = js.native
}
object EmptyInfinite {
  
  @scala.inline
  def apply[NotFound, Tuple /* <: js.Array[_] */, Type, Count /* <: js.Array[_] */](
    empty: NotFound,
    infinite: js.Any,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any
  ): EmptyInfinite[NotFound, Tuple, Type, Count] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyInfinite[NotFound, Tuple, Type, Count]]
  }
  
  @scala.inline
  implicit class EmptyInfiniteMutableBuilder[Self <: EmptyInfinite[_, _, _, _], NotFound, Tuple /* <: js.Array[_] */, Type, Count /* <: js.Array[_] */] (val x: Self with (EmptyInfinite[NotFound, Tuple, Type, Count])) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: NotFound): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinite(value: js.Any): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEmpty(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any
    ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
