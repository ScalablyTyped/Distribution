package typings.webpackHotMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStream extends js.Object {
  def publish(payload: js.Any): Unit
}

object EventStream {
  @scala.inline
  def apply(publish: js.Any => Unit): EventStream = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction1(publish))
  
    __obj.asInstanceOf[EventStream]
  }
}

