package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unity extends js.Object {
  var Launcher: UnityLauncher
  var MediaPlayer: UnityMediaPlayer
  var MessagingIndicator: UnityMessagingIndicator
  var Notification: UnityNotification
  def addAction(name: String, callback: js.Function): js.Any
  def init(settings: UnitySettings): js.Any
  def removeAction(actionName: String): js.Any
  def removeActions(): js.Any
}

object Unity {
  @scala.inline
  def apply(
    Launcher: UnityLauncher,
    MediaPlayer: UnityMediaPlayer,
    MessagingIndicator: UnityMessagingIndicator,
    Notification: UnityNotification,
    addAction: (String, js.Function) => js.Any,
    init: UnitySettings => js.Any,
    removeAction: String => js.Any,
    removeActions: () => js.Any
  ): Unity = {
    val __obj = js.Dynamic.literal(Launcher = Launcher.asInstanceOf[js.Any], MediaPlayer = MediaPlayer.asInstanceOf[js.Any], MessagingIndicator = MessagingIndicator.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], addAction = js.Any.fromFunction2(addAction), init = js.Any.fromFunction1(init), removeAction = js.Any.fromFunction1(removeAction), removeActions = js.Any.fromFunction0(removeActions))
    __obj.asInstanceOf[Unity]
  }
}

