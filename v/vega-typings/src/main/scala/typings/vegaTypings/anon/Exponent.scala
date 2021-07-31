package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exponent extends StObject {
  
  var exponent: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.undefined
  
  var extra: js.UndefOr[Boolean] = js.undefined
  
  var mult: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.undefined
  
  var offset: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.undefined
  
  var round: js.UndefOr[Boolean] = js.undefined
}
object Exponent {
  
  @scala.inline
  def apply(): Exponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exponent]
  }
  
  @scala.inline
  implicit class ExponentMutableBuilder[Self <: Exponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExponent(
      value: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
    ): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
    
    @scala.inline
    def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setMult(
      value: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
    ): Self = StObject.set(x, "mult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultUndefined: Self = StObject.set(x, "mult", js.undefined)
    
    @scala.inline
    def setOffset(
      value: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
    ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
  }
}
