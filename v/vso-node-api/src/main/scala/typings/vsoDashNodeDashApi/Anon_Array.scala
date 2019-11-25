package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var array: Double
  var boolean: Double
  var dateTime: Double
  var dictionary: Double
  var double: Double
  var guid: Double
  var integer: Double
  var `object`: Double
  var string: Double
  var unknown: Double
  var uri: Double
}

object Anon_Array {
  @scala.inline
  def apply(
    array: Double,
    boolean: Double,
    dateTime: Double,
    dictionary: Double,
    double: Double,
    guid: Double,
    integer: Double,
    `object`: Double,
    string: Double,
    unknown: Double,
    uri: Double
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Array]
  }
}

