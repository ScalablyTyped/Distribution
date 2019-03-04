package typings
package vastDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Timeout extends js.Object {
  var timeout: scala.Double
  var withCredentials: scala.Boolean
}

object Anon_Timeout {
  @scala.inline
  def apply(timeout: scala.Double, withCredentials: scala.Boolean): Anon_Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout, withCredentials = withCredentials)
  
    __obj.asInstanceOf[Anon_Timeout]
  }
}

