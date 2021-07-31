package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a rendering site for an ILayout2.
  **/
trait ILayoutSite2 extends StObject {
  
  //#region Properties
  /**
    * Gets the number of groups in the site.
    **/
  var groupCount: Double
  
  /**
    * Gets the number of items in the site.
    **/
  var itemCount: Promise[Double]
  
  /**
    * Gets the pixel range of the realization area.
    **/
  var realizedRange: js.Any
  
  /**
    * Gets the tree for use by an object that implements the ILayout2 interface.
    **/
  var tree: js.Any
  
  /**
    * Gets the pixel range of visible items in the site.
    **/
  var visibleRange: js.Any
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
  implicit class ILayoutSite2MutableBuilder[Self <: ILayoutSite2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupCount(value: Double): Self = StObject.set(x, "groupCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCount(value: Promise[Double]): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealizedRange(value: js.Any): Self = StObject.set(x, "realizedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: js.Any): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRange(value: js.Any): Self = StObject.set(x, "visibleRange", value.asInstanceOf[js.Any])
  }
}
