package typings
package vexdbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0[T] extends js.Object {
  var result: js.Array[T]
  var size: scala.Double
  var status: vexdbLib.vexdbLibNumbers.`0` | vexdbLib.vexdbLibNumbers.`1`
}

object Anon_0 {
  @scala.inline
  def apply[T](
    result: js.Array[T],
    size: scala.Double,
    status: vexdbLib.vexdbLibNumbers.`0` | vexdbLib.vexdbLibNumbers.`1`
  ): Anon_0[T] = {
    val __obj = js.Dynamic.literal(result = result, size = size, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_0[T]]
  }
}

