package typings
package underscoreLib.underscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ChainSingle[T] extends js.Object {
  def value(): T
}

object _ChainSingle {
  @scala.inline
  def apply[T](value: () => T): _ChainSingle[T] = {
    val __obj = js.Dynamic.literal(value = js.Any.fromFunction0(value))
  
    __obj.asInstanceOf[_ChainSingle[T]]
  }
}

