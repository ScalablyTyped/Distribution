package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBAlternateInterface extends StObject {
  
  val alternateSetting: Double = js.native
  
  val endpoints: js.Array[USBEndpoint] = js.native
  
  val interfaceClass: Double = js.native
  
  val interfaceName: js.UndefOr[String] = js.native
  
  val interfaceProtocol: Double = js.native
  
  val interfaceSubclass: Double = js.native
}
object USBAlternateInterface {
  
  @scala.inline
  def apply(
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
  implicit class USBAlternateInterfaceMutableBuilder[Self <: USBAlternateInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateSetting(value: Double): Self = StObject.set(x, "alternateSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoints(value: js.Array[USBEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: USBEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
    
    @scala.inline
    def setInterfaceClass(value: Double): Self = StObject.set(x, "interfaceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceName(value: String): Self = StObject.set(x, "interfaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceNameUndefined: Self = StObject.set(x, "interfaceName", js.undefined)
    
    @scala.inline
    def setInterfaceProtocol(value: Double): Self = StObject.set(x, "interfaceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceSubclass(value: Double): Self = StObject.set(x, "interfaceSubclass", value.asInstanceOf[js.Any])
  }
}
