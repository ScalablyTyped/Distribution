package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMethods extends js.Object {
  def any(property: java.lang.String, data: js.Any): scala.Unit
  def count(property: java.lang.String, data: js.Any): scala.Unit
  def max(property: java.lang.String, data: js.Any): scala.Unit
  def min(property: java.lang.String, data: js.Any): scala.Unit
  def string(property: java.lang.String, data: js.Any): scala.Unit
  def sum(property: java.lang.String, data: js.Any): scala.Unit
}

object GroupMethods {
  @scala.inline
  def apply(
    any: (java.lang.String, js.Any) => scala.Unit,
    count: (java.lang.String, js.Any) => scala.Unit,
    max: (java.lang.String, js.Any) => scala.Unit,
    min: (java.lang.String, js.Any) => scala.Unit,
    string: (java.lang.String, js.Any) => scala.Unit,
    sum: (java.lang.String, js.Any) => scala.Unit
  ): GroupMethods = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), count = js.Any.fromFunction2(count), max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min), string = js.Any.fromFunction2(string), sum = js.Any.fromFunction2(sum))
  
    __obj.asInstanceOf[GroupMethods]
  }
}

