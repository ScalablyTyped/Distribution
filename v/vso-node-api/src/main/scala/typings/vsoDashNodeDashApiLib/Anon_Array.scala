package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
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

object Anon_Array {
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
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(array = array, boolean = boolean, dateTime = dateTime, dictionary = dictionary, double = double, guid = guid, integer = integer, string = string, unknown = unknown, uri = uri)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_Array]
  }
}

