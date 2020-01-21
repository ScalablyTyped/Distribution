package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaseSensitive extends js.Object {
  var caseSensitive: Double
  var none: Double
  var objectTooLarge: Double
  var unknown: Double
}

object AnonCaseSensitive {
  @scala.inline
  def apply(caseSensitive: Double, none: Double, objectTooLarge: Double, unknown: Double): AnonCaseSensitive = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], objectTooLarge = objectTooLarge.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCaseSensitive]
  }
}

