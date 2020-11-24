package typings.thrift.mod

import typings.thrift.mod.Thrift.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TMessage extends js.Object {
  
  var fname: String = js.native
  
  var mtype: MessageType = js.native
  
  var rseqid: Double = js.native
}
object TMessage {
  
  @scala.inline
  def apply(fname: String, mtype: MessageType, rseqid: Double): TMessage = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], mtype = mtype.asInstanceOf[js.Any], rseqid = rseqid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TMessage]
  }
  
  @scala.inline
  implicit class TMessageOps[Self <: TMessage] (val x: Self) extends AnyVal {
    
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
    def setFname(value: String): Self = this.set("fname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtype(value: MessageType): Self = this.set("mtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRseqid(value: Double): Self = this.set("rseqid", value.asInstanceOf[js.Any])
  }
}
