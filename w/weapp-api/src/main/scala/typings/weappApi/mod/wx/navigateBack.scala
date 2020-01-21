package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weapp-api", "wx.navigateBack")
@js.native
object navigateBack extends js.Object {
  /**
    * 关闭当前页面，返回上一页面或多级页面。可通过 getCurrentPages() 获取当前的页面栈，决定需要返回几层。
    */
  def apply(options: NavigateBackOptions): Unit = js.native
}

