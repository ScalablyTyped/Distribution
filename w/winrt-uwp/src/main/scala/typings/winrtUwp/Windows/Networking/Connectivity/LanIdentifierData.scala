package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the port specific data that enables LAN locality capabilities. */
trait LanIdentifierData extends StObject {
  
  /** Gets a value indicating the type of data stored in the value field of the LanIdentifierData object according to the Link Layer Discovery Protocol (LLDP) protocol. */
  var `type`: Double
  
  /** Gets the serialized value. */
  var value: IVectorView[Double]
}
object LanIdentifierData {
  
  @scala.inline
  def apply(`type`: Double, value: IVectorView[Double]): LanIdentifierData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanIdentifierData]
  }
  
  @scala.inline
  implicit class LanIdentifierDataMutableBuilder[Self <: LanIdentifierData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IVectorView[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
