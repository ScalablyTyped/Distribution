package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosUIAutomation extends StObject {
  
  var android: UiAutomator
  
  var ios: UIAutomation
}
object IosUIAutomation {
  
  inline def apply(android: UiAutomator, ios: UIAutomation): IosUIAutomation = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosUIAutomation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosUIAutomation] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: UiAutomator): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setIos(value: UIAutomation): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
