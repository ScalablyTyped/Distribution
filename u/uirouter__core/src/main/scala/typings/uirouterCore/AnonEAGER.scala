package typings.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEAGER extends js.Object {
  var EAGER: String
  var LAZY: String
}

object AnonEAGER {
  @scala.inline
  def apply(EAGER: String, LAZY: String): AnonEAGER = {
    val __obj = js.Dynamic.literal(EAGER = EAGER.asInstanceOf[js.Any], LAZY = LAZY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEAGER]
  }
}

