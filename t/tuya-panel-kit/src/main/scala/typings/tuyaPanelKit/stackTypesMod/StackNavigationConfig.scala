package typings.tuyaPanelKit.stackTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackNavigationConfig extends js.Object {
  
  /**
    * Whether inactive screens should be detached from the view hierarchy to save memory.
    * Make sure to call `enableScreens` from `react-native-screens` to make it work.
    * Defaults to `true` on Android, depends on the version of `react-native-screens` on iOS.
    */
  var detachInactiveScreens: js.UndefOr[Boolean] = js.native
  
  var headerMode: js.UndefOr[StackHeaderMode] = js.native
  
  /**
    * If `false`, the keyboard will NOT automatically dismiss when navigating to a new screen.
    * Defaults to `true`.
    */
  var keyboardHandlingEnabled: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[StackCardMode] = js.native
}
object StackNavigationConfig {
  
  @scala.inline
  def apply(): StackNavigationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackNavigationConfig]
  }
  
  @scala.inline
  implicit class StackNavigationConfigOps[Self <: StackNavigationConfig] (val x: Self) extends AnyVal {
    
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
    def setDetachInactiveScreens(value: Boolean): Self = this.set("detachInactiveScreens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetachInactiveScreens: Self = this.set("detachInactiveScreens", js.undefined)
    
    @scala.inline
    def setHeaderMode(value: StackHeaderMode): Self = this.set("headerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderMode: Self = this.set("headerMode", js.undefined)
    
    @scala.inline
    def setKeyboardHandlingEnabled(value: Boolean): Self = this.set("keyboardHandlingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardHandlingEnabled: Self = this.set("keyboardHandlingEnabled", js.undefined)
    
    @scala.inline
    def setMode(value: StackCardMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
