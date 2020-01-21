package typings.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNeedLoadMoreData extends js.Object {
  /**
    * This event fires when scroll reaches bottom percentage of grid and needs to load data
    */
  var needLoadMoreData: js.Function
  /**
    * This event fires when scroll reaches top percentage of grid and needs to load data
    */
  var needLoadMoreDataTop: js.Function
}

object AnonNeedLoadMoreData {
  @scala.inline
  def apply(needLoadMoreData: js.Function, needLoadMoreDataTop: js.Function): AnonNeedLoadMoreData = {
    val __obj = js.Dynamic.literal(needLoadMoreData = needLoadMoreData.asInstanceOf[js.Any], needLoadMoreDataTop = needLoadMoreDataTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNeedLoadMoreData]
  }
}

