package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentHash extends js.Object {
  var contentHash: js.Any
  var hash: js.Any
  var name: js.Any
}

object ContentHash {
  @scala.inline
  def apply(contentHash: js.Any, hash: js.Any, name: js.Any): ContentHash = {
    val __obj = js.Dynamic.literal(contentHash = contentHash.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentHash]
  }
}

