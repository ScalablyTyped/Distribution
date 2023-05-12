package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Android extends StObject {
  
  var android: UiAutomator
  
  var ios: UIAutomationString
  
  var windows: Windows
}
object Android {
  
  inline def apply(android: UiAutomator, ios: UIAutomationString, windows: Windows): Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Android] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: UiAutomator): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setIos(value: UIAutomationString): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setWindows(value: Windows): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
  }
}
