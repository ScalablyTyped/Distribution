package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitive extends js.Object {
  var caseSensitive: scala.Double
  var none: scala.Double
  var objectTooLarge: scala.Double
  var unknown: scala.Double
}

object Anon_CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: scala.Double,
    none: scala.Double,
    objectTooLarge: scala.Double,
    unknown: scala.Double
  ): Anon_CaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("caseSensitive")(caseSensitive)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("objectTooLarge")(objectTooLarge)
    __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[Anon_CaseSensitive]
  }
}

