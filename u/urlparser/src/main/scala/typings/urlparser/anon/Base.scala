package typings.urlparser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var base: String
  var hash: String
  var name: String
}

object Base {
  @scala.inline
  def apply(base: String, hash: String, name: String): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

