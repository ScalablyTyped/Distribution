package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The object returned to the <Titanium.UI.WebView.backForwardList> method.
  */
@js.native
trait BackForwardList extends StObject {
  
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
  implicit class BackForwardListMutableBuilder[Self <: BackForwardList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackItem(value: BackForwardListItem): Self = StObject.set(x, "backItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackItemUndefined: Self = StObject.set(x, "backItem", js.undefined)
    
    @scala.inline
    def setBackList(value: js.Array[BackForwardListItem]): Self = StObject.set(x, "backList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackListUndefined: Self = StObject.set(x, "backList", js.undefined)
    
    @scala.inline
    def setBackListVarargs(value: BackForwardListItem*): Self = StObject.set(x, "backList", js.Array(value :_*))
    
    @scala.inline
    def setCurrentItem(value: BackForwardListItem): Self = StObject.set(x, "currentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentItemUndefined: Self = StObject.set(x, "currentItem", js.undefined)
    
    @scala.inline
    def setForwardItem(value: BackForwardListItem): Self = StObject.set(x, "forwardItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardItemUndefined: Self = StObject.set(x, "forwardItem", js.undefined)
    
    @scala.inline
    def setForwardList(value: js.Array[BackForwardListItem]): Self = StObject.set(x, "forwardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardListUndefined: Self = StObject.set(x, "forwardList", js.undefined)
    
    @scala.inline
    def setForwardListVarargs(value: BackForwardListItem*): Self = StObject.set(x, "forwardList", js.Array(value :_*))
  }
}
