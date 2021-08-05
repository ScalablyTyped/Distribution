package typings.typescriptTuple.anon

import typings.typescriptTuple.utilsMod.Concat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfiniteCODENAMEERROR[TupleSet /* <: js.Array[js.Array[js.Any]] */] extends StObject {
  
  var empty: js.Array[js.Any]
  
  var infinite: CODENAMEERROR
  
  var nonEmpty: Concat[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
    js.Any
  ]
}
object InfiniteCODENAMEERROR {
  
  inline def apply[TupleSet /* <: js.Array[js.Array[js.Any]] */](
    empty: js.Array[js.Any],
    infinite: CODENAMEERROR,
    nonEmpty: Concat[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
      js.Any
    ]
  ): InfiniteCODENAMEERROR[TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteCODENAMEERROR[TupleSet]]
  }
  
  extension [Self <: InfiniteCODENAMEERROR[?], TupleSet /* <: js.Array[js.Array[js.Any]] */](x: Self & InfiniteCODENAMEERROR[TupleSet]) {
    
    inline def setEmpty(value: js.Array[js.Any]): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyVarargs(value: js.Any*): Self = StObject.set(x, "empty", js.Array(value :_*))
    
    inline def setInfinite(value: CODENAMEERROR): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setNonEmpty(
      value: Concat[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
          js.Any
        ]
    ): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
