package typings.wordpressData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsWithDispatchMod {
  
  @JSImport("@wordpress/data/build-types/components/with-dispatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @typedef {import('@wordpress/element').WPComponent} WPComponent */
  /**
    * Higher-order component used to add dispatch props using registered action
    * creators.
    *
    * @param {Function} mapDispatchToProps A function of returning an object of
    *                                      prop names where value is a
    *                                      dispatch-bound action creator, or a
    *                                      function to be called with the
    *                                      component's props and returning an
    *                                      action creator.
    *
    * @example
    * ```jsx
    * function Button( { onClick, children } ) {
    *     return <button type="button" onClick={ onClick }>{ children }</button>;
    * }
    *
    * import { withDispatch } from '@wordpress/data';
    * import { store as myCustomStore } from 'my-custom-store';
    *
    * const SaleButton = withDispatch( ( dispatch, ownProps ) => {
    *     const { startSale } = dispatch( myCustomStore );
    *     const { discountPercent } = ownProps;
    *
    *     return {
    *         onClick() {
    *             startSale( discountPercent );
    *         },
    *     };
    * } )( Button );
    *
    * // Rendered in the application:
    * //
    * // <SaleButton discountPercent="20">Start Sale!</SaleButton>
    * ```
    *
    * @example
    * In the majority of cases, it will be sufficient to use only two first params
    * passed to `mapDispatchToProps` as illustrated in the previous example.
    * However, there might be some very advanced use cases where using the
    * `registry` object might be used as a tool to optimize the performance of
    * your component. Using `select` function from the registry might be useful
    * when you need to fetch some dynamic data from the store at the time when the
    * event is fired, but at the same time, you never use it to render your
    * component. In such scenario, you can avoid using the `withSelect` higher
    * order component to compute such prop, which might lead to unnecessary
    * re-renders of your component caused by its frequent value change.
    * Keep in mind, that `mapDispatchToProps` must return an object with functions
    * only.
    *
    * ```jsx
    * function Button( { onClick, children } ) {
    *     return <button type="button" onClick={ onClick }>{ children }</button>;
    * }
    *
    * import { withDispatch } from '@wordpress/data';
    * import { store as myCustomStore } from 'my-custom-store';
    *
    * const SaleButton = withDispatch( ( dispatch, ownProps, { select } ) => {
    *    // Stock number changes frequently.
    *    const { getStockNumber } = select( myCustomStore );
    *    const { startSale } = dispatch( myCustomStore );
    *    return {
    *        onClick() {
    *            const discountPercent = getStockNumber() > 50 ? 10 : 20;
    *            startSale( discountPercent );
    *        },
    *    };
    * } )( Button );
    *
    * // Rendered in the application:
    * //
    * //  <SaleButton>Start Sale!</SaleButton>
    * ```
    *
    * _Note:_ It is important that the `mapDispatchToProps` function always
    * returns an object with the same keys. For example, it should not contain
    * conditions under which a different value would be returned.
    *
    * @return {WPComponent} Enhanced component with merged dispatcher props.
    */
  inline def default(mapDispatchToProps: js.Function): WPComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(mapDispatchToProps.asInstanceOf[js.Any]).asInstanceOf[WPComponent]
  
  type WPComponent = typings.wordpressElement.buildTypesReactMod.WPComponent
}
