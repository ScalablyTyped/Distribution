package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents information elements in a Wi-Fi Direct packet. */
trait WiFiDirectInformationElement extends StObject {
  
  /** A three-byte organization identifier used to indicate the organization which defined a vendor extension information element (IE). */
  var oui: IBuffer
  
  /** A one byte type value used in a vendor extension information element (IE) to distinguish between different IE formats defined by the same organization. */
  var ouiType: Double
  
  /** The value of the information element. */
  var value: IBuffer
}
object WiFiDirectInformationElement {
  
  @scala.inline
  def apply(oui: IBuffer, ouiType: Double, value: IBuffer): WiFiDirectInformationElement = {
    val __obj = js.Dynamic.literal(oui = oui.asInstanceOf[js.Any], ouiType = ouiType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectInformationElement]
  }
  
  @scala.inline
  implicit class WiFiDirectInformationElementMutableBuilder[Self <: WiFiDirectInformationElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOui(value: IBuffer): Self = StObject.set(x, "oui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuiType(value: Double): Self = StObject.set(x, "ouiType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
