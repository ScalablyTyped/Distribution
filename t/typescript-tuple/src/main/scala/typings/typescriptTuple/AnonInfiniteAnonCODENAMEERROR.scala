package typings.typescriptTuple

import typings.typescriptTuple.utilsMod.Concat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfiniteAnonCODENAMEERROR[TupleSet /* <: js.Array[js.Array[_]] */] extends js.Object {
  var empty: js.Array[js.Any]
  var infinite: AnonCODENAMEERROR
  var nonEmpty: Concat[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
    _
  ]
}

object AnonInfiniteAnonCODENAMEERROR {
  @scala.inline
  def apply[TupleSet /* <: js.Array[js.Array[_]] */](
    empty: js.Array[js.Any],
    infinite: AnonCODENAMEERROR,
    nonEmpty: Concat[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
      _
    ]
  ): AnonInfiniteAnonCODENAMEERROR[TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInfiniteAnonCODENAMEERROR[TupleSet]]
  }
}

