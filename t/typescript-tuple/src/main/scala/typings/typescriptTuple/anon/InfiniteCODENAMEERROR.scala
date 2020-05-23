package typings.typescriptTuple.anon

import typings.typescriptTuple.utilsMod.Concat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteCODENAMEERROR[TupleSet /* <: js.Array[js.Array[_]] */] extends js.Object {
  var empty: js.Array[js.Any]
  var infinite: CODENAMEERROR
  var nonEmpty: Concat[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
    _
  ]
}

object InfiniteCODENAMEERROR {
  @scala.inline
  def apply[TupleSet](
    empty: js.Array[js.Any],
    infinite: CODENAMEERROR,
    nonEmpty: Concat[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
      _
    ]
  ): InfiniteCODENAMEERROR[TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteCODENAMEERROR[TupleSet]]
  }
}

