package typings.wordpressData

import typings.std.Record
import typings.std.ReturnType
import typings.wordpressData.anon.Args
import typings.wordpressData.anon.ArgsSelectorName
import typings.wordpressData.anon.Error
import typings.wordpressData.anon.Errors
import typings.wordpressData.anon.SelectorName
import typings.wordpressData.anon.SelectorNameString
import typings.wordpressData.anon.SelectorNameType
import typings.wordpressData.anon.Type
import typings.wordpressData.anon.`0`
import typings.wordpressData.wordpressDataStrings.finished
import typings.wordpressData.wordpressDataStrings.resolving
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesReduxStoreMetadataReducerMod {
  
  @JSImport("@wordpress/data/build-types/redux-store/metadata/reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(state: Unit, action: Action): Record[String, State] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Record[String, State]]
  /**
    * Reducer function returning next state for selector resolution, object form:
    *
    *   selectorName -> EquivalentKeyMap<Array, boolean>
    *
    * @param state  Current state.
    * @param action Dispatched action.
    *
    * @return Next state.
    */
  inline def default(state: Record[String, State], action: Action): Record[String, State] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Record[String, State]]
  
  type Action = ReturnType[
    js.Function0[`0`] | (js.Function1[/* selectorName */ String, SelectorNameString]) | (js.Function2[
      /* selectorName */ String, 
      /* args */ js.Array[Any | js.Array[Any]], 
      Args | ArgsSelectorName | SelectorName | SelectorNameType | Type
    ]) | (js.Function3[
      /* selectorName */ String, 
      /* args */ js.Array[Any], 
      Any | (/* errors */ js.Array[js.Error | Any]) | js.Error, 
      Error | Errors
    ])
  ]
  
  type State = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EquivalentKeyMap<StateKey, StateValue> */ Any
  
  type StateKey = js.Array[Any] | Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressData.anon.Status
    - typings.wordpressData.anon.ErrorStatus
  */
  trait StateValue extends StObject
  object StateValue {
    
    inline def ErrorStatus(error: js.Error | Any): typings.wordpressData.anon.ErrorStatus = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = "error")
      __obj.asInstanceOf[typings.wordpressData.anon.ErrorStatus]
    }
    
    inline def Status(status: resolving | finished): typings.wordpressData.anon.Status = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wordpressData.anon.Status]
    }
  }
  
  /* Inlined @wordpress/data.@wordpress/data/build-types/redux-store/metadata/reducer.StateValue['status'] */
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressData.wordpressDataStrings.resolving
    - typings.wordpressData.wordpressDataStrings.finished
    - typings.wordpressData.wordpressDataStrings.error
  */
  trait Status extends StObject
  object Status {
    
    inline def error: typings.wordpressData.wordpressDataStrings.error = "error".asInstanceOf[typings.wordpressData.wordpressDataStrings.error]
    
    inline def finished: typings.wordpressData.wordpressDataStrings.finished = "finished".asInstanceOf[typings.wordpressData.wordpressDataStrings.finished]
    
    inline def resolving: typings.wordpressData.wordpressDataStrings.resolving = "resolving".asInstanceOf[typings.wordpressData.wordpressDataStrings.resolving]
  }
}
