package typings.wordpressData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsUseDispatchUseDispatchWithMapMod {
  
  @JSImport("@wordpress/data/build-types/components/use-dispatch/use-dispatch-with-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Custom react hook for returning aggregate dispatch actions using the provided
    * dispatchMap.
    *
    * Currently this is an internal api only and is implemented by `withDispatch`
    *
    * @param {Function} dispatchMap Receives the `registry.dispatch` function as
    *                               the first argument and the `registry` object
    *                               as the second argument.  Should return an
    *                               object mapping props to functions.
    * @param {Array}    deps        An array of dependencies for the hook.
    * @return {Object}  An object mapping props to functions created by the passed
    *                   in dispatchMap.
    */
  inline def default(dispatchMap: js.Function, deps: js.Array[Any]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dispatchMap.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
