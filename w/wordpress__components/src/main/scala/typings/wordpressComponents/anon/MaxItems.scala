package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxItems extends js.Object {
  
  /**
    * Maximum number of items.
    * @defaultValue 100
    */
  var maxItems: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of items.
    * @defaultValue 1
    */
  var minItems: js.UndefOr[Double] = js.native
  
  var numberOfItems: Double = js.native
  
  def onNumberOfItemsChange(newNumber: Double): Unit = js.native
}
object MaxItems {
  
  @scala.inline
  def apply(numberOfItems: Double, onNumberOfItemsChange: Double => Unit): MaxItems = {
    val __obj = js.Dynamic.literal(numberOfItems = numberOfItems.asInstanceOf[js.Any], onNumberOfItemsChange = js.Any.fromFunction1(onNumberOfItemsChange))
    __obj.asInstanceOf[MaxItems]
  }
  
  @scala.inline
  implicit class MaxItemsOps[Self <: MaxItems] (val x: Self) extends AnyVal {
    
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
    def setNumberOfItems(value: Double): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnNumberOfItemsChange(value: Double => Unit): Self = this.set("onNumberOfItemsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    
    @scala.inline
    def setMinItems(value: Double): Self = this.set("minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinItems: Self = this.set("minItems", js.undefined)
  }
}
