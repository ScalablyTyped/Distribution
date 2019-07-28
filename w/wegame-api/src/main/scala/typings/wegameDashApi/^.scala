package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  // --渲染
  def cancelAnimationFrame(requestID: Double): Unit = js.native
  def clearInterval(intervalID: Double): Unit = js.native
  // --定时器
  def clearTimeout(timeoutID: Double): Unit = js.native
  def requestAnimationFrame(callback: js.Function0[Unit]): Double = js.native
  def setInterval(fn: js.Function0[Unit], delay: Double, rest: js.Any*): Double = js.native
  def setTimeout(fn: js.Function0[Unit], delay: Double, rest: js.Any*): Double = js.native
}

