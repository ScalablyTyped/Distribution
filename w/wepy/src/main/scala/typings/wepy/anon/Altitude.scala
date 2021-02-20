package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Altitude extends StObject {
  
  var altitude: Boolean = js.native
  
  var `type`: String = js.native
}
object Altitude {
  
  @scala.inline
  def apply(altitude: Boolean, `type`: String): Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
  
  @scala.inline
  implicit class AltitudeMutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Boolean): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
