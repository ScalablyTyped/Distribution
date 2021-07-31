package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a data cue that can be included in a TimedMetadataTrack . */
trait DataCue extends StObject {
  
  /** Gets the data associated with the cue. */
  var data: IBuffer
  
  /** Gets or sets the duration of the cue. */
  var duration: Double
  
  /** Gets the identifier for the timed metadata track. */
  var id: String
  
  /** Gets the start time of the cue. */
  var startTime: Double
}
object DataCue {
  
  @scala.inline
  def apply(data: IBuffer, duration: Double, id: String, startTime: Double): DataCue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCue]
  }
  
  @scala.inline
  implicit class DataCueMutableBuilder[Self <: DataCue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
