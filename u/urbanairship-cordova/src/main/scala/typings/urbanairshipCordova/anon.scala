package typings.urbanairshipCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alert extends StObject {
    
    var alert: Double
    
    var badge: Double
    
    var none: Double
    
    var sound: Double
  }
  object Alert {
    
    inline def apply(alert: Double, badge: Double, none: Double, sound: Double): Alert = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alert]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alert] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: Double): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      inline def setSound(value: Double): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    }
  }
}
