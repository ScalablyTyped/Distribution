package typings.tuyaPanelKit

import typings.std.Extract
import typings.std.Record
import typings.tuyaPanelKit.anon.KeyType
import typings.tuyaPanelKit.anon.NameString
import typings.tuyaPanelKit.anon.Payload
import typings.tuyaPanelKit.anon.Source
import typings.tuyaPanelKit.anon.Target
import typings.tuyaPanelKit.anon.Type
import typings.tuyaPanelKit.drawerRouterMod.DrawerActionType
import typings.tuyaPanelKit.routersTypesMod.NavigationRoute
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.routersTypesMod.Router
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import typings.tuyaPanelKit.tuyaPanelKitStrings.JUMP_TO
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import typings.tuyaPanelKit.tuyaPanelKitStrings.tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabRouterMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/TabRouter", JSImport.Default)
  @js.native
  def default(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ] = js.native
  
  object TabActions {
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers/TabRouter", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers/TabRouter", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.tuyaPanelKitStrings.initialRoute
    - typings.tuyaPanelKit.tuyaPanelKitStrings.order
    - typings.tuyaPanelKit.tuyaPanelKitStrings.history
    - typings.tuyaPanelKit.tuyaPanelKitStrings.none_
  */
  trait BackBehavior extends StObject
  object BackBehavior {
    
    @scala.inline
    def history: typings.tuyaPanelKit.tuyaPanelKitStrings.history = "history".asInstanceOf[typings.tuyaPanelKit.tuyaPanelKitStrings.history]
    
    @scala.inline
    def initialRoute: typings.tuyaPanelKit.tuyaPanelKitStrings.initialRoute = "initialRoute".asInstanceOf[typings.tuyaPanelKit.tuyaPanelKitStrings.initialRoute]
    
    @scala.inline
    def none: none_ = "none".asInstanceOf[none_]
    
    @scala.inline
    def order: typings.tuyaPanelKit.tuyaPanelKitStrings.order = "order".asInstanceOf[typings.tuyaPanelKit.tuyaPanelKitStrings.order]
  }
  
  @js.native
  trait TabActionHelpers[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Jump to an existing tab.
      *
      * @param name Name of the route for the tab.
      * @param [params] Params object for the route.
      */
    // tslint:disable-next-line max-line-length
    def jumpTo[RouteName /* <: Extract[/* keyof ParamList */ String, String] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit = js.native
  }
  object TabActionHelpers {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      jumpTo: (js.Tuple2[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[js.Any] => Unit
    ): TabActionHelpers[ParamList] = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo))
      __obj.asInstanceOf[TabActionHelpers[ParamList]]
    }
    
    @scala.inline
    implicit class TabActionHelpersMutableBuilder[Self <: TabActionHelpers[_], ParamList /* <: ParamListBase */] (val x: Self with TabActionHelpers[ParamList]) extends AnyVal {
      
      @scala.inline
      def setJumpTo(
        value: (js.Tuple2[
              js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
            ]) | js.Array[js.Any] => Unit
      ): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TabActionType extends DrawerActionType {
    
    var payload: NameString = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var `type`: JUMP_TO = js.native
  }
  object TabActionType {
    
    @scala.inline
    def apply(payload: NameString, `type`: JUMP_TO): TabActionType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabActionType]
    }
    
    @scala.inline
    implicit class TabActionTypeMutableBuilder[Self <: TabActionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: NameString): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: JUMP_TO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<ParamList>, 'history'> & {  type :'tab',   history :std.Array<{  type :'route',   key :string}>} */
  @js.native
  trait TabNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * List of previously visited route keys.
      */
    // tslint:disable-next-line array-type
    var history: js.Array[KeyType] = js.native
    
    var index: Double = js.native
    
    var key: String = js.native
    
    var routeNames: js.Array[Extract[/* keyof ParamList */ String, String]] = js.native
    
    var routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]] = js.native
    
    var stale: `false` = js.native
    
    /**
      * Type of the router, in this case, it's tab.
      */
    var `type`: String with tab = js.native
  }
  object TabNavigationState {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      history: js.Array[KeyType],
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
      stale: `false`,
      `type`: String with tab
    ): TabNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabNavigationState[ParamList]]
    }
    
    @scala.inline
    implicit class TabNavigationStateMutableBuilder[Self <: TabNavigationState[_], ParamList /* <: ParamListBase */] (val x: Self with TabNavigationState[ParamList]) extends AnyVal {
      
      @scala.inline
      def setHistory(value: js.Array[KeyType]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryVarargs(value: KeyType*): Self = StObject.set(x, "history", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = StObject.set(x, "routeNames", js.Array(value :_*))
      
      @scala.inline
      def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String with tab): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.DefaultRouterOptions<string> & {  backBehavior :tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/TabRouter.BackBehavior | undefined} */
  @js.native
  trait TabRouterOptions extends StObject {
    
    var backBehavior: js.UndefOr[BackBehavior] = js.native
    
    /**
      * Name of the route to focus by on initial render.
      * If not specified, usually the first route is used.
      */
    var initialRouteName: js.UndefOr[String] = js.native
  }
  object TabRouterOptions {
    
    @scala.inline
    def apply(): TabRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabRouterOptions]
    }
    
    @scala.inline
    implicit class TabRouterOptionsMutableBuilder[Self <: TabRouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackBehavior(value: BackBehavior): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
      
      @scala.inline
      def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    }
  }
}
