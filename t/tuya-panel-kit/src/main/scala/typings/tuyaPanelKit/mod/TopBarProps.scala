package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Color
import typings.tuyaPanelKit.themeMod.BackgroundProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopBarProps extends TopBarContentProps {
  
  var actions: js.UndefOr[js.Array[TopBarActionProps]] = js.native
  
  var background: js.UndefOr[BackgroundProps] = js.native
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var leftActions: js.UndefOr[js.Array[TopBarActionProps]] = js.native
  
  var onBack: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var theme: js.UndefOr[Color] = js.native
}
object TopBarProps {
  
  @scala.inline
  def apply(): TopBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopBarProps]
  }
  
  @scala.inline
  implicit class TopBarPropsOps[Self <: TopBarProps] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: TopBarActionProps*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[TopBarActionProps]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setBackground(value: BackgroundProps): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setContentStyle(value: StyleProp[ViewStyle]): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setContentStyleNull: Self = this.set("contentStyle", null)
    
    @scala.inline
    def setLeftActionsVarargs(value: TopBarActionProps*): Self = this.set("leftActions", js.Array(value :_*))
    
    @scala.inline
    def setLeftActions(value: js.Array[TopBarActionProps]): Self = this.set("leftActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftActions: Self = this.set("leftActions", js.undefined)
    
    @scala.inline
    def setOnBack(value: /* repeated */ js.Any => Unit): Self = this.set("onBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBack: Self = this.set("onBack", js.undefined)
    
    @scala.inline
    def setTheme(value: Color): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
