package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsPnpObject extends StObject {
  
  /** Provides the destination for the result. Size the initial array size as a "capacity" in order to specify how many results should be retrieved. */ var items: PnpObject
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsPnpObject {
  
  inline def apply(items: PnpObject, returnValue: Double): ItemsPnpObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsPnpObject]
  }
  
  extension [Self <: ItemsPnpObject](x: Self) {
    
    inline def setItems(value: PnpObject): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
