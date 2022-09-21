package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a location event that triggers a background task. This is used for Geofencing. */
@JSGlobal("Windows.ApplicationModel.Background.LocationTrigger")
@js.native
open class LocationTrigger protected ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.LocationTrigger {
  /**
    * Initializes a new instance of a location event trigger.
    * @param triggerType The type of location event for this trigger.
    */
  def this(triggerType: typings.winrtUwp.Windows.ApplicationModel.Background.LocationTriggerType) = this()
  
  /** The type of location event for this trigger. */
  /* CompleteClass */
  var triggerType: typings.winrtUwp.Windows.ApplicationModel.Background.LocationTriggerType = js.native
}
