package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Required extends js.Object {
  var required: scala.Double
  var supported: scala.Double
  var unsupported: scala.Double
}

object Anon_Required {
  @scala.inline
  def apply(required: scala.Double, supported: scala.Double, unsupported: scala.Double): Anon_Required = {
    val __obj = js.Dynamic.literal(required = required, supported = supported, unsupported = unsupported)
  
    __obj.asInstanceOf[Anon_Required]
  }
}

