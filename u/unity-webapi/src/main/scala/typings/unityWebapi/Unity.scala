package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unity extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Unity](x: Self) {
    
    inline def setAddAction(value: (String, js.Function) => js.Any): Self = StObject.set(x, "addAction", js.Any.fromFunction2(value))
    
    inline def setInit(value: UnitySettings => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setLauncher(value: UnityLauncher): Self = StObject.set(x, "Launcher", value.asInstanceOf[js.Any])
    
    inline def setMediaPlayer(value: UnityMediaPlayer): Self = StObject.set(x, "MediaPlayer", value.asInstanceOf[js.Any])
    
    inline def setMessagingIndicator(value: UnityMessagingIndicator): Self = StObject.set(x, "MessagingIndicator", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: UnityNotification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setRemoveAction(value: String => js.Any): Self = StObject.set(x, "removeAction", js.Any.fromFunction1(value))
    
    inline def setRemoveActions(value: () => js.Any): Self = StObject.set(x, "removeActions", js.Any.fromFunction0(value))
  }
}
