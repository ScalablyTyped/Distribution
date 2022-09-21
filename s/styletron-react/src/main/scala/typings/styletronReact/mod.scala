package typings.styletronReact

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.styletronReact.anon.Hydrating
import typings.styletronReact.devToolMod.BrowserDebugEngine
import typings.styletronReact.devToolMod.NoopDebugEngine
import typings.styletronReact.typesMod.AssignmentCommutativeReducerContainer
import typings.styletronReact.typesMod.ReducerContainer
import typings.styletronReact.typesMod.StyledFn
import typings.styletronReact.typesMod.Styletron
import typings.styletronReact.typesMod.WithStyleFn
import typings.styletronReact.typesMod.WithTransformFn
import typings.styletronReact.typesMod.WithWrapperFn
import typings.styletronStandard.mod.StandardEngine
import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styletron-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styletron-react", "DebugEngine")
  @js.native
  val DebugEngine: (Instantiable1[/* worker */ js.UndefOr[Any], BrowserDebugEngine]) | Instantiable0[NoopDebugEngine] = js.native
  
  @JSImport("styletron-react", "Provider")
  @js.native
  val Provider: (Instantiable1[/* props */ DevProviderProps, DevProvider]) | typings.react.mod.Provider[StandardEngine] = js.native
  
  inline def autoComposeDeep[Props](styletron: Styletron, styleArg: js.Function1[/* a */ Props, StyleObject]): Styletron = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComposeDeep")(styletron.asInstanceOf[js.Any], styleArg.asInstanceOf[js.Any])).asInstanceOf[Styletron]
  inline def autoComposeDeep[Props](styletron: Styletron, styleArg: StyleObject): Styletron = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComposeDeep")(styletron.asInstanceOf[js.Any], styleArg.asInstanceOf[js.Any])).asInstanceOf[Styletron]
  
  inline def autoComposeShallow[Props](styletron: Styletron, styleArg: js.Function1[/* a */ Props, StyleObject]): Styletron = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComposeShallow")(styletron.asInstanceOf[js.Any], styleArg.asInstanceOf[js.Any])).asInstanceOf[Styletron]
  inline def autoComposeShallow[Props](styletron: Styletron, styleArg: StyleObject): Styletron = (^.asInstanceOf[js.Dynamic].applyDynamic("autoComposeShallow")(styletron.asInstanceOf[js.Any], styleArg.asInstanceOf[js.Any])).asInstanceOf[Styletron]
  
  inline def composeDynamic[Props](styletron: Styletron, reducer: js.Function2[/* b */ StyleObject, /* a */ Props, StyleObject]): Styletron = (^.asInstanceOf[js.Dynamic].applyDynamic("composeDynamic")(styletron.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[Styletron]
  
  inline def composeStatic(styletron: Styletron, reducerContainer: AssignmentCommutativeReducerContainer): Styletron = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStatic")(styletron.asInstanceOf[js.Any], reducerContainer.asInstanceOf[js.Any])).asInstanceOf[Styletron]
  
  inline def createDeepMergeReducer(style: StyleObject): AssignmentCommutativeReducerContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeepMergeReducer")(style.asInstanceOf[js.Any]).asInstanceOf[AssignmentCommutativeReducerContainer]
  
  inline def createShallowMergeReducer(style: StyleObject): AssignmentCommutativeReducerContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createShallowMergeReducer")(style.asInstanceOf[js.Any]).asInstanceOf[AssignmentCommutativeReducerContainer]
  
  inline def createStyled(hasGetInitialStyleDriverWrapper: createStyledOpts): StyledFn = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyled")(hasGetInitialStyleDriverWrapper.asInstanceOf[js.Any]).asInstanceOf[StyledFn]
  
  inline def createStyledElementComponent(styletron: Styletron): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyledElementComponent")(styletron.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def dynamicComposeDeep[Props](styletron: Styletron, styleFn: js.Function1[/* a */ Props, StyleObject]): Styletron = (^.asInstanceOf[js.Dynamic].applyDynamic("dynamicComposeDeep")(styletron.asInstanceOf[js.Any], styleFn.asInstanceOf[js.Any])).asInstanceOf[Styletron]
  
  inline def dynamicComposeShallow[Props](styletron: Styletron, styleFn: js.Function1[/* a */ Props, StyleObject]): Styletron = (^.asInstanceOf[js.Dynamic].applyDynamic("dynamicComposeShallow")(styletron.asInstanceOf[js.Any], styleFn.asInstanceOf[js.Any])).asInstanceOf[Styletron]
  
  inline def resolveStyle(
    getInitialStyle: js.Function1[/* a */ Unit, StyleObject],
    reducers: js.Array[ReducerContainer],
    props: Any
  ): StyleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyle")(getInitialStyle.asInstanceOf[js.Any], reducers.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[StyleObject]
  
  inline def staticComposeDeep(styletron: Styletron, style: StyleObject): Styletron = (^.asInstanceOf[js.Dynamic].applyDynamic("staticComposeDeep")(styletron.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Styletron]
  
  inline def staticComposeShallow(styletron: Styletron, style: StyleObject): Styletron = (^.asInstanceOf[js.Dynamic].applyDynamic("staticComposeShallow")(styletron.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Styletron]
  
  @JSImport("styletron-react", "styled")
  @js.native
  val styled: StyledFn = js.native
  
  inline def useStyletron(): js.Array[js.Function1[/* style */ StyleObject, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyletron")().asInstanceOf[js.Array[js.Function1[/* style */ StyleObject, String]]]
  
  @JSImport("styletron-react", "withStyle")
  @js.native
  val withStyle: WithStyleFn = js.native
  
  @JSImport("styletron-react", "withStyleDeep")
  @js.native
  val withStyleDeep: WithStyleFn = js.native
  
  @JSImport("styletron-react", "withTransform")
  @js.native
  val withTransform: WithTransformFn = js.native
  
  @JSImport("styletron-react", "withWrapper")
  @js.native
  val withWrapper: WithWrapperFn = js.native
  
  @js.native
  trait DevProvider extends Component[DevProviderProps, Hydrating, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MDevProvider(): Unit = js.native
  }
  
  trait DevProviderProps extends StObject {
    
    var children: ReactNode
    
    var debug: js.UndefOr[Any] = js.undefined
    
    var debugAfterHydration: js.UndefOr[Boolean] = js.undefined
    
    var value: StandardEngine
  }
  object DevProviderProps {
    
    inline def apply(value: StandardEngine): DevProviderProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DevProviderProps]
    }
    
    extension [Self <: DevProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDebug(value: Any): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugAfterHydration(value: Boolean): Self = StObject.set(x, "debugAfterHydration", value.asInstanceOf[js.Any])
      
      inline def setDebugAfterHydrationUndefined: Self = StObject.set(x, "debugAfterHydration", js.undefined)
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setValue(value: StandardEngine): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait createStyledOpts extends StObject {
    
    var driver: js.Function2[/* style */ StyleObject, /* styletron */ StandardEngine, String]
    
    def getInitialStyle(): StyleObject
    
    def wrapper(fc: FC[Any]): ComponentType[Any]
  }
  object createStyledOpts {
    
    inline def apply(
      driver: (/* style */ StyleObject, /* styletron */ StandardEngine) => String,
      getInitialStyle: () => StyleObject,
      wrapper: FC[Any] => ComponentType[Any]
    ): createStyledOpts = {
      val __obj = js.Dynamic.literal(driver = js.Any.fromFunction2(driver), getInitialStyle = js.Any.fromFunction0(getInitialStyle), wrapper = js.Any.fromFunction1(wrapper))
      __obj.asInstanceOf[createStyledOpts]
    }
    
    extension [Self <: createStyledOpts](x: Self) {
      
      inline def setDriver(value: (/* style */ StyleObject, /* styletron */ StandardEngine) => String): Self = StObject.set(x, "driver", js.Any.fromFunction2(value))
      
      inline def setGetInitialStyle(value: () => StyleObject): Self = StObject.set(x, "getInitialStyle", js.Any.fromFunction0(value))
      
      inline def setWrapper(value: FC[Any] => ComponentType[Any]): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var __STYLETRON_DEVTOOLS__ : Any
    }
    object Window {
      
      inline def apply(__STYLETRON_DEVTOOLS__ : Any): Window = {
        val __obj = js.Dynamic.literal(__STYLETRON_DEVTOOLS__ = __STYLETRON_DEVTOOLS__.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def set__STYLETRON_DEVTOOLS__(value: Any): Self = StObject.set(x, "__STYLETRON_DEVTOOLS__", value.asInstanceOf[js.Any])
      }
    }
  }
}
