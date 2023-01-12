package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionOptions extends StObject {
  
  /**
    * The speed of action emulation. Defines how fast TestCafe performs the action when running tests.
    * A value between 1 (the maximum speed) and 0.01 (the minimum speed). If test speed is also specified in the CLI or
    * programmatically, the action speed setting overrides test speed. Default is 1.
    */
  var speed: js.UndefOr[Double] = js.undefined
}
object ActionOptions {
  
  inline def apply(): ActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionOptions] (val x: Self) extends AnyVal {
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
