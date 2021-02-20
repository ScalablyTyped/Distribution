package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents advanced event settings. */
@js.native
trait LoggingOptions extends StObject {
  
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
  implicit class LoggingOptionsMutableBuilder[Self <: LoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: Double): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpcode(value: LoggingOpcode): Self = StObject.set(x, "opcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedActivityId(value: String): Self = StObject.set(x, "relatedActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Double): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: Double): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
  }
}
