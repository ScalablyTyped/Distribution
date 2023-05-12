package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidUiAutomator extends StObject {
  
  var android: UiAutomator
}
object AndroidUiAutomator {
  
  inline def apply(android: UiAutomator): AndroidUiAutomator = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidUiAutomator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidUiAutomator] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: UiAutomator): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
  }
}
