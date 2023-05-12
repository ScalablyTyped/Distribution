package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidWindows extends StObject {
  
  var android: UiAutomator
  
  var windows: Windows
}
object AndroidWindows {
  
  inline def apply(android: UiAutomator, windows: Windows): AndroidWindows = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidWindows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidWindows] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: UiAutomator): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setWindows(value: Windows): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
  }
}
