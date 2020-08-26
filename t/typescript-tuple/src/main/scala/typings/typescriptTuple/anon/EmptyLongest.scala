package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyLongest[Longest, TupleSet /* <: js.Array[js.Array[_]] */] extends js.Object {
  var empty: Longest = js.native
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any = js.native
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
  @scala.inline
  implicit class EmptyLongestOps[Self <: EmptyLongest[_, _], Longest, /* <: js.Array[js.Array[_]] */ TupleSet] (val x: Self with (EmptyLongest[Longest, TupleSet])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmpty(value: Longest): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonEmpty(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
    ): Self = this.set("nonEmpty", value.asInstanceOf[js.Any])
  }
  
}

