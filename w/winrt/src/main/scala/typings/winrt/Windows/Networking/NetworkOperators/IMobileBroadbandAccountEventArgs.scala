package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMobileBroadbandAccountEventArgs extends js.Object {
  
  var networkAccountId: String = js.native
}
object IMobileBroadbandAccountEventArgs {
  
  @scala.inline
  def apply(networkAccountId: String): IMobileBroadbandAccountEventArgs = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandAccountEventArgs]
  }
  
  @scala.inline
  implicit class IMobileBroadbandAccountEventArgsOps[Self <: IMobileBroadbandAccountEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNetworkAccountId(value: String): Self = this.set("networkAccountId", value.asInstanceOf[js.Any])
  }
}
