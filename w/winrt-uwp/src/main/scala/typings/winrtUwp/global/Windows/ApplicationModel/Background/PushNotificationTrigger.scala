package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object that invokes a background work item on the app in response to the receipt of a raw notification . */
@JSGlobal("Windows.ApplicationModel.Background.PushNotificationTrigger")
@js.native
/** Invokes a background work item on the app in response to the receipt of a raw notification . */
open class PushNotificationTrigger ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.PushNotificationTrigger {
  /**
    * Invokes a background work item on a specified app in response to the receipt of a raw notification .
    * @param applicationId The app's Package Relative Application ID (PRAID). The specified app must be in the same package as the calling app.
    */
  def this(applicationId: String) = this()
}
