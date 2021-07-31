package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyInfinite[NotFound, Tuple /* <: js.Array[js.Any] */, Type, Count /* <: js.Array[js.Any] */] extends StObject {
  
  var empty: NotFound
  
  var infinite: js.Any
  
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any
}
object EmptyInfinite {
  
  @scala.inline
  def apply[NotFound, Tuple /* <: js.Array[js.Any] */, Type, Count /* <: js.Array[js.Any] */](
    empty: NotFound,
    infinite: js.Any,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any
  ): EmptyInfinite[NotFound, Tuple, Type, Count] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyInfinite[NotFound, Tuple, Type, Count]]
  }
  
  @scala.inline
  implicit class EmptyInfiniteMutableBuilder[Self <: EmptyInfinite[?, ?, ?, ?], NotFound, Tuple /* <: js.Array[js.Any] */, Type, Count /* <: js.Array[js.Any] */] (val x: Self & (EmptyInfinite[NotFound, Tuple, Type, Count])) extends AnyVal {
    
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
