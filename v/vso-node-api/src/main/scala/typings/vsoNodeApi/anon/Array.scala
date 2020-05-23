package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array extends js.Object {
  var array: scala.Double
  var boolean: scala.Double
  var dateTime: scala.Double
  var dictionary: scala.Double
  var double: scala.Double
  var guid: scala.Double
  var integer: scala.Double
  var `object`: scala.Double
  var string: scala.Double
  var unknown: scala.Double
  var uri: scala.Double
}

object Array {
  @scala.inline
  def apply(
    array: scala.Double,
    boolean: scala.Double,
    dateTime: scala.Double,
    dictionary: scala.Double,
    double: scala.Double,
    guid: scala.Double,
    integer: scala.Double,
    `object`: scala.Double,
    string: scala.Double,
    unknown: scala.Double,
    uri: scala.Double
  ): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
}

