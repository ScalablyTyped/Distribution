package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fit[Holder /* <: js.Array[js.Any] */, Count /* <: Double */] extends StObject {
  
  var fit: Holder
  
  var unfit: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>> */ js.Object
  
  var union: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> */ js.Object
}
object Fit {
  
  inline def apply[Holder /* <: js.Array[js.Any] */, Count /* <: Double */](
    fit: Holder,
    unfit: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>> */ js.Object,
    union: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> */ js.Object
  ): Fit[Holder, Count] = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], unfit = unfit.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fit[Holder, Count]]
  }
  
  extension [Self <: Fit[?, ?], Holder /* <: js.Array[js.Any] */, Count /* <: Double */](x: Self & (Fit[Holder, Count])) {
    
    inline def setFit(value: Holder): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setUnfit(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>> */ js.Object
    ): Self = StObject.set(x, "unfit", value.asInstanceOf[js.Any])
    
    inline def setUnion(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> */ js.Object
    ): Self = StObject.set(x, "union", value.asInstanceOf[js.Any])
  }
}
