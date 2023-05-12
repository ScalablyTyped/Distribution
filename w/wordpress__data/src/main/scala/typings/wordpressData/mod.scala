package typings.wordpressData

import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.wordpressData.buildTypesComponentsWithDispatchMod.WPComponent
import typings.wordpressData.buildTypesPluginsPersistenceMod.WPDataPersistencePluginOptions
import typings.wordpressData.buildTypesPluginsPersistenceMod.WPDataPlugin
import typings.wordpressData.buildTypesRegistryMod.WPDataRegistry
import typings.wordpressData.buildTypesTypesMod.ActionCreatorsOf
import typings.wordpressData.buildTypesTypesMod.AnyConfig
import typings.wordpressData.buildTypesTypesMod.ConfigOf
import typings.wordpressData.buildTypesTypesMod.CurriedSelectorsOf
import typings.wordpressData.buildTypesTypesMod.MapSelect
import typings.wordpressData.buildTypesTypesMod.ReduxStoreConfig
import typings.wordpressData.buildTypesTypesMod.UseSelectReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/data", "RegistryConsumer")
  @js.native
  val RegistryConsumer: Consumer[WPDataRegistry] = js.native
  
  @JSImport("@wordpress/data", "combineReducers")
  @js.native
  val combineReducers: typings.wordpressData.buildTypesTypesMod.combineReducers = js.native
  
  inline def createReduxStore[State, Actions /* <: Record[String, Any] */, Selectors](key: String, options: ReduxStoreConfig[State, Actions, Selectors]): typings.wordpressData.buildTypesTypesMod.StoreDescriptor[ReduxStoreConfig[State, Actions, Selectors]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReduxStore")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressData.buildTypesTypesMod.StoreDescriptor[ReduxStoreConfig[State, Actions, Selectors]]]
  
  inline def createRegistry(): WPDataRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")().asInstanceOf[WPDataRegistry]
  inline def createRegistry(storeConfigs: js.Object): WPDataRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any]).asInstanceOf[WPDataRegistry]
  inline def createRegistry(storeConfigs: js.Object, parent: js.Object): WPDataRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[WPDataRegistry]
  inline def createRegistry(storeConfigs: Unit, parent: js.Object): WPDataRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(storeConfigs.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[WPDataRegistry]
  
  inline def createRegistryControl(registryControl: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryControl")(registryControl.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def createRegistrySelector(registrySelector: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistrySelector")(registrySelector.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def dispatch[T /* <: typings.wordpressData.buildTypesTypesMod.StoreDescriptor[AnyConfig] */](storeNameOrDescriptor: T): ActionCreatorsOf[ConfigOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[ActionCreatorsOf[ConfigOf[T]]]
  inline def dispatch[T /* <: typings.wordpressData.buildTypesTypesMod.StoreDescriptor[AnyConfig] */](storeNameOrDescriptor: String): ActionCreatorsOf[ConfigOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[ActionCreatorsOf[ConfigOf[T]]]
  
  object plugins {
    
    object persistence {
      
      /**
        * Data plugin to persist store state into a single storage key.
        *
        * @param {WPDataRegistry}                  registry      Data registry.
        * @param {?WPDataPersistencePluginOptions} pluginOptions Plugin options.
        *
        * @return {WPDataPlugin} Data plugin.
        */
      inline def apply(registry: typings.wordpressData.buildTypesPluginsPersistenceMod.WPDataRegistry): WPDataPlugin = ^.asInstanceOf[js.Dynamic].apply(registry.asInstanceOf[js.Any]).asInstanceOf[WPDataPlugin]
      inline def apply(
        registry: typings.wordpressData.buildTypesPluginsPersistenceMod.WPDataRegistry,
        pluginOptions: WPDataPersistencePluginOptions
      ): WPDataPlugin = (^.asInstanceOf[js.Dynamic].apply(registry.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[WPDataPlugin]
      
      @JSImport("@wordpress/data", "plugins.persistence")
      @js.native
      val ^ : js.Any = js.native
      
      inline def unstableMigrate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__unstableMigrate")().asInstanceOf[Unit]
    }
  }
  
  @JSImport("@wordpress/data", "register")
  @js.native
  val register: Any = js.native
  
  @JSImport("@wordpress/data", "registerGenericStore")
  @js.native
  val registerGenericStore: js.Function = js.native
  
  @JSImport("@wordpress/data", "registerStore")
  @js.native
  val registerStore: js.Function = js.native
  
  @JSImport("@wordpress/data", "resolveSelect")
  @js.native
  val resolveSelect: Any = js.native
  
  inline def select[T /* <: typings.wordpressData.buildTypesTypesMod.StoreDescriptor[AnyConfig] */](storeNameOrDescriptor: T): CurriedSelectorsOf[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[CurriedSelectorsOf[T]]
  inline def select[T /* <: typings.wordpressData.buildTypesTypesMod.StoreDescriptor[AnyConfig] */](storeNameOrDescriptor: String): CurriedSelectorsOf[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(storeNameOrDescriptor.asInstanceOf[js.Any]).asInstanceOf[CurriedSelectorsOf[T]]
  
  @JSImport("@wordpress/data", "subscribe")
  @js.native
  val subscribe: js.Function = js.native
  
  @JSImport("@wordpress/data", "suspendSelect")
  @js.native
  val suspendSelect: Any = js.native
  
  @JSImport("@wordpress/data", "use")
  @js.native
  val use: Any = js.native
  
  inline def useSelect[T /* <: MapSelect | typings.wordpressData.buildTypesTypesMod.StoreDescriptor[Any] */](mapSelect: T, deps: js.Array[Any]): UseSelectReturn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelect")(mapSelect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[UseSelectReturn[T]]
  
  inline def useSuspenseSelect(mapSelect: js.Function, deps: js.Array[Any]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("useSuspenseSelect")(mapSelect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
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
  inline def withDispatch(mapDispatchToProps: js.Function): WPComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("withDispatch")(mapDispatchToProps.asInstanceOf[js.Any]).asInstanceOf[WPComponent]
  
  /**
    * Higher-order component which renders the original component with the current
    * registry context passed as its `registry` prop.
    *
    * @param {WPComponent} OriginalComponent Original component.
    *
    * @return {WPComponent} Enhanced component.
    */
  inline def withRegistry(Inner: ComponentType[Any]): js.Function1[/* props */ Any, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRegistry")(Inner.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ Any, Element]]
  
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
  inline def withSelect(mapSelectToProps: js.Function): typings.wordpressData.buildTypesComponentsWithSelectMod.WPComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("withSelect")(mapSelectToProps.asInstanceOf[js.Any]).asInstanceOf[typings.wordpressData.buildTypesComponentsWithSelectMod.WPComponent]
  
  type StoreDescriptor = typings.wordpressData.buildTypesTypesMod.StoreDescriptor[Any]
}
