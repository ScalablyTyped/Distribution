package typings.webextensionPolyfill.tabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tab sharing state for screen, microphone and camera.
  */
trait SharingState extends StObject {
  
  /**
    * True if the tab is using the camera.
    */
  var camera: Boolean
  
  /**
    * True if the tab is using the microphone.
    */
  var microphone: Boolean
  
  /**
    * If the tab is sharing the screen the value will be one of "Screen", "Window", or "Application",
    * or undefined if not screen sharing.
    * Optional.
    */
  var screen: js.UndefOr[String] = js.undefined
}
object SharingState {
  
  inline def apply(camera: Boolean, microphone: Boolean): SharingState = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], microphone = microphone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharingState]
  }
  
  extension [Self <: SharingState](x: Self) {
    
    inline def setCamera(value: Boolean): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setMicrophone(value: Boolean): Self = StObject.set(x, "microphone", value.asInstanceOf[js.Any])
    
    inline def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
  }
}
