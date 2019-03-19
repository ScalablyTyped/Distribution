package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTask extends js.Object {
  /**
    * 中断请求任务
    */
  def abort(): scala.Unit
}

object RequestTask {
  @scala.inline
  def apply(abort: () => scala.Unit): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
  
    __obj.asInstanceOf[RequestTask]
  }
}

