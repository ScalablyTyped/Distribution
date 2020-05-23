package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EAGER extends js.Object {
  var EAGER: String
  var LAZY: String
}

object EAGER {
  @scala.inline
  def apply(EAGER: String, LAZY: String): EAGER = {
    val __obj = js.Dynamic.literal(EAGER = EAGER.asInstanceOf[js.Any], LAZY = LAZY.asInstanceOf[js.Any])
    __obj.asInstanceOf[EAGER]
  }
}

