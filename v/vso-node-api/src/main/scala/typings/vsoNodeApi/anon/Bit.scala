package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bit extends js.Object {
  var bit: scala.Double
  var dateTime: scala.Double
  var float: scala.Double
  var guid: scala.Double
  var int: scala.Double
  var string: scala.Double
}

object Bit {
  @scala.inline
  def apply(
    bit: scala.Double,
    dateTime: scala.Double,
    float: scala.Double,
    guid: scala.Double,
    int: scala.Double,
    string: scala.Double
  ): Bit = {
    val __obj = js.Dynamic.literal(bit = bit.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bit]
  }
}

