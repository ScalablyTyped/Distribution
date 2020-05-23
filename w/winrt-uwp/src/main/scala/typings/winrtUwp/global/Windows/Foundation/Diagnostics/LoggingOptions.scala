package typings.winrtUwp.global.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents advanced event settings. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingOptions")
@js.native
/** Initializes a new LoggingOptions instance with default option values. */
class LoggingOptions ()
  extends typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOptions {
  /**
    * Initializes a new LoggingOptions instance with the specified keyword value.
    * @param keywords The keyword value.
    */
  def this(keywords: Double) = this()
  /** Gets or sets the unique identifier associated with an activity. */
  /* CompleteClass */
  override var activityId: String = js.native
  /** Gets or sets the keyword value that represents the different categories that an event belongs to. */
  /* CompleteClass */
  override var keywords: Double = js.native
  /** Gets or sets the operation code value for an event. */
  /* CompleteClass */
  override var opcode: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOpcode = js.native
  /** Gets or sets a value that uniquely identifies the parent activity to which this activity is related. */
  /* CompleteClass */
  override var relatedActivityId: String = js.native
  /** Gets or sets the user-defined metadata value attached to an event. */
  /* CompleteClass */
  override var tags: Double = js.native
  /** Gets or sets the user-defined value that identifies a larger unit of work within an application or component. */
  /* CompleteClass */
  override var task: Double = js.native
}

