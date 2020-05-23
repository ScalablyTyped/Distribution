package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTask extends js.Object {
  /**
    * 中断请求任务
    */
  def abort(): Unit
}

object RequestTask {
  @scala.inline
  def apply(abort: () => Unit): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[RequestTask]
  }
}

