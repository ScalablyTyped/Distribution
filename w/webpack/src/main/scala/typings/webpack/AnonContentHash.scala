package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentHash extends js.Object {
  var contentHash: js.Any
  var hash: js.Any
  var name: js.Any
}

object AnonContentHash {
  @scala.inline
  def apply(contentHash: js.Any, hash: js.Any, name: js.Any): AnonContentHash = {
    val __obj = js.Dynamic.literal(contentHash = contentHash.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentHash]
  }
}

