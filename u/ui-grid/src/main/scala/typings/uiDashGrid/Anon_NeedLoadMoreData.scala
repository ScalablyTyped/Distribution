package typings.uiDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NeedLoadMoreData extends js.Object {
  /**
    * This event fires when scroll reaches bottom percentage of grid and needs to load data
    */
  var needLoadMoreData: js.Function
  /**
    * This event fires when scroll reaches top percentage of grid and needs to load data
    */
  var needLoadMoreDataTop: js.Function
}

object Anon_NeedLoadMoreData {
  @scala.inline
  def apply(needLoadMoreData: js.Function, needLoadMoreDataTop: js.Function): Anon_NeedLoadMoreData = {
    val __obj = js.Dynamic.literal(needLoadMoreData = needLoadMoreData.asInstanceOf[js.Any], needLoadMoreDataTop = needLoadMoreDataTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NeedLoadMoreData]
  }
}

