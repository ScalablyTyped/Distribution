package typings
package subscriptionsDashTransportDashWsLib.distClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  def applyMiddleware(options: OperationOptions, next: js.Function): scala.Unit
}

object Middleware {
  @scala.inline
  def apply(applyMiddleware: js.Function2[OperationOptions, js.Function, scala.Unit]): Middleware = {
    val __obj = js.Dynamic.literal(applyMiddleware = applyMiddleware)
  
    __obj.asInstanceOf[Middleware]
  }
}

