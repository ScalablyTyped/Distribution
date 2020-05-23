package typings.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents advanced event settings. */
trait LoggingOptions extends js.Object {
  /** Gets or sets the unique identifier associated with an activity. */
  var activityId: String
  /** Gets or sets the keyword value that represents the different categories that an event belongs to. */
  var keywords: Double
  /** Gets or sets the operation code value for an event. */
  var opcode: LoggingOpcode
  /** Gets or sets a value that uniquely identifies the parent activity to which this activity is related. */
  var relatedActivityId: String
  /** Gets or sets the user-defined metadata value attached to an event. */
  var tags: Double
  /** Gets or sets the user-defined value that identifies a larger unit of work within an application or component. */
  var task: Double
}

object LoggingOptions {
  @scala.inline
  def apply(
    activityId: String,
    keywords: Double,
    opcode: LoggingOpcode,
    relatedActivityId: String,
    tags: Double,
    task: Double
  ): LoggingOptions = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], opcode = opcode.asInstanceOf[js.Any], relatedActivityId = relatedActivityId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
}

