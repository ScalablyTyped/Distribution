package typings.winrtUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an enterprise protected buffer or stream. */
@js.native
trait DataProtectionInfo extends js.Object {
  
  /** The enterprise identity of the enterprise protected buffer or stream. */
  var identity: String = js.native
  
  /** The protection status of the enterprise protected buffer or stream. */
  var status: DataProtectionStatus = js.native
}
object DataProtectionInfo {
  
  @scala.inline
  def apply(identity: String, status: DataProtectionStatus): DataProtectionInfo = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProtectionInfo]
  }
  
  @scala.inline
  implicit class DataProtectionInfoOps[Self <: DataProtectionInfo] (val x: Self) extends AnyVal {
    
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
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DataProtectionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
