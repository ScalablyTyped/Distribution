package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Double extends js.Object {
  var boolean: scala.Double
  var dateTime: scala.Double
  var double: scala.Double
  var integer: scala.Double
  var plainText: scala.Double
  var string: scala.Double
  var treePath: scala.Double
}

object Double {
  @scala.inline
  def apply(
    boolean: scala.Double,
    dateTime: scala.Double,
    double: scala.Double,
    integer: scala.Double,
    plainText: scala.Double,
    string: scala.Double,
    treePath: scala.Double
  ): Double = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Double]
  }
}

