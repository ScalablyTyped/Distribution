package typings.twineSugarcube.uiMod

import typings.twineSugarcube.twineSugarcubeStrings.auto
import typings.twineSugarcube.twineSugarcubeStrings.hide
import typings.twineSugarcube.twineSugarcubeStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullscreenRequestOptions extends js.Object {
  
  /**
    * Determines the fullscreen navigation UI preference. Valid values are (default: "auto"):
    * * "auto": Indicates no preference.
    * * "hide": Request that the browser's navigation UI be hidden. The full dimensions of the screen will be used to
    *    display the element.
    * * "show": Request that the browser's navigation UI be shown. The screen dimensions allocated to the element will
    *    be clamped to leave room for the UI.
    */
  var navigationUI: auto | hide | show = js.native
}
object FullscreenRequestOptions {
  
  @scala.inline
  def apply(navigationUI: auto | hide | show): FullscreenRequestOptions = {
    val __obj = js.Dynamic.literal(navigationUI = navigationUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullscreenRequestOptions]
  }
  
  @scala.inline
  implicit class FullscreenRequestOptionsOps[Self <: FullscreenRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setNavigationUI(value: auto | hide | show): Self = this.set("navigationUI", value.asInstanceOf[js.Any])
  }
}
