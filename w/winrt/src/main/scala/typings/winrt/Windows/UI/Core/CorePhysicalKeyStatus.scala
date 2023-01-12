package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorePhysicalKeyStatus extends StObject {
  
  var isExtendedKey: Boolean
  
  var isKeyReleased: Boolean
  
  var isMenuKeyDown: Boolean
  
  var repeatCount: Double
  
  var scanCode: Double
  
  var wasKeyDown: Boolean
}
object CorePhysicalKeyStatus {
  
  inline def apply(
    isExtendedKey: Boolean,
    isKeyReleased: Boolean,
    isMenuKeyDown: Boolean,
    repeatCount: Double,
    scanCode: Double,
    wasKeyDown: Boolean
  ): CorePhysicalKeyStatus = {
    val __obj = js.Dynamic.literal(isExtendedKey = isExtendedKey.asInstanceOf[js.Any], isKeyReleased = isKeyReleased.asInstanceOf[js.Any], isMenuKeyDown = isMenuKeyDown.asInstanceOf[js.Any], repeatCount = repeatCount.asInstanceOf[js.Any], scanCode = scanCode.asInstanceOf[js.Any], wasKeyDown = wasKeyDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorePhysicalKeyStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CorePhysicalKeyStatus] (val x: Self) extends AnyVal {
    
    inline def setIsExtendedKey(value: Boolean): Self = StObject.set(x, "isExtendedKey", value.asInstanceOf[js.Any])
    
    inline def setIsKeyReleased(value: Boolean): Self = StObject.set(x, "isKeyReleased", value.asInstanceOf[js.Any])
    
    inline def setIsMenuKeyDown(value: Boolean): Self = StObject.set(x, "isMenuKeyDown", value.asInstanceOf[js.Any])
    
    inline def setRepeatCount(value: Double): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    inline def setScanCode(value: Double): Self = StObject.set(x, "scanCode", value.asInstanceOf[js.Any])
    
    inline def setWasKeyDown(value: Boolean): Self = StObject.set(x, "wasKeyDown", value.asInstanceOf[js.Any])
  }
}
