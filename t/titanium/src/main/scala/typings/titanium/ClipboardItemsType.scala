package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary describing the items for <Titanium.UI.Clipboard.setItems>.
  */
@js.native
trait ClipboardItemsType extends js.Object {
  
  /**
    * An array of key-value items to add to the clipboard. The key must a valid mime-type
    * matching the mime-type of the value.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The privacy options to apply to all the items on the clipboard. The available options are
    * described in `Ti.UI.CLIPBOARD_OPTION_*`. Depending on the key, the value can be a Date or
    * Boolean.
    */
  var options: js.UndefOr[js.Any] = js.native
}
object ClipboardItemsType {
  
  @scala.inline
  def apply(): ClipboardItemsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipboardItemsType]
  }
  
  @scala.inline
  implicit class ClipboardItemsTypeOps[Self <: ClipboardItemsType] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
