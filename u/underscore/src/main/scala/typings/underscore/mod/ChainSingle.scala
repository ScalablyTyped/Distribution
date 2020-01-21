package typings.underscore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainSingle[T] extends js.Object {
  def value(): T
}

object ChainSingle {
  @scala.inline
  def apply[T](value: () => T): ChainSingle[T] = {
    val __obj = js.Dynamic.literal(value = js.Any.fromFunction0(value))
  
    __obj.asInstanceOf[ChainSingle[T]]
  }
}

