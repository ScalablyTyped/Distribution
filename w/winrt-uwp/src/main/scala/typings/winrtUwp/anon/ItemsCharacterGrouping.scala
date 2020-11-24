package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Globalization.Collation.CharacterGrouping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsCharacterGrouping extends js.Object {
  
  /** The CharacterGrouping objects in the set that start at startIndex. */ var items: CharacterGrouping = js.native
  
  /** The number of objects returned. */ var returnValue: Double = js.native
}
object ItemsCharacterGrouping {
  
  @scala.inline
  def apply(items: CharacterGrouping, returnValue: Double): ItemsCharacterGrouping = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsCharacterGrouping]
  }
  
  @scala.inline
  implicit class ItemsCharacterGroupingOps[Self <: ItemsCharacterGrouping] (val x: Self) extends AnyVal {
    
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
    def setItems(value: CharacterGrouping): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
}
