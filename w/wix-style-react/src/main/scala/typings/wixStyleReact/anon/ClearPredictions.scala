package typings.wixStyleReact.anon

import typings.lodash.mod.DebouncedFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearPredictions extends StObject {
  
  /** function that clears predictions array and sets loading state to false */
  def clearPredictions(): Unit
  
  /** whether fetch request is ongoing */
  var loading: Boolean
  
  /** array of prediction results */
  var predictions: js.Array[scala.Nothing]
  
  /** (value: string, requestOptions?: RequestOptions) => void
    * fetches predictions for given value from client (debounced)
    * and sets results to prediction state.
    *
    * Can also receive requestOptions,
    * which are client specific options to pass to the request */
  var updatePredictions: DebouncedFunc[js.Function1[/* args */ Any, Unit]]
}
object ClearPredictions {
  
  inline def apply(
    clearPredictions: () => Unit,
    loading: Boolean,
    predictions: js.Array[scala.Nothing],
    updatePredictions: DebouncedFunc[js.Function1[/* args */ Any, Unit]]
  ): ClearPredictions = {
    val __obj = js.Dynamic.literal(clearPredictions = js.Any.fromFunction0(clearPredictions), loading = loading.asInstanceOf[js.Any], predictions = predictions.asInstanceOf[js.Any], updatePredictions = updatePredictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearPredictions]
  }
  
  extension [Self <: ClearPredictions](x: Self) {
    
    inline def setClearPredictions(value: () => Unit): Self = StObject.set(x, "clearPredictions", js.Any.fromFunction0(value))
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setPredictions(value: js.Array[scala.Nothing]): Self = StObject.set(x, "predictions", value.asInstanceOf[js.Any])
    
    inline def setPredictionsVarargs(value: scala.Nothing*): Self = StObject.set(x, "predictions", js.Array(value*))
    
    inline def setUpdatePredictions(value: DebouncedFunc[js.Function1[/* args */ Any, Unit]]): Self = StObject.set(x, "updatePredictions", value.asInstanceOf[js.Any])
  }
}
