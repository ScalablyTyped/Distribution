package typings.xmlrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pass extends js.Object {
  var pass: String
  var user: String
}

object Anon_Pass {
  @scala.inline
  def apply(pass: String, user: String): Anon_Pass = {
    val __obj = js.Dynamic.literal(pass = pass, user = user)
  
    __obj.asInstanceOf[Anon_Pass]
  }
}

