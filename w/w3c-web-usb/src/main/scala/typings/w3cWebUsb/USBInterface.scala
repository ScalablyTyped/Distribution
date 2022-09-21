package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBInterface extends StObject {
  
  val alternate: USBAlternateInterface
  
  val alternates: js.Array[USBAlternateInterface]
  
  val claimed: Boolean
  
  val interfaceNumber: Double
}
object USBInterface {
  
  inline def apply(
    alternate: USBAlternateInterface,
    alternates: js.Array[USBAlternateInterface],
    claimed: Boolean,
    interfaceNumber: Double
  ): USBInterface = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], alternates = alternates.asInstanceOf[js.Any], claimed = claimed.asInstanceOf[js.Any], interfaceNumber = interfaceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBInterface]
  }
  
  extension [Self <: USBInterface](x: Self) {
    
    inline def setAlternate(value: USBAlternateInterface): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternates(value: js.Array[USBAlternateInterface]): Self = StObject.set(x, "alternates", value.asInstanceOf[js.Any])
    
    inline def setAlternatesVarargs(value: USBAlternateInterface*): Self = StObject.set(x, "alternates", js.Array(value*))
    
    inline def setClaimed(value: Boolean): Self = StObject.set(x, "claimed", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNumber(value: Double): Self = StObject.set(x, "interfaceNumber", value.asInstanceOf[js.Any])
  }
}
