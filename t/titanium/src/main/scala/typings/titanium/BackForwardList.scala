package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The object returned to the <Titanium.UI.WebView.backForwardList> method.
  */
@js.native
trait BackForwardList extends js.Object {
  
  /**
    * The item immediately preceding the current item.
    */
  var backItem: js.UndefOr[BackForwardListItem] = js.native
  
  /**
    * The portion of the list preceding the current item.
    */
  var backList: js.UndefOr[js.Array[BackForwardListItem]] = js.native
  
  /**
    * The current item.
    */
  var currentItem: js.UndefOr[BackForwardListItem] = js.native
  
  /**
    * The item immediately following the current item.
    */
  var forwardItem: js.UndefOr[BackForwardListItem] = js.native
  
  /**
    * The portion of the list following the current item.
    */
  var forwardList: js.UndefOr[js.Array[BackForwardListItem]] = js.native
}
object BackForwardList {
  
  @scala.inline
  def apply(): BackForwardList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackForwardList]
  }
  
  @scala.inline
  implicit class BackForwardListOps[Self <: BackForwardList] (val x: Self) extends AnyVal {
    
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
    def setBackItem(value: BackForwardListItem): Self = this.set("backItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackItem: Self = this.set("backItem", js.undefined)
    
    @scala.inline
    def setBackListVarargs(value: BackForwardListItem*): Self = this.set("backList", js.Array(value :_*))
    
    @scala.inline
    def setBackList(value: js.Array[BackForwardListItem]): Self = this.set("backList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackList: Self = this.set("backList", js.undefined)
    
    @scala.inline
    def setCurrentItem(value: BackForwardListItem): Self = this.set("currentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentItem: Self = this.set("currentItem", js.undefined)
    
    @scala.inline
    def setForwardItem(value: BackForwardListItem): Self = this.set("forwardItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardItem: Self = this.set("forwardItem", js.undefined)
    
    @scala.inline
    def setForwardListVarargs(value: BackForwardListItem*): Self = this.set("forwardList", js.Array(value :_*))
    
    @scala.inline
    def setForwardList(value: js.Array[BackForwardListItem]): Self = this.set("forwardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardList: Self = this.set("forwardList", js.undefined)
  }
}
