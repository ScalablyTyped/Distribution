package typings.vastClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<vast-client.vast-client.VastError, 'ERRORCODE'> */
@js.native
trait PickVastErrorERRORCODE extends js.Object {
  
  var ERRORCODE: String | Double = js.native
}
object PickVastErrorERRORCODE {
  
  @scala.inline
  def apply(ERRORCODE: String | Double): PickVastErrorERRORCODE = {
    val __obj = js.Dynamic.literal(ERRORCODE = ERRORCODE.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickVastErrorERRORCODE]
  }
  
  @scala.inline
  implicit class PickVastErrorERRORCODEOps[Self <: PickVastErrorERRORCODE] (val x: Self) extends AnyVal {
    
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
    def setERRORCODE(value: String | Double): Self = this.set("ERRORCODE", value.asInstanceOf[js.Any])
  }
}
