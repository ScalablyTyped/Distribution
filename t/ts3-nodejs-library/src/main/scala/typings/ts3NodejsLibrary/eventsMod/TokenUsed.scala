package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.responseTypesMod.ClientEntry
import typings.ts3NodejsLibrary.responseTypesMod.ClientList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenUsed extends js.Object {
  
  var client: ClientList = js.native
  
  var token: String = js.native
  
  var token1: String = js.native
  
  var token2: String = js.native
}
object TokenUsed {
  
  @scala.inline
  def apply(client: ClientList, token: String, token1: String, token2: String): TokenUsed = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token1 = token1.asInstanceOf[js.Any], token2 = token2.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenUsed]
  }
  
  @scala.inline
  implicit class TokenUsedOps[Self <: TokenUsed] (val x: Self) extends AnyVal {
    
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
    def setClientVarargs(value: ClientEntry*): Self = this.set("client", js.Array(value :_*))
    
    @scala.inline
    def setClient(value: ClientList): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken1(value: String): Self = this.set("token1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken2(value: String): Self = this.set("token2", value.asInstanceOf[js.Any])
  }
}
