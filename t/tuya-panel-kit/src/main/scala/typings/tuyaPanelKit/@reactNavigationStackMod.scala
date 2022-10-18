package typings.tuyaPanelKit

import typings.react.mod.Context
import typings.react.mod.NamedExoticComponent
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandler
import typings.std.Record
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.TypedNavigator
import typings.tuyaPanelKit.`@reactNavigationRoutersStackRouterMod`.StackNavigationState
import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackCardInterpolatedStyle
import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackCardInterpolationProps
import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackHeaderInterpolatedStyle
import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackHeaderInterpolationProps
import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackHeaderProps
import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackNavigationEventMap
import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackNavigationOptions
import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.TransitionPreset
import typings.tuyaPanelKit.`@reactNavigationStackTypesMod`.TransitionSpec
import typings.tuyaPanelKit.`@reactNavigationStackViewsHeaderHeaderBackButtonMod`.Props
import typings.tuyaPanelKit.`@reactNavigationStackViewsStackStackViewMod`.default
import typings.tuyaPanelKit.anon.ClosingRouteKeys
import typings.tuyaPanelKit.anon.OpeningRouteKeys
import typings.tuyaPanelKit.anon.ReadonlyProps
import typings.tuyaPanelKit.anon.ReadonlyState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationStackMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "Assets")
  @js.native
  val Assets: js.Array[Any] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "CardAnimationContext")
  @js.native
  val CardAnimationContext: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  
  object CardStyleInterpolators {
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "CardStyleInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forFadeFromBottomAndroid(hasCurrentInvertedHasScreenClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forFadeFromBottomAndroid")(hasCurrentInvertedHasScreenClosing.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forHorizontalIOS(hasCurrentNextInvertedHasScreen: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forHorizontalIOS")(hasCurrentNextInvertedHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forModalPresentationIOS(hasIndexCurrentNextInvertedHasScreenInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forModalPresentationIOS")(hasIndexCurrentNextInvertedHasScreenInsets.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forNoAnimation(): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forNoAnimation")().asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forRevealFromBottomAndroid(hasCurrentNextInvertedHasScreen: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forRevealFromBottomAndroid")(hasCurrentNextInvertedHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forScaleFromCenterAndroid")(hasCurrentNextClosing.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forVerticalIOS(hasCurrentInvertedHasScreen: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forVerticalIOS")(hasCurrentInvertedHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "GestureHandlerRefContext")
  @js.native
  val GestureHandlerRefContext: Context[Ref[PanGestureHandler]] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "Header")
  @js.native
  val Header: NamedExoticComponent[StackHeaderProps] = js.native
  
  inline def HeaderBackButton(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressCustomPressColorAndroidScreenLayoutCustomTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle: Props
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderBackButton")(hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressCustomPressColorAndroidScreenLayoutCustomTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def HeaderBackground(hasStyleRest: typings.tuyaPanelKit.`@reactNavigationStackViewsHeaderHeaderBackgroundMod`.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderBackground")(hasStyleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderHeightContext")
  @js.native
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  
  object HeaderStyleInterpolators {
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderStyleInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forFade(hasCurrentNext: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forFade")(hasCurrentNext.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    inline def forNoAnimation(): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forNoAnimation")().asInstanceOf[StackHeaderInterpolatedStyle]
    
    inline def forSlideLeft(hasCurrentNextHasScreen: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forSlideLeft")(hasCurrentNextHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    inline def forSlideRight(hasCurrentNextHasScreen: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forSlideRight")(hasCurrentNextHasScreen.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    inline def forSlideUp(hasCurrentNextHasHeader: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forSlideUp")(hasCurrentNextHasHeader.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    inline def forUIKit(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forUIKit")(hasCurrentNextLayouts.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
  }
  
  inline def HeaderTitle(hasTintColorStyleRest: typings.tuyaPanelKit.`@reactNavigationStackViewsHeaderHeaderTitleMod`.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderTitle")(hasTintColorStyleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "StackView")
  @js.native
  open class StackView () extends default
  /* static members */
  object StackView {
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "StackView")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | OpeningRouteKeys = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ClosingRouteKeys | OpeningRouteKeys]
  }
  
  object TransitionPresets {
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionPresets.DefaultTransition")
    @js.native
    val DefaultTransition: TransitionPreset = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionPresets.FadeFromBottomAndroid")
    @js.native
    val FadeFromBottomAndroid: TransitionPreset = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionPresets.ModalPresentationIOS")
    @js.native
    val ModalPresentationIOS: TransitionPreset = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionPresets.ModalSlideFromBottomIOS")
    @js.native
    val ModalSlideFromBottomIOS: TransitionPreset = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionPresets.ModalTransition")
    @js.native
    val ModalTransition: TransitionPreset = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionPresets.RevealFromBottomAndroid")
    @js.native
    val RevealFromBottomAndroid: TransitionPreset = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionPresets.ScaleFromCenterAndroid")
    @js.native
    val ScaleFromCenterAndroid: TransitionPreset = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionPresets.SlideFromRightIOS")
    @js.native
    val SlideFromRightIOS: TransitionPreset = js.native
  }
  
  object TransitionSpecs {
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionSpecs.FadeInFromBottomAndroidSpec")
    @js.native
    val FadeInFromBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionSpecs.FadeOutToBottomAndroidSpec")
    @js.native
    val FadeOutToBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionSpecs.RevealFromBottomAndroidSpec")
    @js.native
    val RevealFromBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionSpecs.ScaleFromCenterAndroidSpec")
    @js.native
    val ScaleFromCenterAndroidSpec: TransitionSpec = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "TransitionSpecs.TransitionIOSSpec")
    @js.native
    val TransitionIOSSpec: TransitionSpec = js.native
  }
  
  // tslint:disable-next-line max-line-length prefer-declare-function no-unnecessary-generics
  inline def createStackNavigator[ParamList /* <: Record[String, js.UndefOr[js.Object]] */](): TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[
      /* hasInitialRouteNameChildrenScreenOptionsRest */ typings.tuyaPanelKit.`@reactNavigationStackNavigatorsCreateStackNavigatorMod`.Props, 
      Element
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStackNavigator")().asInstanceOf[TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[
      /* hasInitialRouteNameChildrenScreenOptionsRest */ typings.tuyaPanelKit.`@reactNavigationStackNavigatorsCreateStackNavigatorMod`.Props, 
      Element
    ]
  ]]
  
  inline def useCardAnimation(): StackCardInterpolationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useCardAnimation")().asInstanceOf[StackCardInterpolationProps]
  
  inline def useGestureHandlerRef(): Ref[PanGestureHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGestureHandlerRef")().asInstanceOf[Ref[PanGestureHandler]]
  
  inline def useHeaderHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useHeaderHeight")().asInstanceOf[Double]
}
