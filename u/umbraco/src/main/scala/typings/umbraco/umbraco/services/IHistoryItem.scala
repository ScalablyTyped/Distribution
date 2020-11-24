package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * History item
  */
@js.native
trait IHistoryItem extends js.Object {
  
  //css class for the list, ex: "icon-image", "icon-doc"
  var icon: String = js.native
  
  //route to the editor, ex: "/content/edit/1234"
  var link: String = js.native
  
  //friendly name for the history listing
  var name: String = js.native
}
object IHistoryItem {
  
  @scala.inline
  def apply(icon: String, link: String, name: String): IHistoryItem = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryItem]
  }
  
  @scala.inline
  implicit class IHistoryItemOps[Self <: IHistoryItem] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
