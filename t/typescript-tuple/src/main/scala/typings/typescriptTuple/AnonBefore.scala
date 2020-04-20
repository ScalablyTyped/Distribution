package typings.typescriptTuple

import typings.typescriptTuple.utilsMod.Reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBefore[Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */] extends js.Object {
  var before: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object
  var end: Reverse[Holder, js.Array[js.Any]]
  var start: js.Any
}

object AnonBefore {
  @scala.inline
  def apply[Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */](
    before: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object,
    end: Reverse[Holder, js.Array[js.Any]],
    start: js.Any
  ): AnonBefore[Tuple, Holder] = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBefore[Tuple, Holder]]
  }
}

