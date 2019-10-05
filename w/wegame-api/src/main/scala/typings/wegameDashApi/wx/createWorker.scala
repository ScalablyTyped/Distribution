package typings.wegameDashApi.wx

import typings.wegameDashApi.WxWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.createWorker")
@js.native
object createWorker extends js.Object {
  // --Worker
  /**
    * 创建一个 Worker 线程，目前限制最多只能创建一个 Worker，创建下一个 Worker 前请调用 Worker.terminate
    */
  def apply(): WxWorker = js.native
}

