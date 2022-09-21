package typings.styledComponentsReactNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.ActivityIndicator
import typings.reactNative.mod.PressableProps
import typings.reactNative.mod.Slider
import typings.reactNative.mod.Switch
import typings.reactNative.mod.View
import typings.styledComponentsReactNative.anon.ReadonlyButtonProps
import typings.styledComponentsReactNative.anon.ReadonlyFlatListPropsany
import typings.styledComponentsReactNative.anon.ReadonlyModalProps
import typings.styledComponentsReactNative.anon.ReadonlyNavigatorIOSProps
import typings.styledComponentsReactNative.anon.ReadonlySectionListPropsa
import typings.styledComponentsReactNative.anon.ReadonlySwitchIOSProps
import typings.styledComponentsReactNative.anon.TypeofImage
import typings.styledComponentsReactNative.anon.TypeofListView
import typings.styledComponentsReactNative.anon.TypeofRefreshControl
import typings.styledComponentsReactNative.anon.TypeofStatusBar
import typings.styledComponentsReactNative.anon.TypeofSwipeableListView
import typings.styledComponentsReactNative.anon.TypeofTabBarIOS
import typings.styledComponentsReactNative.anon.TypeofTextInput
import typings.styledComponentsReactNative.anon.TypeofTouchableNativeFeed
import typings.styledComponentsReactNative.anon.TypeofView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("styled-components/native", JSImport.Default)
  @js.native
  val default: ReactNativeStyledInterface[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultTheme */ Any
  ] = js.native
  
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
    
    var Picker: ReactNativeThemedStyledFunction[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactNative.Picker */ Any, 
        T
      ] = js.native
    
    var PickerIOS: ReactNativeThemedStyledFunction[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactNative.PickerIOS */ Any, 
        T
      ] = js.native
    
    var Pressable: ReactNativeThemedStyledFunction[ForwardRefExoticComponent[PressableProps & RefAttributes[View]], T] = js.native
    
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
    
    var SegmentedControlIOS: ReactNativeThemedStyledFunction[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactNative.SegmentedControlIOS */ Any, 
        T
      ] = js.native
    
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
    
    def apply[C /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyStyledComponent */ Any */](component: C): Any = js.native
  }
  
  trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends StObject {
    
    var default: ReactNativeStyledInterface[T]
    
    var ThemeConsumer: Consumer[T]
    
    var ThemeContext: Context[T]
    
    var ThemeProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeProviderComponent<T, U> */ Any
    
    var css: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedCssFunction<T> */ Any
    
    // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
    var isStyledComponent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isStyledComponent */ Any
    
    def useTheme(): T
    
    var withTheme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WithThemeFnInterface<T> */ Any
  }
  object ReactNativeThemedStyledComponentsModule {
    
    inline def apply[T /* <: js.Object */, U /* <: js.Object */](
      ThemeConsumer: Consumer[T],
      ThemeContext: Context[T],
      ThemeProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeProviderComponent<T, U> */ Any,
      css: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedCssFunction<T> */ Any,
      default: ReactNativeStyledInterface[T],
      isStyledComponent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isStyledComponent */ Any,
      useTheme: () => T,
      withTheme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WithThemeFnInterface<T> */ Any
    ): ReactNativeThemedStyledComponentsModule[T, U] = {
      val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer.asInstanceOf[js.Any], ThemeContext = ThemeContext.asInstanceOf[js.Any], ThemeProvider = ThemeProvider.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], isStyledComponent = isStyledComponent.asInstanceOf[js.Any], useTheme = js.Any.fromFunction0(useTheme), withTheme = withTheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactNativeThemedStyledComponentsModule[T, U]]
    }
    
    extension [Self <: ReactNativeThemedStyledComponentsModule[?, ?], T /* <: js.Object */, U /* <: js.Object */](x: Self & (ReactNativeThemedStyledComponentsModule[T, U])) {
      
      inline def setCss(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedCssFunction<T> */ Any
      ): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: ReactNativeStyledInterface[T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setIsStyledComponent(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isStyledComponent */ Any
      ): Self = StObject.set(x, "isStyledComponent", value.asInstanceOf[js.Any])
      
      inline def setThemeConsumer(value: Consumer[T]): Self = StObject.set(x, "ThemeConsumer", value.asInstanceOf[js.Any])
      
      inline def setThemeContext(value: Context[T]): Self = StObject.set(x, "ThemeContext", value.asInstanceOf[js.Any])
      
      inline def setThemeProvider(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeProviderComponent<T, U> */ Any
      ): Self = StObject.set(x, "ThemeProvider", value.asInstanceOf[js.Any])
      
      inline def setUseTheme(value: () => T): Self = StObject.set(x, "useTheme", js.Any.fromFunction0(value))
      
      inline def setWithTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WithThemeFnInterface<T> */ Any
      ): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactNativeThemedStyledFunction[C /* <: ComponentType[Any] */, T /* <: js.Object */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedStyledFunction<C, T> */ Any
  
  type ReactNativeThemedStyledInterface[T /* <: js.Object */] = ReactNativeThemedBaseStyledInterface[AnyIfEmpty[T]]
  
  type _To = ReactNativeStyledInterface[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultTheme */ Any
  ]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactNativeStyledInterface[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultTheme */ Any
  ] = default
}
