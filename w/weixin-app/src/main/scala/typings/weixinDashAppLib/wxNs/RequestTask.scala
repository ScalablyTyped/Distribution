package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 返回一个 requestTask 对象，通过 requestTask，可中断请求任务。
	 */
trait RequestTask extends js.Object {
  def abort(): scala.Unit
}

object RequestTask {
  @scala.inline
  def apply(abort: js.Function0[scala.Unit]): RequestTask = {
    val __obj = js.Dynamic.literal(abort = abort)
  
    __obj.asInstanceOf[RequestTask]
  }
}

