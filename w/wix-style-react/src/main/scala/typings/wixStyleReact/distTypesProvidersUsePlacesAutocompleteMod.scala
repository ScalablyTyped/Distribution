package typings.wixStyleReact

import typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod.AutocompleteClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProvidersUsePlacesAutocompleteMod {
  
  @JSImport("wix-style-react/dist/types/providers/usePlacesAutocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Prediction, Address, RequestOptions](): UsePlacesAutocompleteReturn[Prediction, RequestOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[UsePlacesAutocompleteReturn[Prediction, RequestOptions]]
  inline def default[Prediction, Address, RequestOptions](props: UsePlacesAutocompleteProps[Prediction, Address, RequestOptions]): UsePlacesAutocompleteReturn[Prediction, RequestOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[UsePlacesAutocompleteReturn[Prediction, RequestOptions]]
  
  type UpdatePredictions[RequestOptions] = js.Function2[/* value */ String, /* requestOptions */ js.UndefOr[RequestOptions], Unit]
  
  trait UsePlacesAutocompleteProps[Prediction, Address, RequestOptions] extends StObject {
    
    var client: AutocompleteClient[Prediction, Address, RequestOptions]
    
    var debounceFn: js.UndefOr[js.Function2[/* callback */ js.Function, /* debounceMs */ Double, js.Function]] = js.undefined
    
    var debounceMs: js.UndefOr[Double] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Any]] = js.undefined
  }
  object UsePlacesAutocompleteProps {
    
    inline def apply[Prediction, Address, RequestOptions](client: AutocompleteClient[Prediction, Address, RequestOptions]): UsePlacesAutocompleteProps[Prediction, Address, RequestOptions] = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsePlacesAutocompleteProps[Prediction, Address, RequestOptions]]
    }
    
    extension [Self <: UsePlacesAutocompleteProps[?, ?, ?], Prediction, Address, RequestOptions](x: Self & (UsePlacesAutocompleteProps[Prediction, Address, RequestOptions])) {
      
      inline def setClient(value: AutocompleteClient[Prediction, Address, RequestOptions]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setDebounceFn(value: (/* callback */ js.Function, /* debounceMs */ Double) => js.Function): Self = StObject.set(x, "debounceFn", js.Any.fromFunction2(value))
      
      inline def setDebounceFnUndefined: Self = StObject.set(x, "debounceFn", js.undefined)
      
      inline def setDebounceMs(value: Double): Self = StObject.set(x, "debounceMs", value.asInstanceOf[js.Any])
      
      inline def setDebounceMsUndefined: Self = StObject.set(x, "debounceMs", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
  
  trait UsePlacesAutocompleteReturn[Prediction, RequestOptions] extends StObject {
    
    def clearPredictions(): Unit
    
    var loading: Boolean
    
    var predictions: js.Array[Prediction]
    
    var updatePredictions: UpdatePredictions[RequestOptions]
  }
  object UsePlacesAutocompleteReturn {
    
    inline def apply[Prediction, RequestOptions](
      clearPredictions: () => Unit,
      loading: Boolean,
      predictions: js.Array[Prediction],
      updatePredictions: (/* value */ String, /* requestOptions */ js.UndefOr[RequestOptions]) => Unit
    ): UsePlacesAutocompleteReturn[Prediction, RequestOptions] = {
      val __obj = js.Dynamic.literal(clearPredictions = js.Any.fromFunction0(clearPredictions), loading = loading.asInstanceOf[js.Any], predictions = predictions.asInstanceOf[js.Any], updatePredictions = js.Any.fromFunction2(updatePredictions))
      __obj.asInstanceOf[UsePlacesAutocompleteReturn[Prediction, RequestOptions]]
    }
    
    extension [Self <: UsePlacesAutocompleteReturn[?, ?], Prediction, RequestOptions](x: Self & (UsePlacesAutocompleteReturn[Prediction, RequestOptions])) {
      
      inline def setClearPredictions(value: () => Unit): Self = StObject.set(x, "clearPredictions", js.Any.fromFunction0(value))
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setPredictions(value: js.Array[Prediction]): Self = StObject.set(x, "predictions", value.asInstanceOf[js.Any])
      
      inline def setPredictionsVarargs(value: Prediction*): Self = StObject.set(x, "predictions", js.Array(value*))
      
      inline def setUpdatePredictions(value: (/* value */ String, /* requestOptions */ js.UndefOr[RequestOptions]) => Unit): Self = StObject.set(x, "updatePredictions", js.Any.fromFunction2(value))
    }
  }
}
