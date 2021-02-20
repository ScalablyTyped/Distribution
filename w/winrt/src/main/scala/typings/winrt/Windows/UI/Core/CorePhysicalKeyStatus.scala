package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorePhysicalKeyStatus extends StObject {
  
  var isExtendedKey: Boolean = js.native
  
  var isKeyReleased: Boolean = js.native
  
  var isMenuKeyDown: Boolean = js.native
  
  var repeatCount: Double = js.native
  
  var scanCode: Double = js.native
  
  var wasKeyDown: Boolean = js.native
}
object CorePhysicalKeyStatus {
  
  @scala.inline
  def apply(
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
  implicit class CorePhysicalKeyStatusMutableBuilder[Self <: CorePhysicalKeyStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsExtendedKey(value: Boolean): Self = StObject.set(x, "isExtendedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKeyReleased(value: Boolean): Self = StObject.set(x, "isKeyReleased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMenuKeyDown(value: Boolean): Self = StObject.set(x, "isMenuKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatCount(value: Double): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanCode(value: Double): Self = StObject.set(x, "scanCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasKeyDown(value: Boolean): Self = StObject.set(x, "wasKeyDown", value.asInstanceOf[js.Any])
  }
}
