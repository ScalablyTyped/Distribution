package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents timeline properties of the SystemMediaTransportControls . Pass an instance of this class to the UpdateTimelineProperties method to update the properties. */
@js.native
trait SystemMediaTransportControlsTimelineProperties extends StObject {
  
  /** Gets or sets a value representing the end time of the currently playing media item. */
  var endTime: Double = js.native
  
  /** Gets or sets a value indicating the latest time within the currently playing media item to which the user can seek. */
  var maxSeekTime: Double = js.native
  
  /** Gets or sets a value indicating the earliest time within the currently playing media item to which the user can seek. */
  var minSeekTime: Double = js.native
  
  /** Gets or sets a value representing the current playback position within the currently playing media item. */
  var position: Double = js.native
  
  /** Gets or sets a value representing the start time of the currently playing media item. */
  var startTime: Double = js.native
}
object SystemMediaTransportControlsTimelineProperties {
  
  @scala.inline
  def apply(endTime: Double, maxSeekTime: Double, minSeekTime: Double, position: Double, startTime: Double): SystemMediaTransportControlsTimelineProperties = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], maxSeekTime = maxSeekTime.asInstanceOf[js.Any], minSeekTime = minSeekTime.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsTimelineProperties]
  }
  
  @scala.inline
  implicit class SystemMediaTransportControlsTimelinePropertiesMutableBuilder[Self <: SystemMediaTransportControlsTimelineProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSeekTime(value: Double): Self = StObject.set(x, "maxSeekTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSeekTime(value: Double): Self = StObject.set(x, "minSeekTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
