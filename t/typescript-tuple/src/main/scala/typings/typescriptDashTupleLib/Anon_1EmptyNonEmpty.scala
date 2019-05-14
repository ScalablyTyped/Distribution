package typings
package typescriptDashTupleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1EmptyNonEmpty[Longest, TupleSet /* <: js.Array[js.Array[_]] */] extends js.Object {
  var empty: Longest
  var nonEmpty: /* import warning: ImportType.apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
}

object Anon_1EmptyNonEmpty {
  @scala.inline
  def apply[Longest, TupleSet /* <: js.Array[js.Array[_]] */](
    empty: Longest,
    nonEmpty: /* import warning: ImportType.apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
  ): Anon_1EmptyNonEmpty[Longest, TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty)
  
    __obj.asInstanceOf[Anon_1EmptyNonEmpty[Longest, TupleSet]]
  }
}

