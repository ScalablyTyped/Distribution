package typings.tuyaPanelKit

import typings.std.Extract
import typings.std.Record
import typings.tuyaPanelKit.anon.Count
import typings.tuyaPanelKit.anon.Params
import typings.tuyaPanelKit.anon.Payload
import typings.tuyaPanelKit.anon.PayloadSource
import typings.tuyaPanelKit.anon.Source
import typings.tuyaPanelKit.anon.SourceTarget
import typings.tuyaPanelKit.anon.SourceTargetType
import typings.tuyaPanelKit.anon.Target
import typings.tuyaPanelKit.anon.TargetType
import typings.tuyaPanelKit.anon.Type
import typings.tuyaPanelKit.routersTypesMod.DefaultRouterOptions
import typings.tuyaPanelKit.routersTypesMod.NavigationRoute
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.routersTypesMod.Router
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import typings.tuyaPanelKit.tuyaPanelKitStrings.POP
import typings.tuyaPanelKit.tuyaPanelKitStrings.POP_TO_TOP
import typings.tuyaPanelKit.tuyaPanelKitStrings.PUSH
import typings.tuyaPanelKit.tuyaPanelKitStrings.REPLACE
import typings.tuyaPanelKit.tuyaPanelKitStrings.stack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackRouterMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/StackRouter", JSImport.Default)
  @js.native
  def default(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | PayloadSource | SourceTarget | TargetType | SourceTargetType
  ] = js.native
  
  object StackActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers/StackRouter", "StackActions.pop")
    @js.native
    def pop(): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers/StackRouter", "StackActions.pop")
    @js.native
    def pop(count: Double): StackActionType = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers/StackRouter", "StackActions.popToTop")
    @js.native
    def popToTop(): StackActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers/StackRouter", "StackActions.push")
    @js.native
    def push(name: String): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers/StackRouter", "StackActions.push")
    @js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers/StackRouter", "StackActions.replace")
    @js.native
    def replace(name: String): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers/StackRouter", "StackActions.replace")
    @js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @js.native
  trait StackActionHelpers[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Pop a screen from the stack.
      */
    def pop(): Unit = js.native
    def pop(count: Double): Unit = js.native
    
    /**
      * Pop to the first route in the stack, dismissing all other screens.
      */
    def popToTop(): Unit = js.native
    
    /**
      * Push a new screen onto the stack.
      *
      * @param name Name of the route for the tab.
      * @param [params] Params object for the route.
      */
    def push[RouteName /* <: /* keyof ParamList */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit = js.native
    
    /**
      * Replace the current route with a new one.
      *
      * @param name Route name of the new route.
      * @param [params] Params object for the new route.
      */
    def replace[RouteName /* <: /* keyof ParamList */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.anon.PayloadSource
    - typings.tuyaPanelKit.anon.SourceTarget
    - typings.tuyaPanelKit.anon.TargetType
    - typings.tuyaPanelKit.anon.SourceTargetType
  */
  trait StackActionType extends StObject
  object StackActionType {
    
    @scala.inline
    def PayloadSource(payload: Params, `type`: REPLACE): typings.tuyaPanelKit.anon.PayloadSource = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.PayloadSource]
    }
    
    @scala.inline
    def SourceTarget(payload: Params, `type`: PUSH): typings.tuyaPanelKit.anon.SourceTarget = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.SourceTarget]
    }
    
    @scala.inline
    def SourceTargetType(`type`: POP_TO_TOP): typings.tuyaPanelKit.anon.SourceTargetType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.SourceTargetType]
    }
    
    @scala.inline
    def TargetType(payload: Count, `type`: POP): typings.tuyaPanelKit.anon.TargetType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.TargetType]
    }
  }
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<ParamList> & {  type :'stack'} */
  @js.native
  trait StackNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    val history: js.UndefOr[js.Array[_]] = js.native
    
    val index: Double = js.native
    
    val key: String = js.native
    
    val routeNames: js.Array[Extract[/* keyof ParamList */ String, String]] = js.native
    
    val routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]] = js.native
    
    val stale: `false` = js.native
    
    /**
      * Type of the router, in this case, it's stack.
      */
    val `type`: String with stack = js.native
  }
  object StackNavigationState {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
      stale: `false`,
      `type`: String with stack
    ): StackNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackNavigationState[ParamList]]
    }
    
    @scala.inline
    implicit class StackNavigationStateMutableBuilder[Self <: StackNavigationState[_], ParamList /* <: ParamListBase */] (val x: Self with StackNavigationState[ParamList]) extends AnyVal {
      
      @scala.inline
      def setHistory(value: js.Array[_]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
      
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
      def setType(value: String with stack): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type StackRouterOptions = DefaultRouterOptions[String]
}
