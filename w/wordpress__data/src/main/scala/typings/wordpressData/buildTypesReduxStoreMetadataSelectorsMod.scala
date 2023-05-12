package typings.wordpressData

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesReduxStoreMetadataSelectorsMod {
  
  @JSImport("@wordpress/data/build-types/redux-store/metadata/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCachedResolvers(state: State): State = ^.asInstanceOf[js.Dynamic].applyDynamic("getCachedResolvers")(state.asInstanceOf[js.Any]).asInstanceOf[State]
  
  inline def getIsResolving(state: State, selectorName: String): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsResolving")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def getIsResolving(state: State, selectorName: String, args: js.Array[Any]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsResolving")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getResolutionError(state: State, selectorName: String): js.Error | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolutionError")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Any]
  inline def getResolutionError(state: State, selectorName: String, args: js.Array[Any]): js.Error | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolutionError")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Error | Any]
  
  inline def getResolutionState(state: State, selectorName: String): js.UndefOr[StateValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolutionState")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[StateValue]]
  inline def getResolutionState(state: State, selectorName: String, args: js.Array[Any]): js.UndefOr[StateValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolutionState")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[StateValue]]
  
  inline def hasFinishedResolution(state: State, selectorName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFinishedResolution")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasFinishedResolution(state: State, selectorName: String, args: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFinishedResolution")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasResolutionFailed(state: State, selectorName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasResolutionFailed")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasResolutionFailed(state: State, selectorName: String, args: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasResolutionFailed")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasResolvingSelectors(state: State): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasResolvingSelectors")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasStartedResolution(state: State, selectorName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasStartedResolution")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasStartedResolution(state: State, selectorName: String, args: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasStartedResolution")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isResolving(state: State, selectorName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isResolving")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isResolving(state: State, selectorName: String, args: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isResolving")(state.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type State = Record[String, typings.wordpressData.buildTypesReduxStoreMetadataReducerMod.State]
  
  type StateValue = typings.wordpressData.buildTypesReduxStoreMetadataReducerMod.StateValue
  
  /* Inlined @wordpress/data.@wordpress/data/build-types/redux-store/metadata/reducer.Status */
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
