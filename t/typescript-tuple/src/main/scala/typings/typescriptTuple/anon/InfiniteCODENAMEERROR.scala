package typings.typescriptTuple.anon

import typings.typescriptTuple.utilsMod.Concat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteCODENAMEERROR[TupleSet /* <: js.Array[js.Array[_]] */] extends StObject {
  
  var empty: js.Array[js.Any] = js.native
  
  var infinite: CODENAMEERROR = js.native
  
  var nonEmpty: Concat[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
    _
  ] = js.native
}
object InfiniteCODENAMEERROR {
  
  @scala.inline
  def apply[TupleSet /* <: js.Array[js.Array[_]] */](
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
  
  @scala.inline
  implicit class InfiniteCODENAMEERRORMutableBuilder[Self <: InfiniteCODENAMEERROR[_], TupleSet /* <: js.Array[js.Array[_]] */] (val x: Self with InfiniteCODENAMEERROR[TupleSet]) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: js.Array[js.Any]): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyVarargs(value: js.Any*): Self = StObject.set(x, "empty", js.Array(value :_*))
    
    @scala.inline
    def setInfinite(value: CODENAMEERROR): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEmpty(
      value: Concat[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
          _
        ]
    ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
