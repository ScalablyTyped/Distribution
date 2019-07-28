package typings.vastDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Timeout extends js.Object {
  var timeout: Double
  var withCredentials: Boolean
}

object Anon_Timeout {
  @scala.inline
  def apply(timeout: Double, withCredentials: Boolean): Anon_Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout, withCredentials = withCredentials)
  
    __obj.asInstanceOf[Anon_Timeout]
  }
}

