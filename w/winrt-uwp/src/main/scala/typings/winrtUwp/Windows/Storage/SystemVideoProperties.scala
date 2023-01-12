package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper object that provides indexing names for video file properties. */
trait SystemVideoProperties extends StObject {
  
  /** Gets the name of the System.Video.Director property (one of the Windows video file properties). */
  var director: String
  
  /** Gets the name of the System.Video.FrameHeight property (one of the Windows video file properties). */
  var frameHeight: String
  
  /** Gets the name of the System.Video.FrameWidth property (one of the Windows video file properties). */
  var frameWidth: String
  
  /** Gets the name of the System.Video.Orientation property (one of the Windows video file properties). */
  var orientation: String
  
  /** Gets the name of the System.Video.TotalBitrate property (one of the Windows video file properties). */
  var totalBitrate: String
}
object SystemVideoProperties {
  
  inline def apply(
    director: String,
    frameHeight: String,
    frameWidth: String,
    orientation: String,
    totalBitrate: String
  ): SystemVideoProperties = {
    val __obj = js.Dynamic.literal(director = director.asInstanceOf[js.Any], frameHeight = frameHeight.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], totalBitrate = totalBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemVideoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemVideoProperties] (val x: Self) extends AnyVal {
    
    inline def setDirector(value: String): Self = StObject.set(x, "director", value.asInstanceOf[js.Any])
    
    inline def setFrameHeight(value: String): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
    
    inline def setFrameWidth(value: String): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setTotalBitrate(value: String): Self = StObject.set(x, "totalBitrate", value.asInstanceOf[js.Any])
  }
}
