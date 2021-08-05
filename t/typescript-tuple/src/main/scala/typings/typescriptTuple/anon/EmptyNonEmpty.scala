package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyNonEmpty[Shortest, TupleSet /* <: js.Array[js.Array[js.Any]] */] extends StObject {
  
  var empty: Shortest
  
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any
}
object EmptyNonEmpty {
  
  inline def apply[Shortest, TupleSet /* <: js.Array[js.Array[js.Any]] */](
    empty: Shortest,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any
  ): EmptyNonEmpty[Shortest, TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyNonEmpty[Shortest, TupleSet]]
  }
  
  extension [Self <: EmptyNonEmpty[?, ?], Shortest, TupleSet /* <: js.Array[js.Array[js.Any]] */](x: Self & (EmptyNonEmpty[Shortest, TupleSet])) {
    
    inline def setEmpty(value: Shortest): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setNonEmpty(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any
    ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
