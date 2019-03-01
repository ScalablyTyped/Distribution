package typings
package underscoreLib.underscoreMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ChainSingle[T] extends js.Object {
  def value(): T
}

object _ChainSingle {
  @scala.inline
  def apply[T](value: js.Function0[T]): _ChainSingle[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[_ChainSingle[T]]
  }
}

