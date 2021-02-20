package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBConfiguration extends StObject {
  
  val configurationName: js.UndefOr[String] = js.native
  
  val configurationValue: Double = js.native
  
  val interfaces: js.Array[USBInterface] = js.native
}
object USBConfiguration {
  
  @scala.inline
  def apply(configurationValue: Double, interfaces: js.Array[USBInterface]): USBConfiguration = {
    val __obj = js.Dynamic.literal(configurationValue = configurationValue.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBConfiguration]
  }
  
  @scala.inline
  implicit class USBConfigurationMutableBuilder[Self <: USBConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationName(value: String): Self = StObject.set(x, "configurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationNameUndefined: Self = StObject.set(x, "configurationName", js.undefined)
    
    @scala.inline
    def setConfigurationValue(value: Double): Self = StObject.set(x, "configurationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaces(value: js.Array[USBInterface]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfacesVarargs(value: USBInterface*): Self = StObject.set(x, "interfaces", js.Array(value :_*))
  }
}
