package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inherited extends js.Object {
  var custom: scala.Double
  var inherited: scala.Double
  var system: scala.Double
}

object Inherited {
  @scala.inline
  def apply(custom: scala.Double, inherited: scala.Double, system: scala.Double): Inherited = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inherited]
  }
}

