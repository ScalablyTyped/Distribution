package typings.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromise extends js.Object {
  var promise: js.Promise[js.UndefOr[String]]
  def abort(): Unit
}

object AnonPromise {
  @scala.inline
  def apply(abort: () => Unit, promise: js.Promise[js.UndefOr[String]]): AnonPromise = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPromise]
  }
}

