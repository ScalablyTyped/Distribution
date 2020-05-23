package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promise extends js.Object {
  var promise: js.Promise[js.UndefOr[String]]
  def abort(): Unit
}

object Promise {
  @scala.inline
  def apply(abort: () => Unit, promise: js.Promise[js.UndefOr[String]]): Promise = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
}

