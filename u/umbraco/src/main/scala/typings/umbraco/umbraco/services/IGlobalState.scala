package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global State
  */
@js.native
trait IGlobalState extends js.Object {
  
  var isReady: Boolean = js.native
  
  var navMode: js.Any = js.native
  
  var showNavigation: Boolean = js.native
  
  var showTray: Boolean = js.native
  
  var stickyNavigation: js.Any = js.native
  
  var touchDevice: Boolean = js.native
}
object IGlobalState {
  
  @scala.inline
  def apply(
    isReady: Boolean,
    navMode: js.Any,
    showNavigation: Boolean,
    showTray: Boolean,
    stickyNavigation: js.Any,
    touchDevice: Boolean
  ): IGlobalState = {
    val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any], navMode = navMode.asInstanceOf[js.Any], showNavigation = showNavigation.asInstanceOf[js.Any], showTray = showTray.asInstanceOf[js.Any], stickyNavigation = stickyNavigation.asInstanceOf[js.Any], touchDevice = touchDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobalState]
  }
  
  @scala.inline
  implicit class IGlobalStateOps[Self <: IGlobalState] (val x: Self) extends AnyVal {
    
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
    def setIsReady(value: Boolean): Self = this.set("isReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavMode(value: js.Any): Self = this.set("navMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNavigation(value: Boolean): Self = this.set("showNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTray(value: Boolean): Self = this.set("showTray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyNavigation(value: js.Any): Self = this.set("stickyNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchDevice(value: Boolean): Self = this.set("touchDevice", value.asInstanceOf[js.Any])
  }
}
