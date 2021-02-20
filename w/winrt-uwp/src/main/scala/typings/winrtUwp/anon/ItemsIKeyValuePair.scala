package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsIKeyValuePair extends StObject {
  
  /** The items in the map view. */ var items: IKeyValuePair[_, _] = js.native
  
  /** The number of items in the map view. */ var returnValue: Double = js.native
}
object ItemsIKeyValuePair {
  
  @scala.inline
  def apply(items: IKeyValuePair[_, _], returnValue: Double): ItemsIKeyValuePair = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIKeyValuePair]
  }
  
  @scala.inline
  implicit class ItemsIKeyValuePairMutableBuilder[Self <: ItemsIKeyValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: IKeyValuePair[_, _]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
