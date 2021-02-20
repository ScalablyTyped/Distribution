package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of a single Presentation Format GATT Descriptor. */
@js.native
trait GattPresentationFormat extends StObject {
  
  /** Gets the Description of the GattPresentationFormat object. */
  var description: Double = js.native
  
  /** Gets the Exponent of the GattPresentationFormat object. */
  var exponent: Double = js.native
  
  /** Gets the Format Type of the GattPresentationFormat object. */
  var formatType: Double = js.native
  
  /** Gets the Namespace of the GattPresentationFormat object. */
  var namespace: Double = js.native
  
  /** Gets the Unit of the GattPresentationFormat object. */
  var unit: Double = js.native
}
object GattPresentationFormat {
  
  @scala.inline
  def apply(description: Double, exponent: Double, formatType: Double, namespace: Double, unit: Double): GattPresentationFormat = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exponent = exponent.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattPresentationFormat]
  }
  
  @scala.inline
  implicit class GattPresentationFormatMutableBuilder[Self <: GattPresentationFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Double): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatType(value: Double): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Double): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
