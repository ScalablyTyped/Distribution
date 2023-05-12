package typings.wordpressData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsWithSelectMod {
  
  @JSImport("@wordpress/data/build-types/components/with-select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @typedef {import('@wordpress/element').WPComponent} WPComponent */
  /**
    * Higher-order component used to inject state-derived props using registered
    * selectors.
    *
    * @param {Function} mapSelectToProps Function called on every state change,
    *                                    expected to return object of props to
    *                                    merge with the component's own props.
    *
    * @example
    * ```js
    * import { withSelect } from '@wordpress/data';
    * import { store as myCustomStore } from 'my-custom-store';
    *
    * function PriceDisplay( { price, currency } ) {
    * 	return new Intl.NumberFormat( 'en-US', {
    * 		style: 'currency',
    * 		currency,
    * 	} ).format( price );
    * }
    *
    * const HammerPriceDisplay = withSelect( ( select, ownProps ) => {
    * 	const { getPrice } = select( myCustomStore );
    * 	const { currency } = ownProps;
    *
    * 	return {
    * 		price: getPrice( 'hammer', currency ),
    * 	};
    * } )( PriceDisplay );
    *
    * // Rendered in the application:
    * //
    * //  <HammerPriceDisplay currency="USD" />
    * ```
    * In the above example, when `HammerPriceDisplay` is rendered into an
    * application, it will pass the price into the underlying `PriceDisplay`
    * component and update automatically if the price of a hammer ever changes in
    * the store.
    *
    * @return {WPComponent} Enhanced component with merged state data props.
    */
  inline def default(mapSelectToProps: js.Function): WPComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(mapSelectToProps.asInstanceOf[js.Any]).asInstanceOf[WPComponent]
  
  type WPComponent = typings.wordpressElement.buildTypesReactMod.WPComponent
}
