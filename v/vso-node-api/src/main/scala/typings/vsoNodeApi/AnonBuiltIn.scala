package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuiltIn extends js.Object {
  var builtIn: Double
  var trusted: Double
}

object AnonBuiltIn {
  @scala.inline
  def apply(builtIn: Double, trusted: Double): AnonBuiltIn = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuiltIn]
  }
}

