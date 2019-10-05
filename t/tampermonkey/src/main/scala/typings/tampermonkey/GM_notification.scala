package typings.tampermonkey

import typings.tampermonkey.Tampermonkey.NotificationDetails
import typings.tampermonkey.Tampermonkey.NotificationOnClick
import typings.tampermonkey.Tampermonkey.NotificationOnDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_notification")
@js.native
object GM_notification extends js.Object {
  /**
    * Shows a HTML5 Desktop notification and/or highlight the current tab.
    * @param ondone If specified used instead of `details.ondone`
    */
  def apply(details: NotificationDetails): Unit = js.native
  def apply(details: NotificationDetails, ondone: NotificationOnDone): Unit = js.native
  /**
    * Shows a HTML5 Desktop notification and/or highlight the current tab.
    * @param text Text of the notification
    * @param title Notification title. If not specified the script name is used
    * @param onclick Called in case the user clicks the notification
    */
  def apply(text: String): Unit = js.native
  def apply(text: String, title: String): Unit = js.native
  def apply(text: String, title: String, image: String): Unit = js.native
  def apply(text: String, title: String, image: String, onclick: NotificationOnClick): Unit = js.native
}

