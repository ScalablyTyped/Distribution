package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Required extends js.Object {
  var required: Double
  var supported: Double
  var unsupported: Double
}

object Anon_Required {
  @scala.inline
  def apply(required: Double, supported: Double, unsupported: Double): Anon_Required = {
    val __obj = js.Dynamic.literal(required = required, supported = supported, unsupported = unsupported)
  
    __obj.asInstanceOf[Anon_Required]
  }
}

