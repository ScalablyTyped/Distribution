package typings.uirouterAngularjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve extends js.Object {
  def resolve(): js.Any
}

object Resolve {
  @scala.inline
  def apply(resolve: () => js.Any): Resolve = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[Resolve]
  }
}

