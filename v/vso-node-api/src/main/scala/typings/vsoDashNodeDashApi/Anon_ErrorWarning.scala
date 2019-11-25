package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorWarning extends js.Object {
  var error: Double
  var warning: Double
}

object Anon_ErrorWarning {
  @scala.inline
  def apply(error: Double, warning: Double): Anon_ErrorWarning = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrorWarning]
  }
}

