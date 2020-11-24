package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of notification actions to associate with a notification.
  */
@js.native
trait UserNotificationCategory extends Proxy {
  
  /**
    * Array of notification actions to associate with the group.
    */
  var actionsForDefaultContext: js.Array[UserNotificationAction] = js.native
  
  /**
    * Array of notification actions to display for non-dialog-style notification.
    */
  var actionsForMinimalContext: js.Array[UserNotificationAction] = js.native
  
  /**
    * A format string for the summary description used when the system groups the category's notifications.
    */
  var categorySummaryFormat: String = js.native
  
  /**
    * The placeholder text to display when notification previews are disabled for the app.
    */
  var hiddenPreviewsBodyPlaceholder: String = js.native
  
  /**
    * Identifier for this category.
    */
  var identifier: String = js.native
  
  /**
    * The intents related to notifications of this category.
    */
  var intentIdentifiers: js.Array[String] = js.native
  
  /**
    * Options for how to handle notifications of this type.
    */
  var options: js.Array[Double] = js.native
}
