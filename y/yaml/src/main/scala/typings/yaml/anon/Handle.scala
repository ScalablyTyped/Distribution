package typings.yaml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handle extends js.Object {
  var handle: String
  var suffix: String
}

object Handle {
  @scala.inline
  def apply(handle: String, suffix: String): Handle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
}

