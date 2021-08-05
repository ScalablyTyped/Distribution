package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxItems extends StObject {
  
  /**
    * Maximum number of items.
    * @defaultValue 100
    */
  var maxItems: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of items.
    * @defaultValue 1
    */
  var minItems: js.UndefOr[Double] = js.undefined
  
  var numberOfItems: Double
  
  def onNumberOfItemsChange(newNumber: Double): Unit
}
object MaxItems {
  
  inline def apply(numberOfItems: Double, onNumberOfItemsChange: Double => Unit): MaxItems = {
    val __obj = js.Dynamic.literal(numberOfItems = numberOfItems.asInstanceOf[js.Any], onNumberOfItemsChange = js.Any.fromFunction1(onNumberOfItemsChange))
    __obj.asInstanceOf[MaxItems]
  }
  
  extension [Self <: MaxItems](x: Self) {
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    inline def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    inline def setOnNumberOfItemsChange(value: Double => Unit): Self = StObject.set(x, "onNumberOfItemsChange", js.Any.fromFunction1(value))
  }
}
