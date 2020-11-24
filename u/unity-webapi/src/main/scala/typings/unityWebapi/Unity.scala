package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unity extends js.Object {
  
  var Launcher: UnityLauncher = js.native
  
  var MediaPlayer: UnityMediaPlayer = js.native
  
  var MessagingIndicator: UnityMessagingIndicator = js.native
  
  var Notification: UnityNotification = js.native
  
  def addAction(name: String, callback: js.Function): js.Any = js.native
  
  def init(settings: UnitySettings): js.Any = js.native
  
  def removeAction(actionName: String): js.Any = js.native
  
  def removeActions(): js.Any = js.native
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
  
  @scala.inline
  implicit class UnityOps[Self <: Unity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLauncher(value: UnityLauncher): Self = this.set("Launcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaPlayer(value: UnityMediaPlayer): Self = this.set("MediaPlayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagingIndicator(value: UnityMessagingIndicator): Self = this.set("MessagingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: UnityNotification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAction(value: (String, js.Function) => js.Any): Self = this.set("addAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInit(value: UnitySettings => js.Any): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAction(value: String => js.Any): Self = this.set("removeAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveActions(value: () => js.Any): Self = this.set("removeActions", js.Any.fromFunction0(value))
  }
}
