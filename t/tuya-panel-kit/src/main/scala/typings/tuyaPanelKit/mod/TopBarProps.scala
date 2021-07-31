package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Color
import typings.tuyaPanelKit.themeMod.BackgroundProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopBarProps
  extends StObject
     with TopBarContentProps {
  
  var actions: js.UndefOr[js.Array[TopBarActionProps]] = js.undefined
  
  var background: js.UndefOr[BackgroundProps] = js.undefined
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var leftActions: js.UndefOr[js.Array[TopBarActionProps]] = js.undefined
  
  var onBack: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  
  var theme: js.UndefOr[Color] = js.undefined
}
object TopBarProps {
  
  @scala.inline
  def apply(): TopBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopBarProps]
  }
  
  @scala.inline
  implicit class TopBarPropsMutableBuilder[Self <: TopBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[TopBarActionProps]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: TopBarActionProps*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setLeftActions(value: js.Array[TopBarActionProps]): Self = StObject.set(x, "leftActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftActionsUndefined: Self = StObject.set(x, "leftActions", js.undefined)
    
    @scala.inline
    def setLeftActionsVarargs(value: TopBarActionProps*): Self = StObject.set(x, "leftActions", js.Array(value :_*))
    
    @scala.inline
    def setOnBack(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
    
    @scala.inline
    def setTheme(value: Color): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
