package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuantileTransform
  extends StObject
     with Transform {
  
  /**
    * The output field names for the probability and quantile values.
    *
    * __Default value:__ `["prob", "value"]`
    */
  var as: js.UndefOr[js.Tuple2[FieldName, FieldName]] = js.undefined
  
  /**
    * The data fields to group by. If not specified, a single group containing all data objects will be used.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.undefined
  
  /**
    * An array of probabilities in the range (0, 1) for which to compute quantile values. If not specified, the *step* parameter will be used.
    */
  var probs: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The data field for which to perform quantile estimation.
    */
  var quantile: FieldName
  
  /**
    * A probability step size (default 0.01) for sampling quantile values. All values from one-half the step size up to 1 (exclusive) will be sampled. This parameter is only used if the *probs* parameter is not provided.
    */
  var step: js.UndefOr[Double] = js.undefined
}
object QuantileTransform {
  
  inline def apply(quantile: FieldName): QuantileTransform = {
    val __obj = js.Dynamic.literal(quantile = quantile.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantileTransform]
  }
  
  extension [Self <: QuantileTransform](x: Self) {
    
    inline def setAs(value: js.Tuple2[FieldName, FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    inline def setProbs(value: js.Array[Double]): Self = StObject.set(x, "probs", value.asInstanceOf[js.Any])
    
    inline def setProbsUndefined: Self = StObject.set(x, "probs", js.undefined)
    
    inline def setProbsVarargs(value: Double*): Self = StObject.set(x, "probs", js.Array(value :_*))
    
    inline def setQuantile(value: FieldName): Self = StObject.set(x, "quantile", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
