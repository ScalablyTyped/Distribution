package typings.wixStyleReact

import typings.wixStyleReact.wixStyleReactBooleans.`false`
import typings.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod.ReadyAutocompleteClient[Prediction, Address, RequestOptions]
    - typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod.NotReadyAutocompleteClient
  */
  trait AutocompleteClient[Prediction, Address, RequestOptions] extends StObject
  object AutocompleteClient {
    
    inline def NotReadyAutocompleteClient(): typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod.NotReadyAutocompleteClient = {
      val __obj = js.Dynamic.literal(ready = false)
      __obj.asInstanceOf[typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod.NotReadyAutocompleteClient]
    }
    
    inline def ReadyAutocompleteClient[Prediction, Address, RequestOptions](
      fetchPredictions: (/* value */ String, /* requestOptions */ js.UndefOr[RequestOptions]) => js.Promise[js.Array[Prediction]],
      getAddress: /* placeId */ String => js.Promise[Address],
      searchAddresses: /* inputValue */ String => js.Promise[js.Array[Address]]
    ): typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod.ReadyAutocompleteClient[Prediction, Address, RequestOptions] = {
      val __obj = js.Dynamic.literal(fetchPredictions = js.Any.fromFunction2(fetchPredictions), getAddress = js.Any.fromFunction1(getAddress), ready = true, searchAddresses = js.Any.fromFunction1(searchAddresses))
      __obj.asInstanceOf[typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod.ReadyAutocompleteClient[Prediction, Address, RequestOptions]]
    }
  }
  
  type FetchPredictions[Prediction, RequestOptions] = js.Function2[
    /* value */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    js.Promise[js.Array[Prediction]]
  ]
  
  type GetAddress[Address] = js.Function1[/* placeId */ String, js.Promise[Address]]
  
  trait NotReadyAutocompleteClient
    extends StObject
       with AutocompleteClient[Any, Any, Any] {
    
    var ready: `false`
  }
  object NotReadyAutocompleteClient {
    
    inline def apply(): NotReadyAutocompleteClient = {
      val __obj = js.Dynamic.literal(ready = false)
      __obj.asInstanceOf[NotReadyAutocompleteClient]
    }
    
    extension [Self <: NotReadyAutocompleteClient](x: Self) {
      
      inline def setReady(value: `false`): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadyAutocompleteClient[Prediction, Address, RequestOptions]
    extends StObject
       with AutocompleteClient[Prediction, Address, RequestOptions] {
    
    var fetchPredictions: FetchPredictions[Prediction, RequestOptions]
    
    var getAddress: GetAddress[Address]
    
    var ready: `true`
    
    var searchAddresses: SearchAddresses[Address]
  }
  object ReadyAutocompleteClient {
    
    inline def apply[Prediction, Address, RequestOptions](
      fetchPredictions: (/* value */ String, /* requestOptions */ js.UndefOr[RequestOptions]) => js.Promise[js.Array[Prediction]],
      getAddress: /* placeId */ String => js.Promise[Address],
      searchAddresses: /* inputValue */ String => js.Promise[js.Array[Address]]
    ): ReadyAutocompleteClient[Prediction, Address, RequestOptions] = {
      val __obj = js.Dynamic.literal(fetchPredictions = js.Any.fromFunction2(fetchPredictions), getAddress = js.Any.fromFunction1(getAddress), ready = true, searchAddresses = js.Any.fromFunction1(searchAddresses))
      __obj.asInstanceOf[ReadyAutocompleteClient[Prediction, Address, RequestOptions]]
    }
    
    extension [Self <: ReadyAutocompleteClient[?, ?, ?], Prediction, Address, RequestOptions](x: Self & (ReadyAutocompleteClient[Prediction, Address, RequestOptions])) {
      
      inline def setFetchPredictions(
        value: (/* value */ String, /* requestOptions */ js.UndefOr[RequestOptions]) => js.Promise[js.Array[Prediction]]
      ): Self = StObject.set(x, "fetchPredictions", js.Any.fromFunction2(value))
      
      inline def setGetAddress(value: /* placeId */ String => js.Promise[Address]): Self = StObject.set(x, "getAddress", js.Any.fromFunction1(value))
      
      inline def setReady(value: `true`): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setSearchAddresses(value: /* inputValue */ String => js.Promise[js.Array[Address]]): Self = StObject.set(x, "searchAddresses", js.Any.fromFunction1(value))
    }
  }
  
  type SearchAddresses[Address] = js.Function1[/* inputValue */ String, js.Promise[js.Array[Address]]]
  
  type UseAutocompleteClient[Client /* <: AutocompleteClient[Any, Any, Any] */, InitOptions] = js.Function1[/* options */ js.UndefOr[InitOptions], Client]
}
