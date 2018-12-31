package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages the toast notifications for an app including the ability the clear all toast history and removing individual toasts. */
@JSGlobal("Windows.UI.Notifications.ToastNotificationHistory")
@js.native
abstract class ToastNotificationHistory () extends js.Object {
  /** Removes all notifications sent by this app from action center. */
  def clear(): scala.Unit = js.native
  /**
    * Removes all notifications from action center that were sent by another app inside the same app package.
    * @param applicationId The ID of the app inside the app package whose notifications are to be deleted.
    */
  def clear(applicationId: java.lang.String): scala.Unit = js.native
  /**
    * Gets notification history, for all notifications sent by this app, from action center.
    * @return A collection of toasts.
    */
  def getHistory(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ToastNotification] = js.native
  /**
    * Gets notification history, for a toast with the specified tag label, from action center.
    * @param applicationId The tag label for the toast being queried-for.
    * @return A collection of toasts.
    */
  def getHistory(applicationId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ToastNotification] = js.native
  /**
    * Removes an individual toast, with the specified tag label, from action center.
    * @param tag The tag label of the toast notification to be removed.
    */
  def remove(tag: java.lang.String): scala.Unit = js.native
  /**
    * Removes a toast notification from the action using the notification's tag and group labels.
    * @param tag The tag label of the toast notification to be removed.
    * @param group The group label of the toast notification to be removed.
    */
  def remove(tag: java.lang.String, group: java.lang.String): scala.Unit = js.native
  /**
    * Removes an individual toast notification from action center, identified by the combination of tag label, group label and app ID.
    * @param tag The tag label of the toast notification to be removed.
    * @param group The group label of the toast notification to be removed.
    * @param applicationId The app ID of the app that sent the specified toast notification. This app must be part of the same app package as the app making this remove request.
    */
  def remove(tag: java.lang.String, group: java.lang.String, applicationId: java.lang.String): scala.Unit = js.native
  /**
    * Removes a group of toast notifications, identified by the specified group label, from action center.
    * @param group The group label of the toast notifications to be removed.
    */
  def removeGroup(group: java.lang.String): scala.Unit = js.native
  /**
    * Removes a group of toast notifications sent by the another app inside the same app package from action center using the group label.
    * @param group The group label of the toast notifications to be removed.
    * @param applicationId The app ID of the app within the same app package of the calling app.
    */
  def removeGroup(group: java.lang.String, applicationId: java.lang.String): scala.Unit = js.native
}

