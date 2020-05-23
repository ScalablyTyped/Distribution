package typings.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a system event that triggers a background task to run. */
@JSGlobal("Windows.ApplicationModel.Background.SystemTrigger")
@js.native
class SystemTrigger protected ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.SystemTrigger {
  /**
    * Initializes a new instance of a system event trigger.
    * @param triggerType Specifies the system event type.
    * @param oneShot True if the system event trigger will be used once; false if it will be used every time the event occurs.
    */
  def this(
    triggerType: typings.winrtUwp.Windows.ApplicationModel.Background.SystemTriggerType,
    oneShot: Boolean
  ) = this()
  /** Gets whether a system event trigger will be used only once. */
  /* CompleteClass */
  override var oneShot: Boolean = js.native
  /** Gets the system event type of a system event trigger. */
  /* CompleteClass */
  override var triggerType: typings.winrtUwp.Windows.ApplicationModel.Background.SystemTriggerType = js.native
}

