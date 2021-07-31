package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task to enable device manufacturer operations. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceManufacturerNotificationTrigger")
@js.native
class DeviceManufacturerNotificationTrigger protected ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.DeviceManufacturerNotificationTrigger {
  /**
    * Initializes a new instance of the DeviceManufacturerNotificationTrigger class.
    * @param triggerQualifier An app-defined string that qualifies the trigger.
    * @param oneShot Whether the trigger is used only once.
    */
  def this(triggerQualifier: String, oneShot: Boolean) = this()
  
  /** Gets whether the trigger is used only once. */
  /* CompleteClass */
  var oneShot: Boolean = js.native
  
  /** Gets an app-defined string that qualifies the trigger. */
  /* CompleteClass */
  var triggerQualifier: String = js.native
}
