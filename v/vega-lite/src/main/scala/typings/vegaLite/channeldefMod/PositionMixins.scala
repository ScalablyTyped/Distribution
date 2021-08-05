package typings.vegaLite.channeldefMod

import typings.vegaLite.axisMod.Axis
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcImputeMod.ImputeParams
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionMixins extends StObject {
  
  /**
    * An object defining properties of axis's gridlines, ticks and labels.
    * If `null`, the axis for the encoding channel will be removed.
    *
    * __Default value:__ If undefined, default [axis properties](https://vega.github.io/vega-lite/docs/axis.html) are applied.
    *
    * __See also:__ [`axis`](https://vega.github.io/vega-lite/docs/axis.html) documentation.
    */
  var axis: js.UndefOr[(Axis[ExprRef | SignalRef]) | Null] = js.undefined
  
  /**
    * An object defining the properties of the Impute Operation to be applied.
    * The field value of the other positional channel is taken as `key` of the `Impute` Operation.
    * The field of the `color` channel if specified is used as `groupby` of the `Impute` Operation.
    *
    * __See also:__ [`impute`](https://vega.github.io/vega-lite/docs/impute.html) documentation.
    */
  var impute: js.UndefOr[ImputeParams | Null] = js.undefined
}
object PositionMixins {
  
  inline def apply(): PositionMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionMixins]
  }
  
  extension [Self <: PositionMixins](x: Self) {
    
    inline def setAxis(value: Axis[ExprRef | SignalRef]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisNull: Self = StObject.set(x, "axis", null)
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setImpute(value: ImputeParams): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
    
    inline def setImputeNull: Self = StObject.set(x, "impute", null)
    
    inline def setImputeUndefined: Self = StObject.set(x, "impute", js.undefined)
  }
}
