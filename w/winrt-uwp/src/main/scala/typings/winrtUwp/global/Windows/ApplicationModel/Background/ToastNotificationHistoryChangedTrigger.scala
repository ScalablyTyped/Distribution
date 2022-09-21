package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an event that causes a background task to run when the history of toast notifications for the app is cleared, when one or more toast notifications are added to or removed from the notification history for the app, or when one or more toast notifications for the app expire and are removed from the notification history. */
@JSGlobal("Windows.ApplicationModel.Background.ToastNotificationHistoryChangedTrigger")
@js.native
/** Creates and initializes a new instance of the ToastNotificationHistoryChangedTrigger class. */
open class ToastNotificationHistoryChangedTrigger ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.ToastNotificationHistoryChangedTrigger {
  /**
    * Creates and initializes a new instance of the ToastNotificationHistoryChangedTrigger class for the app with the specified identifier.
    * @param applicationId The identifier of the app for which you want to create an instance of the ToastNotificationHistoryChangedTrigger class.
    */
  def this(applicationId: String) = this()
}
