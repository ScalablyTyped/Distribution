package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  var hash: js.Any
  var path: js.Any
  var search: js.Any
  var url: String
}

object Hash {
  @scala.inline
  def apply(hash: js.Any, path: js.Any, search: js.Any, url: String): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
}

