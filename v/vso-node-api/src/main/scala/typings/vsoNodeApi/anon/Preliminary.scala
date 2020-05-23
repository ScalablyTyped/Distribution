package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Preliminary extends js.Object {
  var full: scala.Double
  var preliminary: scala.Double
}

object Preliminary {
  @scala.inline
  def apply(full: scala.Double, preliminary: scala.Double): Preliminary = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], preliminary = preliminary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preliminary]
  }
}

