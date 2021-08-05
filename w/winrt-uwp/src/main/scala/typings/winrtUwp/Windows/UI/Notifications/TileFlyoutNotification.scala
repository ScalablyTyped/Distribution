package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileFlyoutNotification extends StObject {
  
  var content: js.Any
  
  /* unmapped type */
  var expirationTime: js.Any
}
object TileFlyoutNotification {
  
  inline def apply(content: js.Any, expirationTime: js.Any): TileFlyoutNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileFlyoutNotification]
  }
  
  extension [Self <: TileFlyoutNotification](x: Self) {
    
    inline def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: js.Any): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
  }
}
