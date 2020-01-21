package typings.urlparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends js.Object {
  var base: String
  var hash: String
  var name: String
}

object AnonBase {
  @scala.inline
  def apply(base: String, hash: String, name: String): AnonBase = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase]
  }
}

