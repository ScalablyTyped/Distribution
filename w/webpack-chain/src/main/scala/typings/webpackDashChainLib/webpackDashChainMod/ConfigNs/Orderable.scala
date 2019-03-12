package typings
package webpackDashChainLib.webpackDashChainMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Orderable extends js.Object {
  def after(name: java.lang.String): this.type
  def before(name: java.lang.String): this.type
}

object Orderable {
  @scala.inline
  def apply(after: java.lang.String => Orderable, before: java.lang.String => Orderable): Orderable = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before))
  
    __obj.asInstanceOf[Orderable]
  }
}

