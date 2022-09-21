package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global State
  */
trait IGlobalState extends StObject {
  
  var isReady: Boolean
  
  var navMode: Any
  
  var showNavigation: Boolean
  
  var showTray: Boolean
  
  var stickyNavigation: Any
  
  var touchDevice: Boolean
}
object IGlobalState {
  
  inline def apply(
    isReady: Boolean,
    navMode: Any,
    showNavigation: Boolean,
    showTray: Boolean,
    stickyNavigation: Any,
    touchDevice: Boolean
  ): IGlobalState = {
    val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any], navMode = navMode.asInstanceOf[js.Any], showNavigation = showNavigation.asInstanceOf[js.Any], showTray = showTray.asInstanceOf[js.Any], stickyNavigation = stickyNavigation.asInstanceOf[js.Any], touchDevice = touchDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobalState]
  }
  
  extension [Self <: IGlobalState](x: Self) {
    
    inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    
    inline def setNavMode(value: Any): Self = StObject.set(x, "navMode", value.asInstanceOf[js.Any])
    
    inline def setShowNavigation(value: Boolean): Self = StObject.set(x, "showNavigation", value.asInstanceOf[js.Any])
    
    inline def setShowTray(value: Boolean): Self = StObject.set(x, "showTray", value.asInstanceOf[js.Any])
    
    inline def setStickyNavigation(value: Any): Self = StObject.set(x, "stickyNavigation", value.asInstanceOf[js.Any])
    
    inline def setTouchDevice(value: Boolean): Self = StObject.set(x, "touchDevice", value.asInstanceOf[js.Any])
  }
}
