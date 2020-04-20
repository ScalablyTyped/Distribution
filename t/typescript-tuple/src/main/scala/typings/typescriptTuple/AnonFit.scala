package typings.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFit[Holder /* <: js.Array[_] */, Count /* <: Double */] extends js.Object {
  var fit: Holder
  var unfit: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>> */ js.Object
  var union: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> */ js.Object
}

object AnonFit {
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Count /* <: Double */](
    fit: Holder,
    unfit: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>> */ js.Object,
    union: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> */ js.Object
  ): AnonFit[Holder, Count] = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], unfit = unfit.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFit[Holder, Count]]
  }
}

