package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the venue associated with a geographic location. */
trait VenueData extends StObject {
  
  /** Gets the identifier (ID) of the venue. */
  var id: String
  
  /** Gets the identifier (ID) of the building level. */
  var level: String
}
object VenueData {
  
  @scala.inline
  def apply(id: String, level: String): VenueData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[VenueData]
  }
  
  @scala.inline
  implicit class VenueDataMutableBuilder[Self <: VenueData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
