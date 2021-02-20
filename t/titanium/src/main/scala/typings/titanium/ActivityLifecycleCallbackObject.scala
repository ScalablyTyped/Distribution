package typings.titanium

import typings.titanium.Titanium.Android.Activity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object passed to the <Titanium.Android.Activity> callbacks for
  * onCreate, onDestroy, onPause, onResume, onStart, onStop, onRestart.
  * Additional properties may be set on the Object.
  */
@js.native
trait ActivityLifecycleCallbackObject extends StObject {
  
  /**
    * The Activity firing the callback.
    */
  var source: js.UndefOr[Activity] = js.native
}
object ActivityLifecycleCallbackObject {
  
  @scala.inline
  def apply(): ActivityLifecycleCallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityLifecycleCallbackObject]
  }
  
  @scala.inline
  implicit class ActivityLifecycleCallbackObjectMutableBuilder[Self <: ActivityLifecycleCallbackObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Activity): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
