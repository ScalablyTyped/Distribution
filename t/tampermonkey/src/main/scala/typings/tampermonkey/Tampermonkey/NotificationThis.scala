package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationThis
  extends StObject
     with Notification {
  
  var id: String
}
object NotificationThis {
  
  @scala.inline
  def apply(id: String): NotificationThis = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationThis]
  }
  
  @scala.inline
  implicit class NotificationThisMutableBuilder[Self <: NotificationThis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
