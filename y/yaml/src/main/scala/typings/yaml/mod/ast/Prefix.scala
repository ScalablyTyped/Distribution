package typings.yaml.mod.ast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefix extends js.Object {
  var handle: String
  var prefix: String
}

object Prefix {
  @scala.inline
  def apply(handle: String, prefix: String): Prefix = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Prefix]
  }
}

