package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuantileTransform extends Transform {
  
  /**
    * The output field names for the probability and quantile values.
    *
    * __Default value:__ `["prob", "value"]`
    */
  var as: js.UndefOr[js.Tuple2[FieldName, FieldName]] = js.native
  
  /**
    * The data fields to group by. If not specified, a single group containing all data objects will be used.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.native
  
  /**
    * An array of probabilities in the range (0, 1) for which to compute quantile values. If not specified, the *step* parameter will be used.
    */
  var probs: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The data field for which to perform quantile estimation.
    */
  var quantile: FieldName = js.native
  
  /**
    * A probability step size (default 0.01) for sampling quantile values. All values from one-half the step size up to 1 (exclusive) will be sampled. This parameter is only used if the *probs* parameter is not provided.
    */
  var step: js.UndefOr[Double] = js.native
}
object QuantileTransform {
  
  @scala.inline
  def apply(quantile: FieldName): QuantileTransform = {
    val __obj = js.Dynamic.literal(quantile = quantile.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantileTransform]
  }
  
  @scala.inline
  implicit class QuantileTransformMutableBuilder[Self <: QuantileTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: js.Tuple2[FieldName, FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setProbs(value: js.Array[Double]): Self = StObject.set(x, "probs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbsUndefined: Self = StObject.set(x, "probs", js.undefined)
    
    @scala.inline
    def setProbsVarargs(value: Double*): Self = StObject.set(x, "probs", js.Array(value :_*))
    
    @scala.inline
    def setQuantile(value: FieldName): Self = StObject.set(x, "quantile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
