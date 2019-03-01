package typings
package webgmeLib.GlobalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  var configurable: scala.Boolean
  var enumerable: scala.Boolean
  var value: scala.Boolean
  var writable: scala.Boolean
}

object History {
  @scala.inline
  def apply(
    configurable: scala.Boolean,
    enumerable: scala.Boolean,
    value: scala.Boolean,
    writable: scala.Boolean
  ): History = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configurable")(configurable)
    __obj.updateDynamic("enumerable")(enumerable)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[History]
  }
}

