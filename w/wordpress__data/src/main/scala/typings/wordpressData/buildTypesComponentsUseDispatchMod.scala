package typings.wordpressData

import typings.wordpressData.buildTypesTypesMod.StoreDescriptor
import typings.wordpressData.buildTypesTypesMod.UseDispatchReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsUseDispatchMod {
  
  @JSImport("@wordpress/data/build-types/components/use-dispatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {import('../../types').StoreDescriptor<StoreConfig>} StoreDescriptor
    * @template {import('../../types').AnyConfig} StoreConfig
    */
  /**
    * @typedef {import('../../types').UseDispatchReturn<StoreNameOrDescriptor>} UseDispatchReturn
    * @template StoreNameOrDescriptor
    */
  /**
    * A custom react hook returning the current registry dispatch actions creators.
    *
    * Note: The component using this hook must be within the context of a
    * RegistryProvider.
    *
    * @template {undefined | string | StoreDescriptor<any>} StoreNameOrDescriptor
    * @param {StoreNameOrDescriptor} [storeNameOrDescriptor] Optionally provide the name of the
    *                                                        store or its descriptor from which to
    *                                                        retrieve action creators. If not
    *                                                        provided, the registry.dispatch
    *                                                        function is returned instead.
    *
    * @example
    * This illustrates a pattern where you may need to retrieve dynamic data from
    * the server via the `useSelect` hook to use in combination with the dispatch
    * action.
    *
    * ```jsx
    * import { useDispatch, useSelect } from '@wordpress/data';
    * import { useCallback } from '@wordpress/element';
    * import { store as myCustomStore } from 'my-custom-store';
    *
    * function Button( { onClick, children } ) {
    *   return <button type="button" onClick={ onClick }>{ children }</button>
    * }
    *
    * const SaleButton = ( { children } ) => {
    *   const { stockNumber } = useSelect(
    *     ( select ) => select( myCustomStore ).getStockNumber(),
    *     []
    *   );
    *   const { startSale } = useDispatch( myCustomStore );
    *   const onClick = useCallback( () => {
    *     const discountPercent = stockNumber > 50 ? 10: 20;
    *     startSale( discountPercent );
    *   }, [ stockNumber ] );
    *   return <Button onClick={ onClick }>{ children }</Button>
    * }
    *
    * // Rendered somewhere in the application:
    * //
    * // <SaleButton>Start Sale!</SaleButton>
    * ```
    * @return {UseDispatchReturn<StoreNameOrDescriptor>} A custom react hook.
    */
  inline def useDispatch[StoreNameOrDescriptor /* <: js.UndefOr[String | StoreDescriptor[Any]] */](): UseDispatchReturn[StoreNameOrDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDispatch")().asInstanceOf[UseDispatchReturn[StoreNameOrDescriptor]]
  inline def useDispatch[StoreNameOrDescriptor /* <: js.UndefOr[String | StoreDescriptor[Any]] */](storeNameOrDescriptor: StoreNameOrDescriptor): UseDispatchReturn[StoreNameOrDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDispatch")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[UseDispatchReturn[StoreNameOrDescriptor]]
  
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
  inline def useDispatchWithMap(dispatchMap: js.Function, deps: js.Array[Any]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("useDispatchWithMap")(dispatchMap.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
