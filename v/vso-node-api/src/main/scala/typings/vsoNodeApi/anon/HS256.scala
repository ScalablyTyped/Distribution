package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HS256 extends js.Object {
  var hS256: scala.Double
  var none: scala.Double
  var rS256: scala.Double
}

object HS256 {
  @scala.inline
  def apply(hS256: scala.Double, none: scala.Double, rS256: scala.Double): HS256 = {
    val __obj = js.Dynamic.literal(hS256 = hS256.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rS256 = rS256.asInstanceOf[js.Any])
    __obj.asInstanceOf[HS256]
  }
}

