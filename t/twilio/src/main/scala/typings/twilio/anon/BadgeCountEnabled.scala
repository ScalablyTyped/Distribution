package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeCountEnabled extends StObject {
  
  var badgeCountEnabled: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var sound: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
}
object BadgeCountEnabled {
  
  inline def apply(): BadgeCountEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeCountEnabled]
  }
  
  extension [Self <: BadgeCountEnabled](x: Self) {
    
    inline def setBadgeCountEnabled(value: Boolean): Self = StObject.set(x, "badgeCountEnabled", value.asInstanceOf[js.Any])
    
    inline def setBadgeCountEnabledUndefined: Self = StObject.set(x, "badgeCountEnabled", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
