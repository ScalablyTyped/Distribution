package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by ListView's currentItem API
  **/
@js.native
trait IListViewItem extends js.Object {
  
  /**
    * Gets or sets whether the ListView item is focused.
    **/
  var hasFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets index of the ListView item.
    **/
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets key of the ListView item.
    **/
  var key: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets whether the ListView item is focused and is showing its focus visual.
    **/
  var showFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the type, if any.
    **/
  var `type`: js.UndefOr[ObjectType] = js.native
}
object IListViewItem {
  
  @scala.inline
  def apply(): IListViewItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListViewItem]
  }
  
  @scala.inline
  implicit class IListViewItemOps[Self <: IListViewItem] (val x: Self) extends AnyVal {
    
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
    def setHasFocus(value: Boolean): Self = this.set("hasFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFocus: Self = this.set("hasFocus", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setShowFocus(value: Boolean): Self = this.set("showFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFocus: Self = this.set("showFocus", js.undefined)
    
    @scala.inline
    def setType(value: ObjectType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
