package typings
package typescriptDashTupleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1Args[Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */] extends js.Object {
  var before: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object
  var end: typescriptDashTupleLib.libUtilsMod.Reverse[Holder, js.Array[js.Any]]
  var start: js.Any
}

object Anon_1Args {
  @scala.inline
  def apply[Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */](
    before: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object,
    end: typescriptDashTupleLib.libUtilsMod.Reverse[Holder, js.Array[js.Any]],
    start: js.Any
  ): Anon_1Args[Tuple, Holder] = {
    val __obj = js.Dynamic.literal(before = before, end = end, start = start)
  
    __obj.asInstanceOf[Anon_1Args[Tuple, Holder]]
  }
}

