package typings.typescriptTuple.anon

import typings.typescriptTuple.utilsMod.Reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Before[Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */] extends StObject {
  
  var before: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object = js.native
  
  var end: Reverse[Holder, js.Array[js.Any]] = js.native
  
  var start: js.Any = js.native
}
object Before {
  
  @scala.inline
  def apply[Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */](
    before: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object,
    end: Reverse[Holder, js.Array[js.Any]],
    start: js.Any
  ): Before[Tuple, Holder] = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before[Tuple, Holder]]
  }
  
  @scala.inline
  implicit class BeforeMutableBuilder[Self <: Before[_, _], Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */] (val x: Self with (Before[Tuple, Holder])) extends AnyVal {
    
    @scala.inline
    def setBefore(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object
    ): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Reverse[Holder, js.Array[js.Any]]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
