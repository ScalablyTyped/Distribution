package typings
package twilioDashChatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identity extends js.Object {
  var identity: java.lang.String
  var user: java.lang.String
}

object Anon_Identity {
  @scala.inline
  def apply(identity: java.lang.String, user: java.lang.String): Anon_Identity = {
    val __obj = js.Dynamic.literal(identity = identity, user = user)
  
    __obj.asInstanceOf[Anon_Identity]
  }
}

