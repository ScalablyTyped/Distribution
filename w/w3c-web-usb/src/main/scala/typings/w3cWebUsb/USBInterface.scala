package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBInterface extends StObject {
  
  val alternate: USBAlternateInterface = js.native
  
  val alternates: js.Array[USBAlternateInterface] = js.native
  
  val claimed: Boolean = js.native
  
  val interfaceNumber: Double = js.native
}
object USBInterface {
  
  @scala.inline
  def apply(
    alternate: USBAlternateInterface,
    alternates: js.Array[USBAlternateInterface],
    claimed: Boolean,
    interfaceNumber: Double
  ): USBInterface = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], alternates = alternates.asInstanceOf[js.Any], claimed = claimed.asInstanceOf[js.Any], interfaceNumber = interfaceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBInterface]
  }
  
  @scala.inline
  implicit class USBInterfaceMutableBuilder[Self <: USBInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: USBAlternateInterface): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternates(value: js.Array[USBAlternateInterface]): Self = StObject.set(x, "alternates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternatesVarargs(value: USBAlternateInterface*): Self = StObject.set(x, "alternates", js.Array(value :_*))
    
    @scala.inline
    def setClaimed(value: Boolean): Self = StObject.set(x, "claimed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceNumber(value: Double): Self = StObject.set(x, "interfaceNumber", value.asInstanceOf[js.Any])
  }
}
