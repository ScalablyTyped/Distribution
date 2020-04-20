package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHash extends js.Object {
  var hash: js.Any
  var id: js.Any
}

object AnonHash {
  @scala.inline
  def apply(hash: js.Any, id: js.Any): AnonHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHash]
  }
}

