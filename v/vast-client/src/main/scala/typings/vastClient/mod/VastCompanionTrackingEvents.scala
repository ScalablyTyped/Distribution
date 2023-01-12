package typings.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastCompanionTrackingEvents
  extends StObject
     with /* key */ StringDictionary[js.Array[String]] {
  
  var creativeView: js.Array[String]
}
object VastCompanionTrackingEvents {
  
  inline def apply(creativeView: js.Array[String]): VastCompanionTrackingEvents = {
    val __obj = js.Dynamic.literal(creativeView = creativeView.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCompanionTrackingEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VastCompanionTrackingEvents] (val x: Self) extends AnyVal {
    
    inline def setCreativeView(value: js.Array[String]): Self = StObject.set(x, "creativeView", value.asInstanceOf[js.Any])
    
    inline def setCreativeViewVarargs(value: String*): Self = StObject.set(x, "creativeView", js.Array(value*))
  }
}
