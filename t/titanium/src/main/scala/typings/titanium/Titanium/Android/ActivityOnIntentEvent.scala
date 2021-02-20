package typings.titanium.Titanium.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the activity is launched.
  */
@js.native
trait ActivityOnIntentEvent extends ActivityBaseEvent {
  
  /**
    * The `Intent` used to launch the Activity.
    */
  var intent: Intent = js.native
}
object ActivityOnIntentEvent {
  
  @scala.inline
  def apply(intent: Intent, source: Activity): ActivityOnIntentEvent = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityOnIntentEvent]
  }
  
  @scala.inline
  implicit class ActivityOnIntentEventMutableBuilder[Self <: ActivityOnIntentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
  }
}
