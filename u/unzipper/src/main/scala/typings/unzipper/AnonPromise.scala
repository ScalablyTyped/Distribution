package typings.unzipper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromise extends js.Object {
  def promise(): js.Promise[Unit]
}

object AnonPromise {
  @scala.inline
  def apply(promise: () => js.Promise[Unit]): AnonPromise = {
    val __obj = js.Dynamic.literal(promise = js.Any.fromFunction0(promise))
  
    __obj.asInstanceOf[AnonPromise]
  }
}

