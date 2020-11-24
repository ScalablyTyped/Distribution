package typings.symphonyApiClientNode.streamsClientMod

import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.IM
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.MIM
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.POST
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.ROOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamType extends js.Object {
  
  var `type`: IM | MIM | ROOM | POST = js.native
}
object StreamType {
  
  @scala.inline
  def apply(`type`: IM | MIM | ROOM | POST): StreamType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamType]
  }
  
  @scala.inline
  implicit class StreamTypeOps[Self <: StreamType] (val x: Self) extends AnyVal {
    
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
    def setType(value: IM | MIM | ROOM | POST): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
