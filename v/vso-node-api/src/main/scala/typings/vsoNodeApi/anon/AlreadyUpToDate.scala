package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlreadyUpToDate extends StObject {
  
  var alreadyUpToDate: scala.Double
  
  var inlineUpdateReceived: scala.Double
  
  var installed: scala.Double
  
  var preinstalled: scala.Double
  
  var receivedInstallOrUpdate: scala.Double
  
  var receivedUninstall: scala.Double
  
  var requestedUpdate: scala.Double
  
  var uninstalled: scala.Double
  
  var updated: scala.Double
}
object AlreadyUpToDate {
  
  inline def apply(
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
  
  extension [Self <: AlreadyUpToDate](x: Self) {
    
    inline def setAlreadyUpToDate(value: scala.Double): Self = StObject.set(x, "alreadyUpToDate", value.asInstanceOf[js.Any])
    
    inline def setInlineUpdateReceived(value: scala.Double): Self = StObject.set(x, "inlineUpdateReceived", value.asInstanceOf[js.Any])
    
    inline def setInstalled(value: scala.Double): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
    
    inline def setPreinstalled(value: scala.Double): Self = StObject.set(x, "preinstalled", value.asInstanceOf[js.Any])
    
    inline def setReceivedInstallOrUpdate(value: scala.Double): Self = StObject.set(x, "receivedInstallOrUpdate", value.asInstanceOf[js.Any])
    
    inline def setReceivedUninstall(value: scala.Double): Self = StObject.set(x, "receivedUninstall", value.asInstanceOf[js.Any])
    
    inline def setRequestedUpdate(value: scala.Double): Self = StObject.set(x, "requestedUpdate", value.asInstanceOf[js.Any])
    
    inline def setUninstalled(value: scala.Double): Self = StObject.set(x, "uninstalled", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: scala.Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
