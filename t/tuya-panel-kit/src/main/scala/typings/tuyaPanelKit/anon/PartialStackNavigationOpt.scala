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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationOptions> */
@js.native
trait PartialStackNavigationOpt extends js.Object {
  
  var animationEnabled: js.UndefOr[Boolean] = js.native
  
  var animationTypeForReplace: js.UndefOr[push_ | pop_] = js.native
  
  var cardOverlay: js.UndefOr[js.Function1[/* props */ StyleWithAnimatedValue, ReactNode]] = js.native
  
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.native
  
  var cardShadowEnabled: js.UndefOr[Boolean] = js.native
  
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var cardStyleInterpolator: js.UndefOr[StackCardStyleInterpolator] = js.native
  
  var detachPreviousScreen: js.UndefOr[Boolean] = js.native
  
  var gestureDirection: js.UndefOr[GestureDirection] = js.native
  
  var gestureEnabled: js.UndefOr[Boolean] = js.native
  
  var gestureResponseDistance: js.UndefOr[Horizontal] = js.native
  
  var gestureVelocityImpact: js.UndefOr[Double] = js.native
  
  var header: js.UndefOr[js.Function1[/* props */ StackHeaderProps, ReactNode]] = js.native
  
  var headerBackAccessibilityLabel: js.UndefOr[String] = js.native
  
  var headerBackAllowFontScaling: js.UndefOr[Boolean] = js.native
  
  var headerBackImage: js.UndefOr[js.Function1[/* props */ TintColorString, ReactNode]] = js.native
  
  var headerBackTitle: js.UndefOr[String] = js.native
  
  var headerBackTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var headerBackTitleVisible: js.UndefOr[Boolean] = js.native
  
  var headerBackground: js.UndefOr[js.Function1[/* props */ Style, ReactNode]] = js.native
  
  var headerLeft: js.UndefOr[js.Function1[/* props */ StackHeaderLeftButtonProps, ReactNode]] = js.native
  
  var headerLeftContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  
  var headerPressColorAndroid: js.UndefOr[String] = js.native
  
  var headerRight: js.UndefOr[js.Function1[/* props */ TintColor, ReactNode]] = js.native
  
  var headerRightContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  
  var headerShown: js.UndefOr[Boolean] = js.native
  
  var headerStatusBarHeight: js.UndefOr[Double] = js.native
  
  var headerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  
  var headerStyleInterpolator: js.UndefOr[StackHeaderStyleInterpolator] = js.native
  
  var headerTintColor: js.UndefOr[String] = js.native
  
  var headerTitle: js.UndefOr[String | (js.Function1[/* props */ StackHeaderTitleProps, ReactNode])] = js.native
  
  var headerTitleAlign: js.UndefOr[left | center] = js.native
  
  var headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.native
  
  var headerTitleContainerStyle: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.native
  
  var headerTitleStyle: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.native
  
  var headerTransparent: js.UndefOr[Boolean] = js.native
  
  var headerTruncatedBackTitle: js.UndefOr[String] = js.native
  
  var safeAreaInsets: js.UndefOr[Bottom] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var transitionSpec: js.UndefOr[Close] = js.native
}
object PartialStackNavigationOpt {
  
