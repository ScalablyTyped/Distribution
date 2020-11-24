package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper object that provides indexing names for GPS file properties. */
@js.native
trait SystemGPSProperties extends js.Object {
  
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
  implicit class SystemGPSPropertiesOps[Self <: SystemGPSProperties] (val x: Self) extends AnyVal {
    
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
    def setLatitudeDecimal(value: String): Self = this.set("latitudeDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeDecimal(value: String): Self = this.set("longitudeDecimal", value.asInstanceOf[js.Any])
  }
}
