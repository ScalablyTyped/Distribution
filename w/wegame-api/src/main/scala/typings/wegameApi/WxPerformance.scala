package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WxPerformance extends js.Object {
  /**
    * 时间戳
    */
  def now(): Double
}

object WxPerformance {
  @scala.inline
  def apply(now: () => Double): WxPerformance = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[WxPerformance]
  }
}

