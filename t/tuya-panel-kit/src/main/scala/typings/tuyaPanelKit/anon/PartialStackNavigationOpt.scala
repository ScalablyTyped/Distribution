package typings.tuyaPanelKit.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.stackTypesMod.GestureDirection
import typings.tuyaPanelKit.stackTypesMod.StackCardInterpolatedStyle
import typings.tuyaPanelKit.stackTypesMod.StackCardInterpolationProps
import typings.tuyaPanelKit.stackTypesMod.StackCardStyleInterpolator
import typings.tuyaPanelKit.stackTypesMod.StackHeaderInterpolatedStyle
import typings.tuyaPanelKit.stackTypesMod.StackHeaderInterpolationProps
import typings.tuyaPanelKit.stackTypesMod.StackHeaderLeftButtonProps
import typings.tuyaPanelKit.stackTypesMod.StackHeaderProps
import typings.tuyaPanelKit.stackTypesMod.StackHeaderStyleInterpolator
import typings.tuyaPanelKit.stackTypesMod.StackHeaderTitleProps
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.left
import typings.tuyaPanelKit.tuyaPanelKitStrings.pop_
import typings.tuyaPanelKit.tuyaPanelKitStrings.push_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationOptions> */
trait PartialStackNavigationOpt extends StObject {
  
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  
  var animationTypeForReplace: js.UndefOr[push_ | pop_] = js.undefined
  
  var cardOverlay: js.UndefOr[js.Function1[/* props */ StyleWithAnimatedValue, ReactNode]] = js.undefined
  
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined
  
  var cardShadowEnabled: js.UndefOr[Boolean] = js.undefined
  
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var cardStyleInterpolator: js.UndefOr[StackCardStyleInterpolator] = js.undefined
  
  var detachPreviousScreen: js.UndefOr[Boolean] = js.undefined
  
  var gestureDirection: js.UndefOr[GestureDirection] = js.undefined
  
  var gestureEnabled: js.UndefOr[Boolean] = js.undefined
  
  var gestureResponseDistance: js.UndefOr[Horizontal] = js.undefined
  
  var gestureVelocityImpact: js.UndefOr[Double] = js.undefined
  
  var header: js.UndefOr[js.Function1[/* props */ StackHeaderProps, ReactNode]] = js.undefined
  
  var headerBackAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  
  var headerBackImage: js.UndefOr[js.Function1[/* props */ TintColorString, ReactNode]] = js.undefined
  
  var headerBackTitle: js.UndefOr[String] = js.undefined
  
  var headerBackTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined
  
  var headerBackground: js.UndefOr[js.Function1[/* props */ Style, ReactNode]] = js.undefined
  
  var headerLeft: js.UndefOr[js.Function1[/* props */ StackHeaderLeftButtonProps, ReactNode]] = js.undefined
  
  var headerLeftContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
  
  var headerPressColorAndroid: js.UndefOr[String] = js.undefined
  
  var headerRight: js.UndefOr[js.Function1[/* props */ TintColor, ReactNode]] = js.undefined
  
  var headerRightContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
  
  var headerShown: js.UndefOr[Boolean] = js.undefined
  
  var headerStatusBarHeight: js.UndefOr[Double] = js.undefined
  
  var headerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
  
  var headerStyleInterpolator: js.UndefOr[StackHeaderStyleInterpolator] = js.undefined
  
  var headerTintColor: js.UndefOr[String] = js.undefined
  
  var headerTitle: js.UndefOr[String | (js.Function1[/* props */ StackHeaderTitleProps, ReactNode])] = js.undefined
  
  var headerTitleAlign: js.UndefOr[left | center] = js.undefined
  
  var headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  
  var headerTitleContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
  
  var headerTitleStyle: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.undefined
  
  var headerTransparent: js.UndefOr[Boolean] = js.undefined
  
  var headerTruncatedBackTitle: js.UndefOr[String] = js.undefined
  
  var safeAreaInsets: js.UndefOr[Bottom] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var transitionSpec: js.UndefOr[Close] = js.undefined
}
object PartialStackNavigationOpt {
  
