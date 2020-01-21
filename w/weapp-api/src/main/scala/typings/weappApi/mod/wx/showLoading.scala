package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weapp-api", "wx.showLoading")
@js.native
object showLoading extends js.Object {
  /**
    * 显示 loading 提示框。需主动调用 wx.hideLoading 才能关闭提示框
    * @param options
    */
  def apply(options: LoadingOptions): Unit = js.native
}

