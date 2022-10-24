package typings.tuyaPanelKit

import typings.std.Extract
import typings.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionHelpers
import typings.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionType
import typings.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabRouterOptions
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.CommonNavigationAction
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationRoute
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Router
import typings.tuyaPanelKit.anon.KeyType
import typings.tuyaPanelKit.anon.NameString
import typings.tuyaPanelKit.anon.`6`
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import typings.tuyaPanelKit.tuyaPanelKitStrings.CLOSE_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.OPEN_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.TOGGLE_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.drawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationRoutersDrawerRouterMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction]]
  
  object DrawerActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", "DrawerActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def closeDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")().asInstanceOf[DrawerActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    inline def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    inline def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
    
    inline def openDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")().asInstanceOf[DrawerActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    inline def toggleDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")().asInstanceOf[DrawerActionType]
  }
  
  trait DrawerActionHelpers[ParamList /* <: ParamListBase */]
    extends StObject
       with TabActionHelpers[ParamList] {
    
    /**
      * Close the drawer sidebar.
      */
    def closeDrawer(): Unit
    
    /**
      * Open the drawer sidebar.
      */
    def openDrawer(): Unit
    
    /**
      * Open the drawer sidebar if closed, or close if opened.
      */
    def toggleDrawer(): Unit
  }
  object DrawerActionHelpers {
    
    inline def apply[ParamList /* <: ParamListBase */](
      closeDrawer: () => Unit,
      jumpTo: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] */ js.Any => Unit,
      openDrawer: () => Unit,
      toggleDrawer: () => Unit
    ): DrawerActionHelpers[ParamList] = {
      val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), jumpTo = js.Any.fromFunction1(jumpTo), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
      __obj.asInstanceOf[DrawerActionHelpers[ParamList]]
    }
    
    extension [Self <: DrawerActionHelpers[?], ParamList /* <: ParamListBase */](x: Self & DrawerActionHelpers[ParamList]) {
      
      inline def setCloseDrawer(value: () => Unit): Self = StObject.set(x, "closeDrawer", js.Any.fromFunction0(value))
      
      inline def setOpenDrawer(value: () => Unit): Self = StObject.set(x, "openDrawer", js.Any.fromFunction0(value))
      
      inline def setToggleDrawer(value: () => Unit): Self = StObject.set(x, "toggleDrawer", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionType
    - typings.tuyaPanelKit.anon.`5`
  */
  trait DrawerActionType extends StObject
  object DrawerActionType {
    
    inline def `5`(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): typings.tuyaPanelKit.anon.`5` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.`5`]
    }
    
    inline def TabActionType(payload: NameString): typings.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("JUMP_TO")
      __obj.asInstanceOf[typings.tuyaPanelKit.`@reactNavigationRoutersTabRouterMod`.TabActionType]
    }
  }
  
  /* Inlined std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/TabRouter.TabNavigationState<ParamList>, 'type' | 'history'> & {  type :'drawer',   history :std.Array<{  type :'route',   key :string} | {  type :'drawer'}>} */
  trait DrawerNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * List of previously visited route keys and drawer open status.
      */
    // tslint:disable-next-line array-type
    var history: js.Array[KeyType | `6`]
    
    var index: Double
    
    var key: String
    
    var routeNames: js.Array[Extract[/* keyof ParamList */ String, String]]
    
    var routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]
    
    var stale: `false`
    
    /**
      * Type of the router, in this case, it's drawer.
      */
    var `type`: drawer
  }
  object DrawerNavigationState {
    
    inline def apply[ParamList /* <: ParamListBase */](
      history: js.Array[KeyType | `6`],
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]
    ): DrawerNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
      __obj.updateDynamic("type")("drawer")
      __obj.asInstanceOf[DrawerNavigationState[ParamList]]
    }
    
    extension [Self <: DrawerNavigationState[?], ParamList /* <: ParamListBase */](x: Self & DrawerNavigationState[ParamList]) {
      
      inline def setHistory(value: js.Array[KeyType | `6`]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryVarargs(value: (KeyType | `6`)*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
      
      inline def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = StObject.set(x, "routeNames", js.Array(value*))
      
      inline def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setType(value: drawer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawerRouterOptions
    extends StObject
       with TabRouterOptions {
    
    var openByDefault: js.UndefOr[Boolean] = js.undefined
  }
  object DrawerRouterOptions {
    
    inline def apply(): DrawerRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerRouterOptions]
    }
    
    extension [Self <: DrawerRouterOptions](x: Self) {
      
      inline def setOpenByDefault(value: Boolean): Self = StObject.set(x, "openByDefault", value.asInstanceOf[js.Any])
      
      inline def setOpenByDefaultUndefined: Self = StObject.set(x, "openByDefault", js.undefined)
    }
  }
}
