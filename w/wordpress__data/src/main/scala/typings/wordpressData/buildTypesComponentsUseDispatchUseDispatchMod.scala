package typings.wordpressData

import typings.wordpressData.buildTypesTypesMod.AnyConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsUseDispatchUseDispatchMod {
  
  @JSImport("@wordpress/data/build-types/components/use-dispatch/use-dispatch", JSImport.Namespace)
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
  inline def default[StoreNameOrDescriptor /* <: js.UndefOr[String | typings.wordpressData.buildTypesTypesMod.StoreDescriptor[Any]] */](): typings.wordpressData.buildTypesTypesMod.UseDispatchReturn[StoreNameOrDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typings.wordpressData.buildTypesTypesMod.UseDispatchReturn[StoreNameOrDescriptor]]
  inline def default[StoreNameOrDescriptor /* <: js.UndefOr[String | typings.wordpressData.buildTypesTypesMod.StoreDescriptor[Any]] */](storeNameOrDescriptor: StoreNameOrDescriptor): typings.wordpressData.buildTypesTypesMod.UseDispatchReturn[StoreNameOrDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[typings.wordpressData.buildTypesTypesMod.UseDispatchReturn[StoreNameOrDescriptor]]
  
  type StoreDescriptor[StoreConfig /* <: AnyConfig */] = typings.wordpressData.buildTypesTypesMod.StoreDescriptor[StoreConfig]
  
  type UseDispatchReturn[StoreNameOrDescriptor] = typings.wordpressData.buildTypesTypesMod.UseDispatchReturn[StoreNameOrDescriptor]
}
