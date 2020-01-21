package typings.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcomb", "union")
@js.native
object union extends js.Object {
  def apply[T](types: js.Array[Constructor[T]]): Union_[T] = js.native
  def apply[T](types: js.Array[Constructor[T]], name: java.lang.String): Union_[T] = js.native
}

