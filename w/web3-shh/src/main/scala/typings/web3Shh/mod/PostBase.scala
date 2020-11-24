package typings.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostBase extends js.Object {
  
  var padding: js.UndefOr[Double] = js.native
  
  var payload: String = js.native
  
  var powTarget: js.UndefOr[Double] = js.native
  
  var powTime: js.UndefOr[Double] = js.native
  
  var sig: js.UndefOr[String] = js.native
  
  var targetPeer: js.UndefOr[Double] = js.native
  
  var topic: String = js.native
  
  var ttl: Double = js.native
}
object PostBase {
  
  @scala.inline
  def apply(payload: String, topic: String, ttl: Double): PostBase = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBase]
  }
  
  @scala.inline
  implicit class PostBaseOps[Self <: PostBase] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPowTarget(value: Double): Self = this.set("powTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowTarget: Self = this.set("powTarget", js.undefined)
    
    @scala.inline
    def setPowTime(value: Double): Self = this.set("powTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowTime: Self = this.set("powTime", js.undefined)
    
    @scala.inline
    def setSig(value: String): Self = this.set("sig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSig: Self = this.set("sig", js.undefined)
    
    @scala.inline
    def setTargetPeer(value: Double): Self = this.set("targetPeer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPeer: Self = this.set("targetPeer", js.undefined)
  }
}
