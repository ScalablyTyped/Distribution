package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelDelete extends js.Object {
  
  var cid: Double = js.native
  
  var invoker: js.UndefOr[TeamSpeakClient] = js.native
}
object ChannelDelete {
  
  @scala.inline
  def apply(cid: Double): ChannelDelete = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDelete]
  }
  
  @scala.inline
  implicit class ChannelDeleteOps[Self <: ChannelDelete] (val x: Self) extends AnyVal {
    
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
    def setCid(value: Double): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoker(value: TeamSpeakClient): Self = this.set("invoker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoker: Self = this.set("invoker", js.undefined)
  }
}
