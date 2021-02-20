package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyNonEmpty[Shortest, TupleSet /* <: js.Array[js.Array[_]] */] extends StObject {
  
  var empty: Shortest = js.native
  
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any = js.native
}
object EmptyNonEmpty {
  
  @scala.inline
  def apply[Shortest, TupleSet /* <: js.Array[js.Array[_]] */](
    empty: Shortest,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any
  ): EmptyNonEmpty[Shortest, TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyNonEmpty[Shortest, TupleSet]]
  }
  
  @scala.inline
  implicit class EmptyNonEmptyMutableBuilder[Self <: EmptyNonEmpty[_, _], Shortest, TupleSet /* <: js.Array[js.Array[_]] */] (val x: Self with (EmptyNonEmpty[Shortest, TupleSet])) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: Shortest): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEmpty(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any
    ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
