package typings.subscriptionsTransportWs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  def applyMiddleware(options: OperationOptions, next: js.Function): Unit
}

object Middleware {
  @scala.inline
  def apply(applyMiddleware: (OperationOptions, js.Function) => Unit): Middleware = {
    val __obj = js.Dynamic.literal(applyMiddleware = js.Any.fromFunction2(applyMiddleware))
  
    __obj.asInstanceOf[Middleware]
  }
}

