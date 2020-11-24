package typings.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific availability status. */
@js.native
trait RemoteSystemStatusTypeFilter extends IRemoteSystemFilter {
  
  /** The status type that the containing RemoteSystemStatusTypeFilter object targets. */
  var remoteSystemStatusType: RemoteSystemStatusType = js.native
}
object RemoteSystemStatusTypeFilter {
  
  @scala.inline
  def apply(remoteSystemStatusType: RemoteSystemStatusType): RemoteSystemStatusTypeFilter = {
    val __obj = js.Dynamic.literal(remoteSystemStatusType = remoteSystemStatusType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystemStatusTypeFilter]
  }
  
  @scala.inline
  implicit class RemoteSystemStatusTypeFilterOps[Self <: RemoteSystemStatusTypeFilter] (val x: Self) extends AnyVal {
    
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
    def setRemoteSystemStatusType(value: RemoteSystemStatusType): Self = this.set("remoteSystemStatusType", value.asInstanceOf[js.Any])
  }
}
