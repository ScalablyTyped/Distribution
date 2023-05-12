package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiAutomator extends StObject {
  
  var UiAutomator: String
}
object UiAutomator {
  
  inline def apply(UiAutomator: String): UiAutomator = {
    val __obj = js.Dynamic.literal(UiAutomator = UiAutomator.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiAutomator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UiAutomator] (val x: Self) extends AnyVal {
    
    inline def setUiAutomator(value: String): Self = StObject.set(x, "UiAutomator", value.asInstanceOf[js.Any])
  }
}
