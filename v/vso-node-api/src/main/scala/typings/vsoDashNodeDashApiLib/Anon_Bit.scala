package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bit extends js.Object {
  var bit: scala.Double
  var dateTime: scala.Double
  var float: scala.Double
  var guid: scala.Double
  var int: scala.Double
  var string: scala.Double
}

object Anon_Bit {
  @scala.inline
  def apply(
    bit: scala.Double,
    dateTime: scala.Double,
    float: scala.Double,
    guid: scala.Double,
    int: scala.Double,
    string: scala.Double
  ): Anon_Bit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bit")(bit)
    __obj.updateDynamic("dateTime")(dateTime)
    __obj.updateDynamic("float")(float)
    __obj.updateDynamic("guid")(guid)
    __obj.updateDynamic("int")(int)
    __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[Anon_Bit]
  }
}

