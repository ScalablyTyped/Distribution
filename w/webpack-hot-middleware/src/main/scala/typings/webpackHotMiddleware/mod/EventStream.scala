package typings.webpackHotMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStream extends js.Object {
  def close(): Unit
  def publish(payload: js.Any): Unit
}

object EventStream {
  @scala.inline
  def apply(close: () => Unit, publish: js.Any => Unit): EventStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), publish = js.Any.fromFunction1(publish))
    __obj.asInstanceOf[EventStream]
  }
}

