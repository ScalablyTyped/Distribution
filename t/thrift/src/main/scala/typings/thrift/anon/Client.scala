package typings.thrift.anon

import typings.thrift.mod.TClientConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client[TClient] extends TClientConstructor[TClient] {
  
  var Client: InstantiableTClient[TClient] = js.native
}
object Client {
  
  @scala.inline
  def apply[TClient](Client: InstantiableTClient[TClient]): Client[TClient] = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client[TClient]]
  }
  
  @scala.inline
  implicit class ClientOps[Self <: Client[_], TClient] (val x: Self with Client[TClient]) extends AnyVal {
    
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
    def setClient(value: InstantiableTClient[TClient]): Self = this.set("Client", value.asInstanceOf[js.Any])
  }
}
