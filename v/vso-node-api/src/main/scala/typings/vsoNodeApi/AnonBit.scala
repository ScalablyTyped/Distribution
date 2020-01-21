package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBit extends js.Object {
  var bit: Double
  var dateTime: Double
  var float: Double
  var guid: Double
  var int: Double
  var string: Double
}

object AnonBit {
  @scala.inline
  def apply(bit: Double, dateTime: Double, float: Double, guid: Double, int: Double, string: Double): AnonBit = {
    val __obj = js.Dynamic.literal(bit = bit.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBit]
  }
}