  @scala.inline
  def apply(): PartialStackNavigationOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStackNavigationOpt]
  }
  
  @scala.inline
  implicit class PartialStackNavigationOptOps[Self <: PartialStackNavigationOpt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimationEnabled(value: Boolean): Self = this.set("animationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEnabled: Self = this.set("animationEnabled", js.undefined)
    
    @scala.inline
    def setAnimationTypeForReplace(value: push_ | pop_): Self = this.set("animationTypeForReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationTypeForReplace: Self = this.set("animationTypeForReplace", js.undefined)
    
    @scala.inline
    def setCardOverlay(value: /* props */ StyleWithAnimatedValue => ReactNode): Self = this.set("cardOverlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCardOverlay: Self = this.set("cardOverlay", js.undefined)
    
    @scala.inline
    def setCardOverlayEnabled(value: Boolean): Self = this.set("cardOverlayEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardOverlayEnabled: Self = this.set("cardOverlayEnabled", js.undefined)
    
    @scala.inline
    def setCardShadowEnabled(value: Boolean): Self = this.set("cardShadowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardShadowEnabled: Self = this.set("cardShadowEnabled", js.undefined)
    
    @scala.inline
    def setCardStyle(value: StyleProp[ViewStyle]): Self = this.set("cardStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardStyle: Self = this.set("cardStyle", js.undefined)
    
    @scala.inline
    def setCardStyleNull: Self = this.set("cardStyle", null)
    
    @scala.inline
    def setCardStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = this.set("cardStyleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCardStyleInterpolator: Self = this.set("cardStyleInterpolator", js.undefined)
    
    @scala.inline
    def setDetachPreviousScreen(value: Boolean): Self = this.set("detachPreviousScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetachPreviousScreen: Self = this.set("detachPreviousScreen", js.undefined)
    
    @scala.inline
    def setGestureDirection(value: GestureDirection): Self = this.set("gestureDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureDirection: Self = this.set("gestureDirection", js.undefined)
    
    @scala.inline
    def setGestureEnabled(value: Boolean): Self = this.set("gestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureEnabled: Self = this.set("gestureEnabled", js.undefined)
    
    @scala.inline
    def setGestureResponseDistance(value: Horizontal): Self = this.set("gestureResponseDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureResponseDistance: Self = this.set("gestureResponseDistance", js.undefined)
    
    @scala.inline
    def setGestureVelocityImpact(value: Double): Self = this.set("gestureVelocityImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureVelocityImpact: Self = this.set("gestureVelocityImpact", js.undefined)
    
    @scala.inline
    def setHeader(value: /* props */ StackHeaderProps => ReactNode): Self = this.set("header", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderBackAccessibilityLabel(value: String): Self = this.set("headerBackAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBackAccessibilityLabel: Self = this.set("headerBackAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setHeaderBackAllowFontScaling(value: Boolean): Self = this.set("headerBackAllowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBackAllowFontScaling: Self = this.set("headerBackAllowFontScaling", js.undefined)
    
    @scala.inline
    def setHeaderBackImage(value: /* props */ TintColorString => ReactNode): Self = this.set("headerBackImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderBackImage: Self = this.set("headerBackImage", js.undefined)
    
    @scala.inline
    def setHeaderBackTitle(value: String): Self = this.set("headerBackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBackTitle: Self = this.set("headerBackTitle", js.undefined)
    
    @scala.inline
    def setHeaderBackTitleStyle(value: StyleProp[TextStyle]): Self = this.set("headerBackTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBackTitleStyle: Self = this.set("headerBackTitleStyle", js.undefined)
    
    @scala.inline
    def setHeaderBackTitleStyleNull: Self = this.set("headerBackTitleStyle", null)
    
    @scala.inline
    def setHeaderBackTitleVisible(value: Boolean): Self = this.set("headerBackTitleVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBackTitleVisible: Self = this.set("headerBackTitleVisible", js.undefined)
    
    @scala.inline
    def setHeaderBackground(value: /* props */ Style => ReactNode): Self = this.set("headerBackground", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderBackground: Self = this.set("headerBackground", js.undefined)
    
    @scala.inline
    def setHeaderLeft(value: /* props */ StackHeaderLeftButtonProps => ReactNode): Self = this.set("headerLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderLeft: Self = this.set("headerLeft", js.undefined)
    
    @scala.inline
    def setHeaderLeftContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerLeftContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderLeftContainerStyle: Self = this.set("headerLeftContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderLeftContainerStyleNull: Self = this.set("headerLeftContainerStyle", null)
    
    @scala.inline
    def setHeaderPressColorAndroid(value: String): Self = this.set("headerPressColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderPressColorAndroid: Self = this.set("headerPressColorAndroid", js.undefined)
    
    @scala.inline
    def setHeaderRight(value: /* props */ TintColor => ReactNode): Self = this.set("headerRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderRight: Self = this.set("headerRight", js.undefined)
    
    @scala.inline
    def setHeaderRightContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerRightContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRightContainerStyle: Self = this.set("headerRightContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderRightContainerStyleNull: Self = this.set("headerRightContainerStyle", null)
    
    @scala.inline
    def setHeaderShown(value: Boolean): Self = this.set("headerShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderShown: Self = this.set("headerShown", js.undefined)
    
    @scala.inline
    def setHeaderStatusBarHeight(value: Double): Self = this.set("headerStatusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStatusBarHeight: Self = this.set("headerStatusBarHeight", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderStyleNull: Self = this.set("headerStyle", null)
    
    @scala.inline
    def setHeaderStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = this.set("headerStyleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderStyleInterpolator: Self = this.set("headerStyleInterpolator", js.undefined)
    
    @scala.inline
    def setHeaderTintColor(value: String): Self = this.set("headerTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTintColor: Self = this.set("headerTintColor", js.undefined)
    
    @scala.inline
    def setHeaderTitleFunction1(value: /* props */ StackHeaderTitleProps => ReactNode): Self = this.set("headerTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderTitle(value: String | (js.Function1[/* props */ StackHeaderTitleProps, ReactNode])): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitle: Self = this.set("headerTitle", js.undefined)
    
    @scala.inline
    def setHeaderTitleAlign(value: left | center): Self = this.set("headerTitleAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitleAlign: Self = this.set("headerTitleAlign", js.undefined)
    
    @scala.inline
    def setHeaderTitleAllowFontScaling(value: Boolean): Self = this.set("headerTitleAllowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitleAllowFontScaling: Self = this.set("headerTitleAllowFontScaling", js.undefined)
    
    @scala.inline
    def setHeaderTitleContainerStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("headerTitleContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitleContainerStyle: Self = this.set("headerTitleContainerStyle", js.undefined)
    
    @scala.inline
    def setHeaderTitleContainerStyleNull: Self = this.set("headerTitleContainerStyle", null)
    
    @scala.inline
    def setHeaderTitleStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = this.set("headerTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitleStyle: Self = this.set("headerTitleStyle", js.undefined)
    
    @scala.inline
    def setHeaderTitleStyleNull: Self = this.set("headerTitleStyle", null)
    
    @scala.inline
    def setHeaderTransparent(value: Boolean): Self = this.set("headerTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTransparent: Self = this.set("headerTransparent", js.undefined)
    
    @scala.inline
    def setHeaderTruncatedBackTitle(value: String): Self = this.set("headerTruncatedBackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTruncatedBackTitle: Self = this.set("headerTruncatedBackTitle", js.undefined)
    
    @scala.inline
    def setSafeAreaInsets(value: Bottom): Self = this.set("safeAreaInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeAreaInsets: Self = this.set("safeAreaInsets", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransitionSpec(value: Close): Self = this.set("transitionSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionSpec: Self = this.set("transitionSpec", js.undefined)
  }
}
