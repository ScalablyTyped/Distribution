package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHS256 extends js.Object {
  var hS256: Double
  var none: Double
  var rS256: Double
}

object AnonHS256 {
  @scala.inline
  def apply(hS256: Double, none: Double, rS256: Double): AnonHS256 = {
    val __obj = js.Dynamic.literal(hS256 = hS256.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rS256 = rS256.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHS256]
  }
}

