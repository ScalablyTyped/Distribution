package typings
package unityDashWebapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unity extends js.Object {
  var Launcher: UnityLauncher
  var MediaPlayer: UnityMediaPlayer
  var MessagingIndicator: UnityMessagingIndicator
  var Notification: UnityNotification
  def addAction(name: java.lang.String, callback: js.Function): js.Any
  def init(settings: UnitySettings): js.Any
  def removeAction(actionName: java.lang.String): js.Any
  def removeActions(): js.Any
}

object Unity {
  @scala.inline
  def apply(
    Launcher: UnityLauncher,
    MediaPlayer: UnityMediaPlayer,
    MessagingIndicator: UnityMessagingIndicator,
    Notification: UnityNotification,
    addAction: js.Function2[java.lang.String, js.Function, js.Any],
    init: js.Function1[UnitySettings, js.Any],
    removeAction: js.Function1[java.lang.String, js.Any],
    removeActions: js.Function0[js.Any]
  ): Unity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Launcher")(Launcher)
    __obj.updateDynamic("MediaPlayer")(MediaPlayer)
    __obj.updateDynamic("MessagingIndicator")(MessagingIndicator)
    __obj.updateDynamic("Notification")(Notification)
    __obj.updateDynamic("addAction")(addAction)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("removeAction")(removeAction)
    __obj.updateDynamic("removeActions")(removeActions)
    __obj.asInstanceOf[Unity]
  }
}

