package typings.styledComponents

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.reactNative.mod.ActivityIndicator
import typings.reactNative.mod.Slider
import typings.reactNative.mod.Switch
import typings.styledComponents.anon.ReadonlyButtonProps
import typings.styledComponents.anon.ReadonlyFlatListPropsany
import typings.styledComponents.anon.ReadonlyModalProps
import typings.styledComponents.anon.ReadonlyNavigatorIOSProps
import typings.styledComponents.anon.ReadonlySectionListPropsa
import typings.styledComponents.anon.ReadonlySwitchIOSProps
import typings.styledComponents.anon.TypeofImage
import typings.styledComponents.anon.TypeofListView
import typings.styledComponents.anon.TypeofPicker
import typings.styledComponents.anon.TypeofPickerIOS
import typings.styledComponents.anon.TypeofRefreshControl
import typings.styledComponents.anon.TypeofStatusBar
import typings.styledComponents.anon.TypeofSwipeableListView
import typings.styledComponents.anon.TypeofTabBarIOS
import typings.styledComponents.anon.TypeofTextInput
import typings.styledComponents.anon.TypeofTouchableNativeFeed
import typings.styledComponents.anon.TypeofView
import typings.styledComponents.styledComponentsMod.DefaultTheme
import typings.styledComponents.styledComponentsMod.ThemeProviderComponent
import typings.styledComponents.styledComponentsMod.ThemeProviderProps
import typings.styledComponents.styledComponentsMod.ThemedCssFunction
import typings.styledComponents.styledComponentsMod.ThemedStyledFunction
import typings.styledComponents.styledComponentsMod.WithOptionalTheme
import typings.styledComponents.styledComponentsMod.WithThemeFnInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeMod {
  
  @JSImport("styled-components/native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/native", JSImport.Default)
  @js.native
  val default: ReactNativeStyledInterface[DefaultTheme] = js.native
  
  @JSImport("styled-components/native", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]] = js.native
  
  @JSImport("styled-components/native", "ThemeContext")
  @js.native
  val ThemeContext: Context[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("styled-components/native", "ThemeProvider")
  @js.native
  class ThemeProvider protected ()
    extends Component[
          ThemeProviderProps[
            typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
            typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
          ], 
          ComponentState, 
          js.Any
        ] {
    def this(props: ThemeProviderProps[
            typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
            typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
          ]) = this()
    def this(
      props: ThemeProviderProps[
            typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
            typings.styledComponents.styledComponentsMod.AnyIfEmpty[typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
          ],
      context: js.Any
    ) = this()
  }
  @JSImport("styled-components/native", "ThemeProvider")
  @js.native
  val ThemeProvider: ThemeProviderComponent[
    typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme], 
    typings.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]
  ] = js.native
  
  @JSImport("styled-components/native", "css")
  @js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  
  inline def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyledComponent")(target.asInstanceOf[js.Any]).asInstanceOf[/* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean]
  
  inline def useTheme(): DefaultTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[DefaultTheme]
  
  @JSImport("styled-components/native", "withTheme")
  @js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
  
  type AnyIfEmpty[T /* <: js.Object */] = T
  
  @js.native
  trait ReactNativeStyledInterface[T /* <: js.Object */]
    extends StObject
       with ReactNativeThemedBaseStyledInterface[AnyIfEmpty[T]] {
    
    var ActivityIndicator: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.ActivityIndicator], T] = js.native
    
    var ActivityIndicatorIOS: ReactNativeThemedStyledFunction[Instantiable0[ActivityIndicator], T] = js.native
    
    var Button: ReactNativeThemedStyledFunction[Instantiable1[/* props */ ReadonlyButtonProps, typings.reactNative.mod.Button], T] = js.native
    
    var DatePickerIOS: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.DatePickerIOS], T] = js.native
    
    var DrawerLayoutAndroid: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.DrawerLayoutAndroid], T] = js.native
    
    var FlatList: ReactNativeThemedStyledFunction[
        Instantiable1[/* props */ ReadonlyFlatListPropsany, typings.reactNative.mod.FlatList[js.Object]], 
        T
      ] = js.native
    
    var Image: ReactNativeThemedStyledFunction[TypeofImage, T] = js.native
    
    var ImageBackground: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.ImageBackground], T] = js.native
    
    var KeyboardAvoidingView: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.KeyboardAvoidingView], T] = js.native
    
    var ListView: ReactNativeThemedStyledFunction[TypeofListView, T] = js.native
    
    var Modal: ReactNativeThemedStyledFunction[Instantiable1[/* props */ ReadonlyModalProps, typings.reactNative.mod.Modal], T] = js.native
    
    var NavigatorIOS: ReactNativeThemedStyledFunction[
        Instantiable1[/* props */ ReadonlyNavigatorIOSProps, typings.reactNative.mod.NavigatorIOS], 
        T
      ] = js.native
    
    var Picker: ReactNativeThemedStyledFunction[TypeofPicker, T] = js.native
    
    var PickerIOS: ReactNativeThemedStyledFunction[TypeofPickerIOS, T] = js.native
    
    var ProgressBarAndroid: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.ProgressBarAndroid], T] = js.native
    
    var ProgressViewIOS: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.ProgressViewIOS], T] = js.native
    
    var RecyclerViewBackedScrollView: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.RecyclerViewBackedScrollView], T] = js.native
    
    var RefreshControl: ReactNativeThemedStyledFunction[TypeofRefreshControl, T] = js.native
    
    var SafeAreaView: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.SafeAreaView], T] = js.native
    
    var ScrollView: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.ScrollView], T] = js.native
    
    var SectionList: ReactNativeThemedStyledFunction[
        Instantiable1[
          /* props */ ReadonlySectionListPropsa, 
          typings.reactNative.mod.SectionList[js.Object, js.Object]
        ], 
        T
      ] = js.native
    
    var SegmentedControlIOS: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.SegmentedControlIOS], T] = js.native
    
    var Slider: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.Slider], T] = js.native
    
    var SliderIOS: ReactNativeThemedStyledFunction[Instantiable0[Slider], T] = js.native
    
    var SnapshotViewIOS: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.SnapshotViewIOS], T] = js.native
    
    var StatusBar: ReactNativeThemedStyledFunction[TypeofStatusBar, T] = js.native
    
    var SwipeableListView: ReactNativeThemedStyledFunction[TypeofSwipeableListView, T] = js.native
    
    var Switch: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.Switch], T] = js.native
    
    var SwitchAndroid: ReactNativeThemedStyledFunction[Instantiable0[Switch], T] = js.native
    
    var SwitchIOS: ReactNativeThemedStyledFunction[
        Instantiable1[/* props */ ReadonlySwitchIOSProps, typings.reactNative.mod.SwitchIOS], 
        T
      ] = js.native
    
    var TabBarIOS: ReactNativeThemedStyledFunction[TypeofTabBarIOS, T] = js.native
    
    var Text: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.Text], T] = js.native
    
    var TextInput: ReactNativeThemedStyledFunction[TypeofTextInput, T] = js.native
    
    var ToolbarAndroid: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.ToolbarAndroid], T] = js.native
    
    var TouchableHighlight: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.TouchableHighlight], T] = js.native
    
    var TouchableNativeFeedback: ReactNativeThemedStyledFunction[TypeofTouchableNativeFeed, T] = js.native
    
    var TouchableOpacity: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.TouchableOpacity], T] = js.native
    
    var TouchableWithoutFeedback: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.TouchableWithoutFeedback], T] = js.native
    
    var View: ReactNativeThemedStyledFunction[TypeofView, T] = js.native
    
    var ViewPagerAndroid: ReactNativeThemedStyledFunction[Instantiable0[typings.reactNative.mod.ViewPagerAndroid], T] = js.native
  }
  
  // Copied over from "ThemedBaseStyledInterface" in index.d.ts in order to remove DOM element typings
  @js.native
  trait ReactNativeThemedBaseStyledInterface[T /* <: js.Object */] extends StObject {
    
    def apply[C /* <: ComponentType[js.Any] */](
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: C
    ): ThemedStyledFunction[C, T, js.Object, scala.Nothing] = js.native
  }
  
  trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends StObject {
    
    var default: ReactNativeStyledInterface[T]
    
    var ThemeConsumer: Consumer[T]
    
    var ThemeContext: Context[T]
    
    var ThemeProvider: ThemeProviderComponent[T, U]
    
    var css: ThemedCssFunction[T]
    
    // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
    var isStyledComponent: js.Function1[
        /* target */ js.Any, 
        /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
      ]
    
    def useTheme(): T
    
    var withTheme: WithThemeFnInterface[T]
  }
  object ReactNativeThemedStyledComponentsModule {
    
    inline def apply[T /* <: js.Object */, U /* <: js.Object */](
      ThemeConsumer: Consumer[T],
      ThemeContext: Context[T],
      ThemeProvider: ThemeProviderComponent[T, U],
      css: ThemedCssFunction[T],
      default: ReactNativeStyledInterface[T],
      isStyledComponent: /* target */ js.Any => /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean,
      useTheme: () => T,
      withTheme: /* component */ ComponentType[js.Any] => ForwardRefExoticComponent[
          WithOptionalTheme[
            ComponentPropsWithRef[ComponentType[js.Any]], 
            typings.styledComponents.styledComponentsMod.AnyIfEmpty[T]
          ]
        ]
    ): ReactNativeThemedStyledComponentsModule[T, U] = {
      val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer.asInstanceOf[js.Any], ThemeContext = ThemeContext.asInstanceOf[js.Any], ThemeProvider = ThemeProvider.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], isStyledComponent = js.Any.fromFunction1(isStyledComponent), useTheme = js.Any.fromFunction0(useTheme), withTheme = js.Any.fromFunction1(withTheme))
      __obj.asInstanceOf[ReactNativeThemedStyledComponentsModule[T, U]]
    }
    
    extension [Self <: ReactNativeThemedStyledComponentsModule[?, ?], T /* <: js.Object */, U /* <: js.Object */](x: Self & (ReactNativeThemedStyledComponentsModule[T, U])) {
      
      inline def setCss(value: ThemedCssFunction[T]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: ReactNativeStyledInterface[T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setIsStyledComponent(
        value: /* target */ js.Any => /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
      ): Self = StObject.set(x, "isStyledComponent", js.Any.fromFunction1(value))
      
      inline def setThemeConsumer(value: Consumer[T]): Self = StObject.set(x, "ThemeConsumer", value.asInstanceOf[js.Any])
      
      inline def setThemeContext(value: Context[T]): Self = StObject.set(x, "ThemeContext", value.asInstanceOf[js.Any])
      
      inline def setThemeProvider(value: ThemeProviderComponent[T, U]): Self = StObject.set(x, "ThemeProvider", value.asInstanceOf[js.Any])
      
      inline def setUseTheme(value: () => T): Self = StObject.set(x, "useTheme", js.Any.fromFunction0(value))
      
      inline def setWithTheme(
        value: /* component */ ComponentType[js.Any] => ForwardRefExoticComponent[
              WithOptionalTheme[
                ComponentPropsWithRef[ComponentType[js.Any]], 
                typings.styledComponents.styledComponentsMod.AnyIfEmpty[T]
              ]
            ]
      ): Self = StObject.set(x, "withTheme", js.Any.fromFunction1(value))
    }
  }
  
  type ReactNativeThemedStyledFunction[C /* <: ComponentType[js.Any] */, T /* <: js.Object */] = ThemedStyledFunction[C, T, js.Object, scala.Nothing]
  
  type ReactNativeThemedStyledInterface[T /* <: js.Object */] = ReactNativeThemedBaseStyledInterface[AnyIfEmpty[T]]
}
