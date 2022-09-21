package typings.tuyaPanelKit

import typings.react.mod.Component
import typings.tuyaPanelKit.anon.ClosingRouteKeys
import typings.tuyaPanelKit.anon.OpeningRouteKeys
import typings.tuyaPanelKit.anon.ReadonlyProps
import typings.tuyaPanelKit.anon.ReadonlyState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.routersTypesMod.Route
import typings.tuyaPanelKit.stackRouterMod.StackNavigationState
import typings.tuyaPanelKit.stackTypesMod.StackDescriptorMap
import typings.tuyaPanelKit.stackTypesMod.StackNavigationConfig
import typings.tuyaPanelKit.stackTypesMod.StackNavigationHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackViewMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/stack/views/Stack/StackView", JSImport.Default)
  @js.native
  open class default () extends StackView
  /* static members */
  object default {
    
    @JSImport("tuya-panel-kit/@react-navigation/stack/views/Stack/StackView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | OpeningRouteKeys = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ClosingRouteKeys | OpeningRouteKeys]
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  trait Props
    extends StObject
       with StackNavigationConfig {
    
    var descriptors: StackDescriptorMap
    
    var navigation: StackNavigationHelpers
    
    var state: StackNavigationState[ParamListBase]
  }
  object Props {
    
    inline def apply(
      descriptors: StackDescriptorMap,
      navigation: StackNavigationHelpers,
      state: StackNavigationState[ParamListBase]
    ): Props = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: StackNavigationHelpers): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setState(value: StackNavigationState[ParamListBase]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StackView extends Component[Props, State, Any] {
    
    /* private */ var getGesturesEnabled: Any = js.native
    
    /* private */ var getPreviousRoute: Any = js.native
    
    /* private */ var handleCloseRoute: Any = js.native
    
    /* private */ var handleGestureCancel: Any = js.native
    
    /* private */ var handleGestureEnd: Any = js.native
    
    /* private */ var handleGestureStart: Any = js.native
    
    /* private */ var handleOpenRoute: Any = js.native
    
    /* private */ var handleTransitionEnd: Any = js.native
    
    /* private */ var handleTransitionStart: Any = js.native
    
    /* private */ var renderHeader: Any = js.native
    
    /* private */ var renderScene: Any = js.native
  }
  
  // tslint:disable-next-line interface-over-type-literal strict-export-declare-modifiers
  trait State extends StObject {
    
    var closingRouteKeys: js.Array[String]
    
    var descriptors: StackDescriptorMap
    
    var openingRouteKeys: js.Array[String]
    
    var previousDescriptors: StackDescriptorMap
    
    // tslint:disable-next-line array-type
    var previousRoutes: js.Array[Route[String, js.UndefOr[js.Object]]]
    
    var replacingRouteKeys: js.Array[String]
    
    // tslint:disable-next-line array-type
    var routes: js.Array[Route[String, js.UndefOr[js.Object]]]
  }
  object State {
    
    inline def apply(
      closingRouteKeys: js.Array[String],
      descriptors: StackDescriptorMap,
      openingRouteKeys: js.Array[String],
      previousDescriptors: StackDescriptorMap,
      previousRoutes: js.Array[Route[String, js.UndefOr[js.Object]]],
      replacingRouteKeys: js.Array[String],
      routes: js.Array[Route[String, js.UndefOr[js.Object]]]
    ): State = {
      val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], replacingRouteKeys = replacingRouteKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setClosingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "closingRouteKeys", value.asInstanceOf[js.Any])
      
      inline def setClosingRouteKeysVarargs(value: String*): Self = StObject.set(x, "closingRouteKeys", js.Array(value*))
      
      inline def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setOpeningRouteKeys(value: js.Array[String]): Self = StObject.set(x, "openingRouteKeys", value.asInstanceOf[js.Any])
      
      inline def setOpeningRouteKeysVarargs(value: String*): Self = StObject.set(x, "openingRouteKeys", js.Array(value*))
      
      inline def setPreviousDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "previousDescriptors", value.asInstanceOf[js.Any])
      
      inline def setPreviousRoutes(value: js.Array[Route[String, js.UndefOr[js.Object]]]): Self = StObject.set(x, "previousRoutes", value.asInstanceOf[js.Any])
      
      inline def setPreviousRoutesVarargs(value: (Route[String, js.UndefOr[js.Object]])*): Self = StObject.set(x, "previousRoutes", js.Array(value*))
      
      inline def setReplacingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "replacingRouteKeys", value.asInstanceOf[js.Any])
      
      inline def setReplacingRouteKeysVarargs(value: String*): Self = StObject.set(x, "replacingRouteKeys", js.Array(value*))
      
      inline def setRoutes(value: js.Array[Route[String, js.UndefOr[js.Object]]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: (Route[String, js.UndefOr[js.Object]])*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
}
