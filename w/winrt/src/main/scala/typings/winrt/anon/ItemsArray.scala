package typings.winrt.anon

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsArray extends js.Object {
  var items: js.Array[IKeyValuePair[String, ResourceMap]] = js.native
  var returnValue: Double = js.native
}

object ItemsArray {
  @scala.inline
  def apply(items: js.Array[IKeyValuePair[String, ResourceMap]], returnValue: Double): ItemsArray = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsArray]
  }
  @scala.inline
  implicit class ItemsArrayOps[Self <: ItemsArray] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: (IKeyValuePair[String, ResourceMap])*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[IKeyValuePair[String, ResourceMap]]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

