package typings.tuyaPanelKit

import typings.react.mod.Context
import typings.react.mod.NamedExoticComponent
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.std.Record
import typings.tuyaPanelKit.anon.ClosingRouteKeys
import typings.tuyaPanelKit.anon.OpeningRouteKeys
import typings.tuyaPanelKit.anon.ReadonlyProps
import typings.tuyaPanelKit.anon.ReadonlyState
import typings.tuyaPanelKit.headerBackButtonMod.Props
import typings.tuyaPanelKit.stackRouterMod.StackNavigationState
import typings.tuyaPanelKit.stackTypesMod.StackCardInterpolatedStyle
import typings.tuyaPanelKit.stackTypesMod.StackCardInterpolationProps
import typings.tuyaPanelKit.stackTypesMod.StackHeaderInterpolatedStyle
import typings.tuyaPanelKit.stackTypesMod.StackHeaderInterpolationProps
import typings.tuyaPanelKit.stackTypesMod.StackHeaderProps
import typings.tuyaPanelKit.stackTypesMod.StackNavigationEventMap
import typings.tuyaPanelKit.stackTypesMod.StackNavigationOptions
import typings.tuyaPanelKit.stackTypesMod.TransitionPreset
import typings.tuyaPanelKit.stackTypesMod.TransitionSpec
import typings.tuyaPanelKit.stackViewMod.default
import typings.tuyaPanelKit.typesMod.TypedNavigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "Assets")
  @js.native
  val Assets: js.Array[js.Any] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "CardAnimationContext")
  @js.native
  val CardAnimationContext: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  
  object CardStyleInterpolators {
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "CardStyleInterpolators.forFadeFromBottomAndroid")
    @js.native
    def forFadeFromBottomAndroid(hasCurrentInvertedLayoutsClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "CardStyleInterpolators.forHorizontalIOS")
    @js.native
    def forHorizontalIOS(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "CardStyleInterpolators.forModalPresentationIOS")
    @js.native
    def forModalPresentationIOS(hasIndexCurrentNextInvertedLayoutsInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "CardStyleInterpolators.forNoAnimation")
    @js.native
    def forNoAnimation(): StackCardInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "CardStyleInterpolators.forRevealFromBottomAndroid")
    @js.native
    def forRevealFromBottomAndroid(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "CardStyleInterpolators.forScaleFromCenterAndroid")
    @js.native
    def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "CardStyleInterpolators.forVerticalIOS")
    @js.native
    def forVerticalIOS(hasCurrentInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "GestureHandlerRefContext")
  @js.native
  val GestureHandlerRefContext: Context[Ref[PanGestureHandler]] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "Header")
  @js.native
  val Header: NamedExoticComponent[StackHeaderProps] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderBackButton")
  @js.native
  def HeaderBackButton(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressPressColorAndroidScreenLayoutTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle: Props
  ): Element = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderBackground")
  @js.native
  def HeaderBackground(hasStyleRest: typings.tuyaPanelKit.headerBackgroundMod.Props): Element = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderHeightContext")
  @js.native
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  
  object HeaderStyleInterpolators {
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderStyleInterpolators.forFade")
    @js.native
    def forFade(hasCurrentNext: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderStyleInterpolators.forNoAnimation")
    @js.native
    def forNoAnimation(): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderStyleInterpolators.forSlideLeft")
    @js.native
    def forSlideLeft(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderStyleInterpolators.forSlideRight")
    @js.native
    def forSlideRight(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderStyleInterpolators.forSlideUp")
    @js.native
    def forSlideUp(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderStyleInterpolators.forUIKit")
    @js.native
    def forUIKit(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "HeaderTitle")
  @js.native
  def HeaderTitle(hasTintColorStyleRest: typings.tuyaPanelKit.headerTitleMod.Props): Element = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "StackView")
  @js.native
  class StackView () extends default
  /* static members */
  object StackView {
    
    @JSImport("tuya-panel-kit/@react-navigation/stack", "StackView.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | OpeningRouteKeys = js.native
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
  @JSImport("tuya-panel-kit/@react-navigation/stack", "createStackNavigator")
  @js.native
  def createStackNavigator[ParamList /* <: Record[String, js.UndefOr[js.Object]] */](): TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[
      /* hasInitialRouteNameChildrenScreenOptionsRest */ typings.tuyaPanelKit.createStackNavigatorMod.Props, 
      Element
    ]
  ] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "useCardAnimation")
  @js.native
  def useCardAnimation(): StackCardInterpolationProps = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "useGestureHandlerRef")
  @js.native
  def useGestureHandlerRef(): Ref[PanGestureHandler] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "useHeaderHeight")
  @js.native
  def useHeaderHeight(): Double = js.native
}
