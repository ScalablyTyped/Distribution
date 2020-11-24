package typings.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents details associated with the background task for the app service. */
@js.native
trait AppServiceTriggerDetails extends js.Object {
  
  /** Gets the connection to the endpoint of the other app service. */
  var appServiceConnection: AppServiceConnection = js.native
  
  /** Gets the name of the package family for the client app that called the background task for the app service. */
  var callerPackageFamilyName: String = js.native
  
  /** Gets the name of the app service. */
  var name: String = js.native
}
object AppServiceTriggerDetails {
  
  @scala.inline
  def apply(appServiceConnection: AppServiceConnection, callerPackageFamilyName: String, name: String): AppServiceTriggerDetails = {
    val __obj = js.Dynamic.literal(appServiceConnection = appServiceConnection.asInstanceOf[js.Any], callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppServiceTriggerDetails]
  }
  
  @scala.inline
  implicit class AppServiceTriggerDetailsOps[Self <: AppServiceTriggerDetails] (val x: Self) extends AnyVal {
    
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
    def setAppServiceConnection(value: AppServiceConnection): Self = this.set("appServiceConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerPackageFamilyName(value: String): Self = this.set("callerPackageFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
