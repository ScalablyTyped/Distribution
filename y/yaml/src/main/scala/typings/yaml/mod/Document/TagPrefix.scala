package typings.yaml.mod.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagPrefix extends js.Object {
  var handle: String
  var prefix: String
}

object TagPrefix {
  @scala.inline
  def apply(handle: String, prefix: String): TagPrefix = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagPrefix]
  }
}

