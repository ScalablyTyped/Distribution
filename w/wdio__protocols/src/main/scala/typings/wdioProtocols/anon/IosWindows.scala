package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosWindows extends StObject {
  
  var android: UiAutomator
  
  var ios: UIAutomation
  
  var windows: Windows
}
object IosWindows {
  
  inline def apply(android: UiAutomator, ios: UIAutomation, windows: Windows): IosWindows = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosWindows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosWindows] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: UiAutomator): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setIos(value: UIAutomation): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setWindows(value: Windows): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
  }
}
