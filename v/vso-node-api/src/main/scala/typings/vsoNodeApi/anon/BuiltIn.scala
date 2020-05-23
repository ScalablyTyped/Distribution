package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltIn extends js.Object {
  var builtIn: scala.Double
  var trusted: scala.Double
}

object BuiltIn {
  @scala.inline
  def apply(builtIn: scala.Double, trusted: scala.Double): BuiltIn = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltIn]
  }
}

