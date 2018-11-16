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

