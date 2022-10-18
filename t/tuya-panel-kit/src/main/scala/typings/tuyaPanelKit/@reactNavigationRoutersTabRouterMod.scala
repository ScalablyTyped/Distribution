package typings.tuyaPanelKit

import typings.std.Extract
import typings.std.Record
import typings.tuyaPanelKit.`@reactNavigationRoutersDrawerRouterMod`.DrawerActionType
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.DefaultRouterOptions
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationRoute
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Router
import typings.tuyaPanelKit.anon.KeyType
import typings.tuyaPanelKit.anon.NameString
import typings.tuyaPanelKit.anon.Payload
import typings.tuyaPanelKit.anon.Source
import typings.tuyaPanelKit.anon.Target
import typings.tuyaPanelKit.anon.Type
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import typings.tuyaPanelKit.tuyaPanelKitStrings.JUMP_TO
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import typings.tuyaPanelKit.tuyaPanelKitStrings.tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationRoutersTabRouterMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/TabRouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasInitialRouteNameBackBehavior.asInstanceOf[js.Any]).asInstanceOf[Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ]]
  
  object TabActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers/TabRouter", "TabActions")
    @js.native
    val ^ : js.Any = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    inline def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    inline def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.tuyaPanelKitStrings.initialRoute
    - typings.tuyaPanelKit.tuyaPanelKitStrings.order
    - typings.tuyaPanelKit.tuyaPanelKitStrings.history
    - typings.tuyaPanelKit.tuyaPanelKitStrings.none_
  */
  trait BackBehavior extends StObject
  object BackBehavior {
    
    inline def history: typings.tuyaPanelKit.tuyaPanelKitStrings.history = "history".asInstanceOf[typings.tuyaPanelKit.tuyaPanelKitStrings.history]
    
    inline def initialRoute: typings.tuyaPanelKit.tuyaPanelKitStrings.initialRoute = "initialRoute".asInstanceOf[typings.tuyaPanelKit.tuyaPanelKitStrings.initialRoute]
    
    inline def none: none_ = "none".asInstanceOf[none_]
    
    inline def order: typings.tuyaPanelKit.tuyaPanelKitStrings.order = "order".asInstanceOf[typings.tuyaPanelKit.tuyaPanelKitStrings.order]
  }
  
  trait TabActionHelpers[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Jump to an existing tab.
      *
      * @param name Name of the route for the tab.
      * @param [params] Params object for the route.
      */
    // tslint:disable-next-line max-line-length
    def jumpTo[RouteName /* <: Extract[/* keyof ParamList */ String, String] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] */ js.Any
    ): Unit
  }
  object TabActionHelpers {
    
    inline def apply[ParamList /* <: ParamListBase */](
      jumpTo: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] */ js.Any => Unit
    ): TabActionHelpers[ParamList] = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo))
      __obj.asInstanceOf[TabActionHelpers[ParamList]]
    }
    
    extension [Self <: TabActionHelpers[?], ParamList /* <: ParamListBase */](x: Self & TabActionHelpers[ParamList]) {
      
      inline def setJumpTo(
        value: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] */ js.Any => Unit
      ): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
    }
  }
  
  trait TabActionType
    extends StObject
       with DrawerActionType {
    
    var payload: NameString
    
    var source: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var `type`: JUMP_TO
  }
  object TabActionType {
    
    inline def apply(payload: NameString): TabActionType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JUMP_TO")
      __obj.asInstanceOf[TabActionType]
    }
    
    extension [Self <: TabActionType](x: Self) {
      
      inline def setPayload(value: NameString): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: JUMP_TO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<ParamList>, 'history'> & {  type :'tab',   history :std.Array<{  type :'route',   key :string}>} */
  trait TabNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * List of previously visited route keys.
      */
    // tslint:disable-next-line array-type
    var history: js.Array[KeyType]
    
    var index: Double
    
    var key: String
    
    var routeNames: js.Array[Extract[/* keyof ParamList */ String, String]]
    
    var routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]
    
    var stale: `false`
    
    /**
      * Type of the router, in this case, it's tab.
      */
    var `type`: String & tab
  }
  object TabNavigationState {
    
    inline def apply[ParamList /* <: ParamListBase */](
      history: js.Array[KeyType],
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
      `type`: String & tab
    ): TabNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabNavigationState[ParamList]]
    }
    
    extension [Self <: TabNavigationState[?], ParamList /* <: ParamListBase */](x: Self & TabNavigationState[ParamList]) {
      
      inline def setHistory(value: js.Array[KeyType]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryVarargs(value: KeyType*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      inline def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = StObject.set(x, "routeNames", js.Array(value*))
      
      inline def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setType(value: String & tab): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabRouterOptions
    extends StObject
       with DefaultRouterOptions[String] {
    
    var backBehavior: js.UndefOr[BackBehavior] = js.undefined
  }
  object TabRouterOptions {
    
    inline def apply(): TabRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabRouterOptions]
    }
    
    extension [Self <: TabRouterOptions](x: Self) {
      
      inline def setBackBehavior(value: BackBehavior): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
      
      inline def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
    }
  }
}
