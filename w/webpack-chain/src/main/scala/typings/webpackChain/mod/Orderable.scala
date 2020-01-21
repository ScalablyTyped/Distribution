package typings.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Orderable extends js.Object {
  def after(name: String): this.type
  def before(name: String): this.type
}

object Orderable {
  @scala.inline
  def apply(after: String => Orderable, before: String => Orderable): Orderable = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before))
  
    __obj.asInstanceOf[Orderable]
  }
}

