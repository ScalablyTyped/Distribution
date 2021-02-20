package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  var bluetooth: Bluetooth = js.native
}
object Navigator {
  
  @scala.inline
  def apply(bluetooth: Bluetooth): Navigator = {
    val __obj = js.Dynamic.literal(bluetooth = bluetooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBluetooth(value: Bluetooth): Self = StObject.set(x, "bluetooth", value.asInstanceOf[js.Any])
  }
}
