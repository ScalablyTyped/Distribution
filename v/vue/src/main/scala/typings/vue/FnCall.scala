package typings.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T](array: js.Array[T], key: Double, value: T): T = js.native
  def apply[T](`object`: js.Object, key: String, value: T): T = js.native
  def apply[T](`object`: js.Object, key: Double, value: T): T = js.native
}

