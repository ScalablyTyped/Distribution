package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNotificationDescriptor extends StObject {
  
  var action: String
  
  var badge: Double
  
  var body: String
  
  var data: js.Object
  
  var sound: String
  
  var title: String
  
  var `type`: PushNotificationType
}
object PushNotificationDescriptor {
  
  inline def apply(
    action: String,
    badge: Double,
    body: String,
    data: js.Object,
    sound: String,
    title: String,
    `type`: PushNotificationType
  ): PushNotificationDescriptor = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationDescriptor]
  }
  
  extension [Self <: PushNotificationDescriptor](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: PushNotificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
