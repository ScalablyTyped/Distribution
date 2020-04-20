package typings.uirouterAngularjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResolve extends js.Object {
  def resolve(): js.Any
}

object AnonResolve {
  @scala.inline
  def apply(resolve: () => js.Any): AnonResolve = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[AnonResolve]
  }
}

