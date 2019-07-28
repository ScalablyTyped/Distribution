package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exponent extends js.Object {
  var exponent: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.undefined
  var extra: js.UndefOr[Boolean] = js.undefined
  var mult: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.undefined
  var offset: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
}

object Anon_Exponent {
  @scala.inline
  def apply(
    exponent: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object) = null,
    extra: js.UndefOr[Boolean] = js.undefined,
    mult: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object) = null,
    offset: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object) = null,
    round: js.UndefOr[Boolean] = js.undefined
  ): Anon_Exponent = {
    val __obj = js.Dynamic.literal()
    if (exponent != null) __obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
    if (!js.isUndefined(extra)) __obj.updateDynamic("extra")(extra)
    if (mult != null) __obj.updateDynamic("mult")(mult.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    __obj.asInstanceOf[Anon_Exponent]
  }
}

