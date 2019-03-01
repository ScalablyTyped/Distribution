package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NeedLoadMoreData extends js.Object {
  /**
    * This event fires when scroll reaches bottom percentage of grid and needs to load data
    */
  var needLoadMoreData: angularLib.angularMod.Global.Function
  /**
    * This event fires when scroll reaches top percentage of grid and needs to load data
    */
  var needLoadMoreDataTop: angularLib.angularMod.Global.Function
}

object Anon_NeedLoadMoreData {
  @scala.inline
  def apply(
    needLoadMoreData: angularLib.angularMod.Global.Function,
    needLoadMoreDataTop: angularLib.angularMod.Global.Function
  ): Anon_NeedLoadMoreData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("needLoadMoreData")(needLoadMoreData)
    __obj.updateDynamic("needLoadMoreDataTop")(needLoadMoreDataTop)
    __obj.asInstanceOf[Anon_NeedLoadMoreData]
  }
}

