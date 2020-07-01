package typings.typescriptTuple.anon

import typings.typescriptTuple.utilsMod.Reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Before[Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */] extends js.Object {
  var before: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object
  var end: Reverse[Holder, js.Array[js.Any]]
  var start: js.Any
}

object Before {
  @scala.inline
  def apply[/* <: js.Array[_] */ Tuple, /* <: js.Array[_] */ Holder](
    before: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object,
    end: Reverse[Holder, js.Array[js.Any]],
    start: js.Any
  ): Before[Tuple, Holder] = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before[Tuple, Holder]]
  }
}

