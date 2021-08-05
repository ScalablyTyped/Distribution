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
  
  inline def apply(data: IBuffer, duration: Double, id: String, startTime: Double): DataCue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCue]
  }
  
  extension [Self <: DataCue](x: Self) {
    
    inline def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
