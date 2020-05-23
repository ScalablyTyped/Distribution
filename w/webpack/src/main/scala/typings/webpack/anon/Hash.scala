package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  var hash: js.Any
  var id: js.Any
}

object Hash {
  @scala.inline
  def apply(hash: js.Any, id: js.Any): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
}

