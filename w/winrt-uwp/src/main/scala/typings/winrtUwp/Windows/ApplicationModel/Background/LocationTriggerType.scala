package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationTriggerType extends StObject
/** Indicates a type of location event for a location background task trigger. */
@JSGlobal("Windows.ApplicationModel.Background.LocationTriggerType")
@js.native
object LocationTriggerType extends StObject {
  
  /** Indicates a geofence location trigger. */
  @js.native
  sealed trait geofence extends LocationTriggerType
}
