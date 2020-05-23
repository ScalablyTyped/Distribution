package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  var boolean: scala.Double
  var guid: scala.Double
  var none: scala.Double
  var number: scala.Double
  var string: scala.Double
  var uri: scala.Double
}

object Number {
  @scala.inline
  def apply(
    boolean: scala.Double,
    guid: scala.Double,
    none: scala.Double,
    number: scala.Double,
    string: scala.Double,
    uri: scala.Double
  ): Number = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
}

