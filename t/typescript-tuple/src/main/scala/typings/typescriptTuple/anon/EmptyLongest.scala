package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyLongest[Longest, TupleSet /* <: js.Array[js.Array[_]] */] extends js.Object {
  var empty: Longest
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
}

object EmptyLongest {
  @scala.inline
  def apply[Longest, /* <: js.Array[js.Array[_]] */ TupleSet](
    empty: Longest,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
  ): EmptyLongest[Longest, TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyLongest[Longest, TupleSet]]
  }
}

