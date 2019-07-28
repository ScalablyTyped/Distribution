package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: Double
  var warning: Double
}

object Anon_Error {
  @scala.inline
  def apply(error: Double, warning: Double): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, warning = warning)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

