package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyLongest[Longest, TupleSet /* <: js.Array[js.Array[_]] */] extends StObject {
  
  var empty: Longest = js.native
  
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any = js.native
}
object EmptyLongest {
  
  @scala.inline
  def apply[Longest, TupleSet /* <: js.Array[js.Array[_]] */](
    empty: Longest,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
  ): EmptyLongest[Longest, TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyLongest[Longest, TupleSet]]
  }
  
  @scala.inline
  implicit class EmptyLongestMutableBuilder[Self <: EmptyLongest[_, _], Longest, TupleSet /* <: js.Array[js.Array[_]] */] (val x: Self with (EmptyLongest[Longest, TupleSet])) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: Longest): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEmpty(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
    ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
