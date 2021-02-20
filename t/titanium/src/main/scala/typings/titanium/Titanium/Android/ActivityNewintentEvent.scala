package typings.titanium.Titanium.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the activity is already running and an intent different than the one that launched it was received.
  */
@js.native
trait ActivityNewintentEvent extends ActivityBaseEvent {
  
  /**
    * The `Intent` passed to the native `onNewIntent` method.
    */
  var intent: Intent = js.native
}
object ActivityNewintentEvent {
  
  @scala.inline
  def apply(intent: Intent, source: Activity): ActivityNewintentEvent = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityNewintentEvent]
  }
  
  @scala.inline
  implicit class ActivityNewintentEventMutableBuilder[Self <: ActivityNewintentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
  }
}
