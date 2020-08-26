package typings.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exponent extends js.Object {
  var exponent: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.native
  var extra: js.UndefOr[Boolean] = js.native
  var mult: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.native
  var offset: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.native
  var round: js.UndefOr[Boolean] = js.native
}

object Exponent {
  @scala.inline
  def apply(): Exponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exponent]
  }
  @scala.inline
  implicit class ExponentOps[Self <: Exponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExponent(
      value: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
    ): Self = this.set("exponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponent: Self = this.set("exponent", js.undefined)
    @scala.inline
    def setExtra(value: Boolean): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setMult(
      value: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
    ): Self = this.set("mult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMult: Self = this.set("mult", js.undefined)
    @scala.inline
    def setOffset(
      value: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
    ): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
  }
  
}

