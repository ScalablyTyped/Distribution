package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyLicense
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsIPlayReadyLicense extends StObject {
  
  /** The items in the collection. */ var items: IPlayReadyLicense
  
  /** The number of items in the collection. */ var returnValue: Double
}
object ItemsIPlayReadyLicense {
  
  inline def apply(items: IPlayReadyLicense, returnValue: Double): ItemsIPlayReadyLicense = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIPlayReadyLicense]
  }
  
  extension [Self <: ItemsIPlayReadyLicense](x: Self) {
    
    inline def setItems(value: IPlayReadyLicense): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
