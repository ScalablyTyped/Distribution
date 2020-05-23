package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NeedLoadMoreData extends js.Object {
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
}

