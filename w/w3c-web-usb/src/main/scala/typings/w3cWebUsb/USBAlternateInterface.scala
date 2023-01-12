package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBAlternateInterface extends StObject {
  
  val alternateSetting: Double
  
  val endpoints: js.Array[USBEndpoint]
  
  val interfaceClass: Double
  
  val interfaceName: js.UndefOr[String] = js.undefined
  
  val interfaceProtocol: Double
  
  val interfaceSubclass: Double
}
object USBAlternateInterface {
  
  inline def apply(
    alternateSetting: Double,
    endpoints: js.Array[USBEndpoint],
    interfaceClass: Double,
    interfaceProtocol: Double,
    interfaceSubclass: Double
  ): USBAlternateInterface = {
    val __obj = js.Dynamic.literal(alternateSetting = alternateSetting.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], interfaceClass = interfaceClass.asInstanceOf[js.Any], interfaceProtocol = interfaceProtocol.asInstanceOf[js.Any], interfaceSubclass = interfaceSubclass.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBAlternateInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USBAlternateInterface] (val x: Self) extends AnyVal {
    
    inline def setAlternateSetting(value: Double): Self = StObject.set(x, "alternateSetting", value.asInstanceOf[js.Any])
    
    inline def setEndpoints(value: js.Array[USBEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsVarargs(value: USBEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
    
    inline def setInterfaceClass(value: Double): Self = StObject.set(x, "interfaceClass", value.asInstanceOf[js.Any])
    
    inline def setInterfaceName(value: String): Self = StObject.set(x, "interfaceName", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNameUndefined: Self = StObject.set(x, "interfaceName", js.undefined)
    
    inline def setInterfaceProtocol(value: Double): Self = StObject.set(x, "interfaceProtocol", value.asInstanceOf[js.Any])
    
    inline def setInterfaceSubclass(value: Double): Self = StObject.set(x, "interfaceSubclass", value.asInstanceOf[js.Any])
  }
}
