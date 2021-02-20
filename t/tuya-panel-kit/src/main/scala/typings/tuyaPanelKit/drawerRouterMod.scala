package typings.tuyaPanelKit

import typings.std.Extract
import typings.tuyaPanelKit.anon.KeyType
import typings.tuyaPanelKit.anon.NameString
import typings.tuyaPanelKit.anon.`14`
import typings.tuyaPanelKit.routersTypesMod.CommonNavigationAction
import typings.tuyaPanelKit.routersTypesMod.NavigationRoute
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.routersTypesMod.Router
import typings.tuyaPanelKit.tabRouterMod.BackBehavior
import typings.tuyaPanelKit.tabRouterMod.TabActionType
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import typings.tuyaPanelKit.tuyaPanelKitStrings.CLOSE_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.JUMP_TO
import typings.tuyaPanelKit.tuyaPanelKitStrings.OPEN_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.TOGGLE_DRAWER
import typings.tuyaPanelKit.tuyaPanelKitStrings.drawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerRouterMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", JSImport.Default)
  @js.native
  def default(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  object DrawerActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", "DrawerActions.closeDrawer")
    @js.native
    def closeDrawer(): DrawerActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", "DrawerActions.openDrawer")
    @js.native
    def openDrawer(): DrawerActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers/DrawerRouter", "DrawerActions.toggleDrawer")
    @js.native
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/TabRouter.TabActionHelpers<ParamList> & {openDrawer (): void, closeDrawer (): void, toggleDrawer (): void} */
  @js.native
  trait DrawerActionHelpers[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Close the drawer sidebar.
      */
    def closeDrawer(): Unit = js.native
    
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
    
    /**
      * Open the drawer sidebar.
      */
    def openDrawer(): Unit = js.native
    
    /**
      * Open the drawer sidebar if closed, or close if opened.
      */
    def toggleDrawer(): Unit = js.native
  }
  object DrawerActionHelpers {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      closeDrawer: () => Unit,
      jumpTo: (js.Tuple2[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[js.Any] => Unit,
      openDrawer: () => Unit,
      toggleDrawer: () => Unit
    ): DrawerActionHelpers[ParamList] = {
      val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), jumpTo = js.Any.fromFunction1(jumpTo), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
      __obj.asInstanceOf[DrawerActionHelpers[ParamList]]
    }
    
    @scala.inline
    implicit class DrawerActionHelpersMutableBuilder[Self <: DrawerActionHelpers[_], ParamList /* <: ParamListBase */] (val x: Self with DrawerActionHelpers[ParamList]) extends AnyVal {
      
      @scala.inline
      def setCloseDrawer(value: () => Unit): Self = StObject.set(x, "closeDrawer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setJumpTo(
        value: (js.Tuple2[
              js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
            ]) | js.Array[js.Any] => Unit
      ): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenDrawer(value: () => Unit): Self = StObject.set(x, "openDrawer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleDrawer(value: () => Unit): Self = StObject.set(x, "toggleDrawer", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.tabRouterMod.TabActionType
    - typings.tuyaPanelKit.anon.`13`
  */
  trait DrawerActionType extends StObject
  object DrawerActionType {
    
    @scala.inline
    def `13`(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): typings.tuyaPanelKit.anon.`13` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.`13`]
    }
    
    @scala.inline
    def TabActionType(payload: NameString, `type`: JUMP_TO): typings.tuyaPanelKit.tabRouterMod.TabActionType = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.tabRouterMod.TabActionType]
    }
  }
  
  /* Inlined std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/TabRouter.TabNavigationState<ParamList>, 'type' | 'history'> & {  type :'drawer',   history :std.Array<{  type :'route',   key :string} | {  type :'drawer'}>} */
  @js.native
  trait DrawerNavigationState[ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * List of previously visited route keys and drawer open status.
      */
    // tslint:disable-next-line array-type
    var history: js.Array[KeyType | `14`] = js.native
    
    var index: Double = js.native
    
    var key: String = js.native
    
    var routeNames: js.Array[Extract[/* keyof ParamList */ String, String]] = js.native
    
    var routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]] = js.native
    
    var stale: `false` = js.native
    
    /**
      * Type of the router, in this case, it's drawer.
      */
    var `type`: drawer = js.native
  }
  object DrawerNavigationState {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */](
      history: js.Array[KeyType | `14`],
      index: Double,
      key: String,
      routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
      routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
      stale: `false`,
      `type`: drawer
    ): DrawerNavigationState[ParamList] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerNavigationState[ParamList]]
    }
    
    @scala.inline
    implicit class DrawerNavigationStateMutableBuilder[Self <: DrawerNavigationState[_], ParamList /* <: ParamListBase */] (val x: Self with DrawerNavigationState[ParamList]) extends AnyVal {
      
      @scala.inline
      def setHistory(value: js.Array[KeyType | `14`]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryVarargs(value: (KeyType | `14`)*): Self = StObject.set(x, "history", js.Array(value :_*))
      
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
      def setType(value: drawer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/TabRouter.TabRouterOptions & {  openByDefault :boolean | undefined} */
  @js.native
  trait DrawerRouterOptions extends StObject {
    
    var backBehavior: js.UndefOr[BackBehavior] = js.native
    
    /**
      * Name of the route to focus by on initial render.
      * If not specified, usually the first route is used.
      */
    var initialRouteName: js.UndefOr[String] = js.native
    
    var openByDefault: js.UndefOr[Boolean] = js.native
  }
  object DrawerRouterOptions {
    
    @scala.inline
    def apply(): DrawerRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerRouterOptions]
    }
    
    @scala.inline
    implicit class DrawerRouterOptionsMutableBuilder[Self <: DrawerRouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackBehavior(value: BackBehavior): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
      
      @scala.inline
      def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      @scala.inline
      def setOpenByDefault(value: Boolean): Self = StObject.set(x, "openByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenByDefaultUndefined: Self = StObject.set(x, "openByDefault", js.undefined)
    }
  }
}
