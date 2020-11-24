package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsIKeyValuePair extends js.Object {
  
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
  implicit class ItemsIKeyValuePairOps[Self <: ItemsIKeyValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItems(value: IKeyValuePair[_, _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
}
