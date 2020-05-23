package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var custom: scala.Double
  var default: scala.Double
  var upgrade: scala.Double
}

object Default {
  @scala.inline
  def apply(custom: scala.Double, default: scala.Double, upgrade: scala.Double): Default = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

