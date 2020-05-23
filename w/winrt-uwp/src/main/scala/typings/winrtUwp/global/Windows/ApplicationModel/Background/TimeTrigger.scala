package typings.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a time event that triggers a background task to run. */
@JSGlobal("Windows.ApplicationModel.Background.TimeTrigger")
@js.native
class TimeTrigger protected ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.TimeTrigger {
  /**
    * Initializes a new instance of a time event trigger.
    * @param freshnessTime Specifies the number of minutes to wait before scheduling the background task. The system schedules the task within 15 minutes after freshnessTime elapses. If the OneShot property is false, freshnessTime specifies the interval between recurring tasks.
    * @param oneShot True if the time event trigger will be used once; false if it will be used each time freshnessTime elapses.
    */
  def this(freshnessTime: Double, oneShot: Boolean) = this()
  /** Gets the interval of a time event trigger. */
  /* CompleteClass */
  override var freshnessTime: Double = js.native
  /** Gets whether the time event trigger will be used only once or each time the FreshnessTime interval elapses. */
  /* CompleteClass */
  override var oneShot: Boolean = js.native
}

