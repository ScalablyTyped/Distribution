package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaseSensitive extends js.Object {
  var caseSensitive: scala.Double
  var none: scala.Double
  var objectTooLarge: scala.Double
  var unknown: scala.Double
}

object CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: scala.Double,
    none: scala.Double,
    objectTooLarge: scala.Double,
    unknown: scala.Double
  ): CaseSensitive = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], objectTooLarge = objectTooLarge.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
}

