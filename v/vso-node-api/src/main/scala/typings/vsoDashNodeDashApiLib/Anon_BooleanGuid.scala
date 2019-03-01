package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BooleanGuid extends js.Object {
  var boolean: scala.Double
  var guid: scala.Double
  var none: scala.Double
  var number: scala.Double
  var string: scala.Double
  var uri: scala.Double
}

object Anon_BooleanGuid {
  @scala.inline
  def apply(
    boolean: scala.Double,
    guid: scala.Double,
    none: scala.Double,
    number: scala.Double,
    string: scala.Double,
    uri: scala.Double
  ): Anon_BooleanGuid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boolean")(boolean)
    __obj.updateDynamic("guid")(guid)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("string")(string)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_BooleanGuid]
  }
}

