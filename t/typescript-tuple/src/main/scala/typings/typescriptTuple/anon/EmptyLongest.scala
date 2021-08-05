package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyLongest[Longest, TupleSet /* <: js.Array[js.Array[js.Any]] */] extends StObject {
  
  var empty: Longest
  
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
}
object EmptyLongest {
  
  inline def apply[Longest, TupleSet /* <: js.Array[js.Array[js.Any]] */](
    empty: Longest,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
  ): EmptyLongest[Longest, TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyLongest[Longest, TupleSet]]
  }
  
  extension [Self <: EmptyLongest[?, ?], Longest, TupleSet /* <: js.Array[js.Array[js.Any]] */](x: Self & (EmptyLongest[Longest, TupleSet])) {
    
    inline def setEmpty(value: Longest): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setNonEmpty(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
    ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
