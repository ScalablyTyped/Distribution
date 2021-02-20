package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectStrings.`send-max`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMaxOutput extends Output {
  
  var address: String = js.native
  
  var `type`: `send-max` = js.native
}
object SendMaxOutput {
  
  @scala.inline
  def apply(address: String, `type`: `send-max`): SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMaxOutput]
  }
  
  @scala.inline
  implicit class SendMaxOutputMutableBuilder[Self <: SendMaxOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `send-max`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
