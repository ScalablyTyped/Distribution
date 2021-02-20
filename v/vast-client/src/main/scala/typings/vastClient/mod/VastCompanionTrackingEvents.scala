package typings.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastCompanionTrackingEvents
  extends /* key */ StringDictionary[js.Array[String]] {
  
  var creativeView: js.Array[String] = js.native
}
object VastCompanionTrackingEvents {
  
  @scala.inline
  def apply(creativeView: js.Array[String]): VastCompanionTrackingEvents = {
    val __obj = js.Dynamic.literal(creativeView = creativeView.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCompanionTrackingEvents]
  }
  
  @scala.inline
  implicit class VastCompanionTrackingEventsMutableBuilder[Self <: VastCompanionTrackingEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeView(value: js.Array[String]): Self = StObject.set(x, "creativeView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeViewVarargs(value: String*): Self = StObject.set(x, "creativeView", js.Array(value :_*))
  }
}
