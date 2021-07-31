package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeedLoadMoreData extends StObject {
  
  /**
    * This event fires when scroll reaches bottom percentage of grid and needs to load data
    */
  var needLoadMoreData: js.Function
  
  /**
    * This event fires when scroll reaches top percentage of grid and needs to load data
    */
  var needLoadMoreDataTop: js.Function
}
object NeedLoadMoreData {
  
  @scala.inline
  def apply(needLoadMoreData: js.Function, needLoadMoreDataTop: js.Function): NeedLoadMoreData = {
    val __obj = js.Dynamic.literal(needLoadMoreData = needLoadMoreData.asInstanceOf[js.Any], needLoadMoreDataTop = needLoadMoreDataTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedLoadMoreData]
  }
  
  @scala.inline
  implicit class NeedLoadMoreDataMutableBuilder[Self <: NeedLoadMoreData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNeedLoadMoreData(value: js.Function): Self = StObject.set(x, "needLoadMoreData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedLoadMoreDataTop(value: js.Function): Self = StObject.set(x, "needLoadMoreDataTop", value.asInstanceOf[js.Any])
  }
}