  @scala.inline
  def apply(): PartialStackNavigationOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStackNavigationOpt]
  }
  
  @scala.inline
  implicit class PartialStackNavigationOptMutableBuilder[Self <: PartialStackNavigationOpt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
    
    @scala.inline
    def setAnimationTypeForReplace(value: push_ | pop_): Self = StObject.set(x, "animationTypeForReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTypeForReplaceUndefined: Self = StObject.set(x, "animationTypeForReplace", js.undefined)
    
    @scala.inline
    def setCardOverlay(value: /* props */ StyleWithAnimatedValue => ReactNode): Self = StObject.set(x, "cardOverlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCardOverlayEnabled(value: Boolean): Self = StObject.set(x, "cardOverlayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardOverlayEnabledUndefined: Self = StObject.set(x, "cardOverlayEnabled", js.undefined)
    
    @scala.inline
    def setCardOverlayUndefined: Self = StObject.set(x, "cardOverlay", js.undefined)
    
    @scala.inline
    def setCardShadowEnabled(value: Boolean): Self = StObject.set(x, "cardShadowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardShadowEnabledUndefined: Self = StObject.set(x, "cardShadowEnabled", js.undefined)
    
    @scala.inline
    def setCardStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cardStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = StObject.set(x, "cardStyleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCardStyleInterpolatorUndefined: Self = StObject.set(x, "cardStyleInterpolator", js.undefined)
    
    @scala.inline
    def setCardStyleNull: Self = StObject.set(x, "cardStyle", null)
    
    @scala.inline
    def setCardStyleUndefined: Self = StObject.set(x, "cardStyle", js.undefined)
    
    @scala.inline
    def setDetachPreviousScreen(value: Boolean): Self = StObject.set(x, "detachPreviousScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachPreviousScreenUndefined: Self = StObject.set(x, "detachPreviousScreen", js.undefined)
    
    @scala.inline
    def setGestureDirection(value: GestureDirection): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureDirectionUndefined: Self = StObject.set(x, "gestureDirection", js.undefined)
    
    @scala.inline
    def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureEnabledUndefined: Self = StObject.set(x, "gestureEnabled", js.undefined)
    
    @scala.inline
    def setGestureResponseDistance(value: Horizontal): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
    
    @scala.inline
    def setGestureVelocityImpact(value: Double): Self = StObject.set(x, "gestureVelocityImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureVelocityImpactUndefined: Self = StObject.set(x, "gestureVelocityImpact", js.undefined)
    
    @scala.inline
    def setHeader(value: /* props */ StackHeaderProps => ReactNode): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderBackAccessibilityLabel(value: String): Self = StObject.set(x, "headerBackAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackAccessibilityLabelUndefined: Self = StObject.set(x, "headerBackAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setHeaderBackAllowFontScaling(value: Boolean): Self = StObject.set(x, "headerBackAllowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackAllowFontScalingUndefined: Self = StObject.set(x, "headerBackAllowFontScaling", js.undefined)
    
    @scala.inline
    def setHeaderBackImage(value: /* props */ TintColorString => ReactNode): Self = StObject.set(x, "headerBackImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderBackImageUndefined: Self = StObject.set(x, "headerBackImage", js.undefined)
    
    @scala.inline
    def setHeaderBackTitle(value: String): Self = StObject.set(x, "headerBackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "headerBackTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackTitleStyleNull: Self = StObject.set(x, "headerBackTitleStyle", null)
    
    @scala.inline
    def setHeaderBackTitleStyleUndefined: Self = StObject.set(x, "headerBackTitleStyle", js.undefined)
    
    @scala.inline
    def setHeaderBackTitleUndefined: Self = StObject.set(x, "headerBackTitle", js.undefined)
    
    @scala.inline
    def setHeaderBackTitleVisible(value: Boolean): Self = StObject.set(x, "headerBackTitleVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderBackTitleVisibleUndefined: Self = StObject.set(x, "headerBackTitleVisible", js.undefined)
    
    @scala.inline
    def setHeaderBackground(value: /* props */ Style => ReactNode): Self = StObject.set(x, "headerBackground", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderBackgroundUndefined: Self = StObject.set(x, "headerBackground", js.undefined)
    
    @scala.inline
    def setHeaderLeft(value: /* props */ StackHeaderLeftButtonProps => ReactNode): Self = StObject.set(x, "headerLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderLeftContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerLeftContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderLeftContainerStyleNull: Self = StObject.set(x, "headerLeftContainerStyle", null)
    
    @scala.inline
    def setHeaderLeftContainerStyleUndefined: Self = StObject.set(x, "headerLeftContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderLeftUndefined: Self = StObject.set(x, "headerLeft", js.undefined)
    
    @scala.inline
    def setHeaderPressColorAndroid(value: String): Self = StObject.set(x, "headerPressColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderPressColorAndroidUndefined: Self = StObject.set(x, "headerPressColorAndroid", js.undefined)
    
    @scala.inline
    def setHeaderRight(value: /* props */ TintColor => ReactNode): Self = StObject.set(x, "headerRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderRightContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerRightContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRightContainerStyleNull: Self = StObject.set(x, "headerRightContainerStyle", null)
    
    @scala.inline
    def setHeaderRightContainerStyleUndefined: Self = StObject.set(x, "headerRightContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderRightUndefined: Self = StObject.set(x, "headerRight", js.undefined)
    
    @scala.inline
    def setHeaderShown(value: Boolean): Self = StObject.set(x, "headerShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderShownUndefined: Self = StObject.set(x, "headerShown", js.undefined)
    
    @scala.inline
    def setHeaderStatusBarHeight(value: Double): Self = StObject.set(x, "headerStatusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStatusBarHeightUndefined: Self = StObject.set(x, "headerStatusBarHeight", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "headerStyleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderStyleInterpolatorUndefined: Self = StObject.set(x, "headerStyleInterpolator", js.undefined)
    
    @scala.inline
    def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderTintColor(value: String): Self = StObject.set(x, "headerTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTintColorUndefined: Self = StObject.set(x, "headerTintColor", js.undefined)
    
    @scala.inline
    def setHeaderTitle(value: String | (js.Function1[/* props */ StackHeaderTitleProps, ReactNode])): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitleAlign(value: left | center): Self = StObject.set(x, "headerTitleAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitleAlignUndefined: Self = StObject.set(x, "headerTitleAlign", js.undefined)
    
    @scala.inline
    def setHeaderTitleAllowFontScaling(value: Boolean): Self = StObject.set(x, "headerTitleAllowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitleAllowFontScalingUndefined: Self = StObject.set(x, "headerTitleAllowFontScaling", js.undefined)
    
    @scala.inline
    def setHeaderTitleContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerTitleContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitleContainerStyleNull: Self = StObject.set(x, "headerTitleContainerStyle", null)
    
    @scala.inline
    def setHeaderTitleContainerStyleUndefined: Self = StObject.set(x, "headerTitleContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderTitleFunction1(value: /* props */ StackHeaderTitleProps => ReactNode): Self = StObject.set(x, "headerTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderTitleStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = StObject.set(x, "headerTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitleStyleNull: Self = StObject.set(x, "headerTitleStyle", null)
    
    @scala.inline
    def setHeaderTitleStyleUndefined: Self = StObject.set(x, "headerTitleStyle", js.undefined)
    
    @scala.inline
    def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
    
    @scala.inline
    def setHeaderTransparent(value: Boolean): Self = StObject.set(x, "headerTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTransparentUndefined: Self = StObject.set(x, "headerTransparent", js.undefined)
    
    @scala.inline
    def setHeaderTruncatedBackTitle(value: String): Self = StObject.set(x, "headerTruncatedBackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTruncatedBackTitleUndefined: Self = StObject.set(x, "headerTruncatedBackTitle", js.undefined)
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setSafeAreaInsets(value: Bottom): Self = StObject.set(x, "safeAreaInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeAreaInsetsUndefined: Self = StObject.set(x, "safeAreaInsets", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransitionSpec(value: Close): Self = StObject.set(x, "transitionSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionSpecUndefined: Self = StObject.set(x, "transitionSpec", js.undefined)
  }
}
