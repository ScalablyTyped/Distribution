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
  
  inline def apply(): PartialStackNavigationOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStackNavigationOpt]
  }
  
  extension [Self <: PartialStackNavigationOpt](x: Self) {
    
    inline def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
    
    inline def setAnimationTypeForReplace(value: push_ | pop_): Self = StObject.set(x, "animationTypeForReplace", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeForReplaceUndefined: Self = StObject.set(x, "animationTypeForReplace", js.undefined)
    
    inline def setCardOverlay(value: /* props */ StyleWithAnimatedValue => ReactNode): Self = StObject.set(x, "cardOverlay", js.Any.fromFunction1(value))
    
    inline def setCardOverlayEnabled(value: Boolean): Self = StObject.set(x, "cardOverlayEnabled", value.asInstanceOf[js.Any])
    
    inline def setCardOverlayEnabledUndefined: Self = StObject.set(x, "cardOverlayEnabled", js.undefined)
    
    inline def setCardOverlayUndefined: Self = StObject.set(x, "cardOverlay", js.undefined)
    
    inline def setCardShadowEnabled(value: Boolean): Self = StObject.set(x, "cardShadowEnabled", value.asInstanceOf[js.Any])
    
    inline def setCardShadowEnabledUndefined: Self = StObject.set(x, "cardShadowEnabled", js.undefined)
    
    inline def setCardStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cardStyle", value.asInstanceOf[js.Any])
    
    inline def setCardStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = StObject.set(x, "cardStyleInterpolator", js.Any.fromFunction1(value))
    
    inline def setCardStyleInterpolatorUndefined: Self = StObject.set(x, "cardStyleInterpolator", js.undefined)
    
    inline def setCardStyleNull: Self = StObject.set(x, "cardStyle", null)
    
    inline def setCardStyleUndefined: Self = StObject.set(x, "cardStyle", js.undefined)
    
    inline def setDetachPreviousScreen(value: Boolean): Self = StObject.set(x, "detachPreviousScreen", value.asInstanceOf[js.Any])
    
    inline def setDetachPreviousScreenUndefined: Self = StObject.set(x, "detachPreviousScreen", js.undefined)
    
    inline def setGestureDirection(value: GestureDirection): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
    
    inline def setGestureDirectionUndefined: Self = StObject.set(x, "gestureDirection", js.undefined)
    
    inline def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
    
    inline def setGestureEnabledUndefined: Self = StObject.set(x, "gestureEnabled", js.undefined)
    
    inline def setGestureResponseDistance(value: Horizontal): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
    
    inline def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
    
    inline def setGestureVelocityImpact(value: Double): Self = StObject.set(x, "gestureVelocityImpact", value.asInstanceOf[js.Any])
    
    inline def setGestureVelocityImpactUndefined: Self = StObject.set(x, "gestureVelocityImpact", js.undefined)
    
    inline def setHeader(value: /* props */ StackHeaderProps => ReactNode): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
    
    inline def setHeaderBackAccessibilityLabel(value: String): Self = StObject.set(x, "headerBackAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackAccessibilityLabelUndefined: Self = StObject.set(x, "headerBackAccessibilityLabel", js.undefined)
    
    inline def setHeaderBackAllowFontScaling(value: Boolean): Self = StObject.set(x, "headerBackAllowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackAllowFontScalingUndefined: Self = StObject.set(x, "headerBackAllowFontScaling", js.undefined)
    
    inline def setHeaderBackImage(value: /* props */ TintColorString => ReactNode): Self = StObject.set(x, "headerBackImage", js.Any.fromFunction1(value))
    
    inline def setHeaderBackImageUndefined: Self = StObject.set(x, "headerBackImage", js.undefined)
    
    inline def setHeaderBackTitle(value: String): Self = StObject.set(x, "headerBackTitle", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "headerBackTitleStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackTitleStyleNull: Self = StObject.set(x, "headerBackTitleStyle", null)
    
    inline def setHeaderBackTitleStyleUndefined: Self = StObject.set(x, "headerBackTitleStyle", js.undefined)
    
    inline def setHeaderBackTitleUndefined: Self = StObject.set(x, "headerBackTitle", js.undefined)
    
    inline def setHeaderBackTitleVisible(value: Boolean): Self = StObject.set(x, "headerBackTitleVisible", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackTitleVisibleUndefined: Self = StObject.set(x, "headerBackTitleVisible", js.undefined)
    
    inline def setHeaderBackground(value: /* props */ Style => ReactNode): Self = StObject.set(x, "headerBackground", js.Any.fromFunction1(value))
    
    inline def setHeaderBackgroundUndefined: Self = StObject.set(x, "headerBackground", js.undefined)
    
    inline def setHeaderLeft(value: /* props */ StackHeaderLeftButtonProps => ReactNode): Self = StObject.set(x, "headerLeft", js.Any.fromFunction1(value))
    
    inline def setHeaderLeftContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerLeftContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderLeftContainerStyleNull: Self = StObject.set(x, "headerLeftContainerStyle", null)
    
    inline def setHeaderLeftContainerStyleUndefined: Self = StObject.set(x, "headerLeftContainerStyle", js.undefined)
    
    inline def setHeaderLeftUndefined: Self = StObject.set(x, "headerLeft", js.undefined)
    
    inline def setHeaderPressColorAndroid(value: String): Self = StObject.set(x, "headerPressColorAndroid", value.asInstanceOf[js.Any])
    
    inline def setHeaderPressColorAndroidUndefined: Self = StObject.set(x, "headerPressColorAndroid", js.undefined)
    
    inline def setHeaderRight(value: /* props */ TintColor => ReactNode): Self = StObject.set(x, "headerRight", js.Any.fromFunction1(value))
    
    inline def setHeaderRightContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerRightContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderRightContainerStyleNull: Self = StObject.set(x, "headerRightContainerStyle", null)
    
    inline def setHeaderRightContainerStyleUndefined: Self = StObject.set(x, "headerRightContainerStyle", js.undefined)
    
    inline def setHeaderRightUndefined: Self = StObject.set(x, "headerRight", js.undefined)
    
    inline def setHeaderShown(value: Boolean): Self = StObject.set(x, "headerShown", value.asInstanceOf[js.Any])
    
    inline def setHeaderShownUndefined: Self = StObject.set(x, "headerShown", js.undefined)
    
    inline def setHeaderStatusBarHeight(value: Double): Self = StObject.set(x, "headerStatusBarHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderStatusBarHeightUndefined: Self = StObject.set(x, "headerStatusBarHeight", js.undefined)
    
    inline def setHeaderStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "headerStyleInterpolator", js.Any.fromFunction1(value))
    
    inline def setHeaderStyleInterpolatorUndefined: Self = StObject.set(x, "headerStyleInterpolator", js.undefined)
    
    inline def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    inline def setHeaderTintColor(value: String): Self = StObject.set(x, "headerTintColor", value.asInstanceOf[js.Any])
    
    inline def setHeaderTintColorUndefined: Self = StObject.set(x, "headerTintColor", js.undefined)
    
    inline def setHeaderTitle(value: String | (js.Function1[/* props */ StackHeaderTitleProps, ReactNode])): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
    
    inline def setHeaderTitleAlign(value: left | center): Self = StObject.set(x, "headerTitleAlign", value.asInstanceOf[js.Any])
    
    inline def setHeaderTitleAlignUndefined: Self = StObject.set(x, "headerTitleAlign", js.undefined)
    
    inline def setHeaderTitleAllowFontScaling(value: Boolean): Self = StObject.set(x, "headerTitleAllowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setHeaderTitleAllowFontScalingUndefined: Self = StObject.set(x, "headerTitleAllowFontScaling", js.undefined)
    
    inline def setHeaderTitleContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "headerTitleContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderTitleContainerStyleNull: Self = StObject.set(x, "headerTitleContainerStyle", null)
    
    inline def setHeaderTitleContainerStyleUndefined: Self = StObject.set(x, "headerTitleContainerStyle", js.undefined)
    
    inline def setHeaderTitleFunction1(value: /* props */ StackHeaderTitleProps => ReactNode): Self = StObject.set(x, "headerTitle", js.Any.fromFunction1(value))
    
    inline def setHeaderTitleStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = StObject.set(x, "headerTitleStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderTitleStyleNull: Self = StObject.set(x, "headerTitleStyle", null)
    
    inline def setHeaderTitleStyleUndefined: Self = StObject.set(x, "headerTitleStyle", js.undefined)
    
    inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
    
    inline def setHeaderTransparent(value: Boolean): Self = StObject.set(x, "headerTransparent", value.asInstanceOf[js.Any])
    
    inline def setHeaderTransparentUndefined: Self = StObject.set(x, "headerTransparent", js.undefined)
    
    inline def setHeaderTruncatedBackTitle(value: String): Self = StObject.set(x, "headerTruncatedBackTitle", value.asInstanceOf[js.Any])
    
    inline def setHeaderTruncatedBackTitleUndefined: Self = StObject.set(x, "headerTruncatedBackTitle", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setSafeAreaInsets(value: Bottom): Self = StObject.set(x, "safeAreaInsets", value.asInstanceOf[js.Any])
    
    inline def setSafeAreaInsetsUndefined: Self = StObject.set(x, "safeAreaInsets", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransitionSpec(value: Close): Self = StObject.set(x, "transitionSpec", value.asInstanceOf[js.Any])
    
    inline def setTransitionSpecUndefined: Self = StObject.set(x, "transitionSpec", js.undefined)
  }
}
