package typings
package webpackDashHotDashMiddlewareLib.webpackDashHotDashMiddlewareMod.WebpackHotMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStream extends js.Object {
  def publish(payload: js.Any): scala.Unit
}

object EventStream {
  @scala.inline
  def apply(publish: js.Function1[js.Any, scala.Unit]): EventStream = {
    val __obj = js.Dynamic.literal(publish = publish)
  
    __obj.asInstanceOf[EventStream]
  }
}

