package typings.wouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteComponentProps[T /* <: DefaultParams */] extends js.Object {
  var params: T
}

object RouteComponentProps {
  @scala.inline
  def apply[/* <: typings.wouter.mod.DefaultParams */ T](params: T): RouteComponentProps[T] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[T]]
  }
}

