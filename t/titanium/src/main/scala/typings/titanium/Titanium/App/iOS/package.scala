package typings.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iOS {
  
  /**
    * Fired when the user activity get deleted using the <Titanium.App.iOS.UserActivity.deleteAllSavedUserActivities> or
    * <Titanium.App.iOS.UserActivity.deleteSavedUserActivitiesForPersistentIdentifiers> methods.
    */
  type UserActivityUseractivitydeletedEvent = typings.titanium.Titanium.App.iOS.UserActivityBaseEvent
  
  /**
    * Fired when a property is changed.
    */
  type UserDefaultsChangeEvent = typings.titanium.Titanium.App.iOS.UserDefaultsBaseEvent
  
  /**
    * The top-level App iOS Notification Center module. It is used to control scheduled notifications
    * and receive details about the system-wide notification settings.
    */
  type UserNotificationCenter = typings.titanium.Titanium.Module
}
