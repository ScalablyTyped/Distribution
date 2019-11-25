package typings.yaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handle extends js.Object {
  var handle: String
  var suffix: String
}

object Anon_Handle {
  @scala.inline
  def apply(handle: String, suffix: String): Anon_Handle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Handle]
  }
}

