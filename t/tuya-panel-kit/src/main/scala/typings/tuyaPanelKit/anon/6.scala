package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitStrings.drawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var `type`: drawer
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("drawer")
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setType(value: drawer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
