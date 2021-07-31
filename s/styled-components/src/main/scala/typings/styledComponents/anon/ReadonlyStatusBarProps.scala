package typings.styledComponents.anon

import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.StatusBarStyle
import typings.styledComponents.styledComponentsStrings.fade
import typings.styledComponents.styledComponentsStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native.react-native.StatusBarProps> */
trait ReadonlyStatusBarProps extends StObject {
  
  val animated: js.UndefOr[Boolean] = js.undefined
  
  val backgroundColor: js.UndefOr[ColorValue] = js.undefined
  
  val barStyle: js.UndefOr[StatusBarStyle] = js.undefined
  
  val hidden: js.UndefOr[Boolean] = js.undefined
  
  val networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined
  
  val showHideTransition: js.UndefOr[fade | slide] = js.undefined
  
  val translucent: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyStatusBarProps {
  
  @scala.inline
  def apply(): ReadonlyStatusBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyStatusBarProps]
  }
  
  @scala.inline
  implicit class ReadonlyStatusBarPropsMutableBuilder[Self <: ReadonlyStatusBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: ColorValue): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBarStyle(value: StatusBarStyle): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setNetworkActivityIndicatorVisible(value: Boolean): Self = StObject.set(x, "networkActivityIndicatorVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkActivityIndicatorVisibleUndefined: Self = StObject.set(x, "networkActivityIndicatorVisible", js.undefined)
    
    @scala.inline
    def setShowHideTransition(value: fade | slide): Self = StObject.set(x, "showHideTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHideTransitionUndefined: Self = StObject.set(x, "showHideTransition", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
