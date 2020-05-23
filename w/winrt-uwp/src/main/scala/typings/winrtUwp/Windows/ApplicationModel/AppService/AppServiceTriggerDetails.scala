package typings.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents details associated with the background task for the app service. */
trait AppServiceTriggerDetails extends js.Object {
  /** Gets the connection to the endpoint of the other app service. */
  var appServiceConnection: AppServiceConnection
  /** Gets the name of the package family for the client app that called the background task for the app service. */
  var callerPackageFamilyName: String
  /** Gets the name of the app service. */
  var name: String
}

object AppServiceTriggerDetails {
  @scala.inline
  def apply(appServiceConnection: AppServiceConnection, callerPackageFamilyName: String, name: String): AppServiceTriggerDetails = {
    val __obj = js.Dynamic.literal(appServiceConnection = appServiceConnection.asInstanceOf[js.Any], callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppServiceTriggerDetails]
  }
}

