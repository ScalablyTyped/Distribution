package typings.twilioChat.mediaMod

import typings.twilioMcsClient.mod.McsClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaServices extends js.Object {
  
  var mcsClient: McsClient = js.native
}
object MediaServices {
  
  @scala.inline
  def apply(mcsClient: McsClient): MediaServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaServices]
  }
  
  @scala.inline
  implicit class MediaServicesOps[Self <: MediaServices] (val x: Self) extends AnyVal {
    
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
    def setMcsClient(value: McsClient): Self = this.set("mcsClient", value.asInstanceOf[js.Any])
  }
}
