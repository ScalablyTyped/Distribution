package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a rendering site for an ILayout2.
  **/
@js.native
trait ILayoutSite2 extends js.Object {
  
  //#region Properties
  /**
    * Gets the number of groups in the site.
    **/
  var groupCount: Double = js.native
  
  /**
    * Gets the number of items in the site.
    **/
  var itemCount: Promise[Double] = js.native
  
  /**
    * Gets the pixel range of the realization area.
    **/
  var realizedRange: js.Any = js.native
  
  /**
    * Gets the tree for use by an object that implements the ILayout2 interface.
    **/
  var tree: js.Any = js.native
  
  /**
    * Gets the pixel range of visible items in the site.
    **/
  var visibleRange: js.Any = js.native
}
object ILayoutSite2 {
  
  @scala.inline
  def apply(
    groupCount: Double,
    itemCount: Promise[Double],
    realizedRange: js.Any,
    tree: js.Any,
    visibleRange: js.Any
  ): ILayoutSite2 = {
    val __obj = js.Dynamic.literal(groupCount = groupCount.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], realizedRange = realizedRange.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], visibleRange = visibleRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayoutSite2]
  }
  
  @scala.inline
  implicit class ILayoutSite2Ops[Self <: ILayoutSite2] (val x: Self) extends AnyVal {
    
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
    def setGroupCount(value: Double): Self = this.set("groupCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCount(value: Promise[Double]): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealizedRange(value: js.Any): Self = this.set("realizedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: js.Any): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRange(value: js.Any): Self = this.set("visibleRange", value.asInstanceOf[js.Any])
  }
}
