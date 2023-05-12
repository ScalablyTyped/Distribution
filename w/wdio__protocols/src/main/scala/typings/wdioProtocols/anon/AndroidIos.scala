package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidIos extends StObject {
  
  var android: UiAutomator
  
  var ios: XCUITest
}
object AndroidIos {
  
  inline def apply(android: UiAutomator, ios: XCUITest): AndroidIos = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidIos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidIos] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: UiAutomator): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setIos(value: XCUITest): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
