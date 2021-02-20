package typings.styledComponents.anon

import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.Route
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native.react-native.NavigatorIOSProps> */
@js.native
trait ReadonlyNavigatorIOSProps extends StObject {
  
  val barTintColor: js.UndefOr[ColorValue] = js.native
  
  val initialRoute: Route = js.native
  
  val interactivePopGestureEnabled: js.UndefOr[Boolean] = js.native
  
  val itemWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  val navigationBarHidden: js.UndefOr[Boolean] = js.native
  
  val shadowHidden: js.UndefOr[Boolean] = js.native
  
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  val tintColor: js.UndefOr[ColorValue] = js.native
  
  val titleTextColor: js.UndefOr[ColorValue] = js.native
  
  val translucent: js.UndefOr[Boolean] = js.native
}
object ReadonlyNavigatorIOSProps {
  
  @scala.inline
  def apply(initialRoute: Route): ReadonlyNavigatorIOSProps = {
    val __obj = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyNavigatorIOSProps]
  }
  
  @scala.inline
  implicit class ReadonlyNavigatorIOSPropsMutableBuilder[Self <: ReadonlyNavigatorIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarTintColor(value: ColorValue): Self = StObject.set(x, "barTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarTintColorUndefined: Self = StObject.set(x, "barTintColor", js.undefined)
    
    @scala.inline
    def setInitialRoute(value: Route): Self = StObject.set(x, "initialRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractivePopGestureEnabled(value: Boolean): Self = StObject.set(x, "interactivePopGestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractivePopGestureEnabledUndefined: Self = StObject.set(x, "interactivePopGestureEnabled", js.undefined)
    
    @scala.inline
    def setItemWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemWrapperStyleNull: Self = StObject.set(x, "itemWrapperStyle", null)
    
    @scala.inline
    def setItemWrapperStyleUndefined: Self = StObject.set(x, "itemWrapperStyle", js.undefined)
    
    @scala.inline
    def setNavigationBarHidden(value: Boolean): Self = StObject.set(x, "navigationBarHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationBarHiddenUndefined: Self = StObject.set(x, "navigationBarHidden", js.undefined)
    
    @scala.inline
    def setShadowHidden(value: Boolean): Self = StObject.set(x, "shadowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowHiddenUndefined: Self = StObject.set(x, "shadowHidden", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTitleTextColor(value: ColorValue): Self = StObject.set(x, "titleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextColorUndefined: Self = StObject.set(x, "titleTextColor", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
