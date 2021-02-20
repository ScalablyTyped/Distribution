package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper object that provides indexing names for GPS file properties. */
@js.native
trait SystemGPSProperties extends StObject {
  
  /** Gets the name of the System.GPS.LatitudeDecimal property (one of the GPS file properties). */
  var latitudeDecimal: String = js.native
  
  /** Gets the name of the System.GPS.LongitudeDecimal property (one of the GPS file properties). */
  var longitudeDecimal: String = js.native
}
object SystemGPSProperties {
  
  @scala.inline
  def apply(latitudeDecimal: String, longitudeDecimal: String): SystemGPSProperties = {
    val __obj = js.Dynamic.literal(latitudeDecimal = latitudeDecimal.asInstanceOf[js.Any], longitudeDecimal = longitudeDecimal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemGPSProperties]
  }
  
  @scala.inline
  implicit class SystemGPSPropertiesMutableBuilder[Self <: SystemGPSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitudeDecimal(value: String): Self = StObject.set(x, "latitudeDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeDecimal(value: String): Self = StObject.set(x, "longitudeDecimal", value.asInstanceOf[js.Any])
  }
}
