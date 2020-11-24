package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cfid extends js.Object {
  
  var cfid: Double = js.native
  
  var clid: Double = js.native
  
  var ctid: Double = js.native
  
  var reasonid: Double = js.native
  
  var reasonmsg: String = js.native
}
object Cfid {
  
  @scala.inline
  def apply(cfid: Double, clid: Double, ctid: Double, reasonid: Double, reasonmsg: String): Cfid = {
    val __obj = js.Dynamic.literal(cfid = cfid.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], ctid = ctid.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any], reasonmsg = reasonmsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cfid]
  }
  
  @scala.inline
  implicit class CfidOps[Self <: Cfid] (val x: Self) extends AnyVal {
    
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
    def setCfid(value: Double): Self = this.set("cfid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClid(value: Double): Self = this.set("clid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtid(value: Double): Self = this.set("ctid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonid(value: Double): Self = this.set("reasonid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonmsg(value: String): Self = this.set("reasonmsg", value.asInstanceOf[js.Any])
  }
}
