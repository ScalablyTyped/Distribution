package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlreadyUpToDate extends StObject {
  
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
  implicit class AlreadyUpToDateMutableBuilder[Self <: AlreadyUpToDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlreadyUpToDate(value: scala.Double): Self = StObject.set(x, "alreadyUpToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUpdateReceived(value: scala.Double): Self = StObject.set(x, "inlineUpdateReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalled(value: scala.Double): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreinstalled(value: scala.Double): Self = StObject.set(x, "preinstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedInstallOrUpdate(value: scala.Double): Self = StObject.set(x, "receivedInstallOrUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedUninstall(value: scala.Double): Self = StObject.set(x, "receivedUninstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedUpdate(value: scala.Double): Self = StObject.set(x, "requestedUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninstalled(value: scala.Double): Self = StObject.set(x, "uninstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: scala.Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
