package typings.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents advanced event settings. */
@js.native
trait LoggingOptions extends js.Object {
  
  /** Gets or sets the unique identifier associated with an activity. */
  var activityId: String = js.native
  
  /** Gets or sets the keyword value that represents the different categories that an event belongs to. */
  var keywords: Double = js.native
  
  /** Gets or sets the operation code value for an event. */
  var opcode: LoggingOpcode = js.native
  
  /** Gets or sets a value that uniquely identifies the parent activity to which this activity is related. */
  var relatedActivityId: String = js.native
  
  /** Gets or sets the user-defined metadata value attached to an event. */
  var tags: Double = js.native
  
  /** Gets or sets the user-defined value that identifies a larger unit of work within an application or component. */
  var task: Double = js.native
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
  
  @scala.inline
  implicit class LoggingOptionsOps[Self <: LoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivityId(value: String): Self = this.set("activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: Double): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpcode(value: LoggingOpcode): Self = this.set("opcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedActivityId(value: String): Self = this.set("relatedActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Double): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: Double): Self = this.set("task", value.asInstanceOf[js.Any])
  }
}
