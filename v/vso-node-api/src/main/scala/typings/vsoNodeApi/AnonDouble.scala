package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDouble extends js.Object {
  var boolean: Double
  var dateTime: Double
  var double: Double
  var integer: Double
  var plainText: Double
  var string: Double
  var treePath: Double
}

object AnonDouble {
  @scala.inline
  def apply(
    boolean: Double,
    dateTime: Double,
    double: Double,
    integer: Double,
    plainText: Double,
    string: Double,
    treePath: Double
  ): AnonDouble = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDouble]
  }
}

