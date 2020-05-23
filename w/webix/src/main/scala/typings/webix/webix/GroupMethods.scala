package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMethods extends js.Object {
  def any(property: String, data: js.Any): Unit
  def count(property: String, data: js.Any): Unit
  def max(property: String, data: js.Any): Unit
  def min(property: String, data: js.Any): Unit
  def string(property: String, data: js.Any): Unit
  def sum(property: String, data: js.Any): Unit
}

object GroupMethods {
  @scala.inline
  def apply(
    any: (String, js.Any) => Unit,
    count: (String, js.Any) => Unit,
    max: (String, js.Any) => Unit,
    min: (String, js.Any) => Unit,
    string: (String, js.Any) => Unit,
    sum: (String, js.Any) => Unit
  ): GroupMethods = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), count = js.Any.fromFunction2(count), max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min), string = js.Any.fromFunction2(string), sum = js.Any.fromFunction2(sum))
    __obj.asInstanceOf[GroupMethods]
  }
}

