package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppOptions extends StObject {
  
  var command: String
  
  var initDelay: js.UndefOr[Double] = js.undefined
}
object AppOptions {
  
  inline def apply(command: String): AppOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppOptions] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setInitDelay(value: Double): Self = StObject.set(x, "initDelay", value.asInstanceOf[js.Any])
    
    inline def setInitDelayUndefined: Self = StObject.set(x, "initDelay", js.undefined)
  }
}
