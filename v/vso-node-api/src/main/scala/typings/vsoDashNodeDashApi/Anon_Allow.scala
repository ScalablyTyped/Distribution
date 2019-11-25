package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allow extends js.Object {
  var allow: Double
  var completed: Double
  var disallow: Double
}

object Anon_Allow {
  @scala.inline
  def apply(allow: Double, completed: Double, disallow: Double): Anon_Allow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disallow = disallow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Allow]
  }
}

