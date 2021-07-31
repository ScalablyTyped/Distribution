package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitStrings.drawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var `type`: drawer
}
object `14` {
  
  @scala.inline
  def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("drawer")
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14MutableBuilder`[Self <: `14`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: drawer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
