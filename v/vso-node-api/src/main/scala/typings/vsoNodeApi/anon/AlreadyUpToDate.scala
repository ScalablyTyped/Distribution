package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlreadyUpToDate extends js.Object {
  
  var alreadyUpToDate: scala.Double = js.native
  
  var inlineUpdateReceived: scala.Double = js.native
  
  var installed: scala.Double = js.native
  
  var preinstalled: scala.Double = js.native
  
  var receivedInstallOrUpdate: scala.Double = js.native
  
  var receivedUninstall: scala.Double = js.native
  
  var requestedUpdate: scala.Double = js.native
  
  var uninstalled: scala.Double = js.native
  
  var updated: scala.Double = js.native
}
object AlreadyUpToDate {
  
  @scala.inline
  def apply(
    alreadyUpToDate: scala.Double,
    inlineUpdateReceived: scala.Double,
    installed: scala.Double,
    preinstalled: scala.Double,
    receivedInstallOrUpdate: scala.Double,
    receivedUninstall: scala.Double,
    requestedUpdate: scala.Double,
    uninstalled: scala.Double,
    updated: scala.Double
  ): AlreadyUpToDate = {
    val __obj = js.Dynamic.literal(alreadyUpToDate = alreadyUpToDate.asInstanceOf[js.Any], inlineUpdateReceived = inlineUpdateReceived.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], preinstalled = preinstalled.asInstanceOf[js.Any], receivedInstallOrUpdate = receivedInstallOrUpdate.asInstanceOf[js.Any], receivedUninstall = receivedUninstall.asInstanceOf[js.Any], requestedUpdate = requestedUpdate.asInstanceOf[js.Any], uninstalled = uninstalled.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlreadyUpToDate]
  }
  
  @scala.inline
  implicit class AlreadyUpToDateOps[Self <: AlreadyUpToDate] (val x: Self) extends AnyVal {
    
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
    def setAlreadyUpToDate(value: scala.Double): Self = this.set("alreadyUpToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUpdateReceived(value: scala.Double): Self = this.set("inlineUpdateReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalled(value: scala.Double): Self = this.set("installed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreinstalled(value: scala.Double): Self = this.set("preinstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedInstallOrUpdate(value: scala.Double): Self = this.set("receivedInstallOrUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedUninstall(value: scala.Double): Self = this.set("receivedUninstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedUpdate(value: scala.Double): Self = this.set("requestedUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninstalled(value: scala.Double): Self = this.set("uninstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: scala.Double): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
}
