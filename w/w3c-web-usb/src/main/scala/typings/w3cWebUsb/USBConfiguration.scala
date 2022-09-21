package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBConfiguration extends StObject {
  
  val configurationName: js.UndefOr[String] = js.undefined
  
  val configurationValue: Double
  
  val interfaces: js.Array[USBInterface]
}
object USBConfiguration {
  
  inline def apply(configurationValue: Double, interfaces: js.Array[USBInterface]): USBConfiguration = {
    val __obj = js.Dynamic.literal(configurationValue = configurationValue.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBConfiguration]
  }
  
  extension [Self <: USBConfiguration](x: Self) {
    
    inline def setConfigurationName(value: String): Self = StObject.set(x, "configurationName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationNameUndefined: Self = StObject.set(x, "configurationName", js.undefined)
    
    inline def setConfigurationValue(value: Double): Self = StObject.set(x, "configurationValue", value.asInstanceOf[js.Any])
    
    inline def setInterfaces(value: js.Array[USBInterface]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
    
    inline def setInterfacesVarargs(value: USBInterface*): Self = StObject.set(x, "interfaces", js.Array(value*))
  }
}
