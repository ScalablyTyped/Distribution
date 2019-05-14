package typings
package typescriptDashTupleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fit[Holder /* <: js.Array[_] */, Count /* <: scala.Double */] extends js.Object {
  var fit: Holder
  var unfit: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>> */ js.Object
  var union: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> */ js.Object
}

object Anon_Fit {
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Count /* <: scala.Double */](
    fit: Holder,
    unfit: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>> */ js.Object,
    union: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> */ js.Object
  ): Anon_Fit[Holder, Count] = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], unfit = unfit, union = union)
  
    __obj.asInstanceOf[Anon_Fit[Holder, Count]]
  }
}

