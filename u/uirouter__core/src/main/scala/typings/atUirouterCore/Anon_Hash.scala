package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: js.Any
  var path: js.Any
  var search: js.Any
  var url: String
}

object Anon_Hash {
  @scala.inline
  def apply(hash: js.Any, path: js.Any, search: js.Any, url: String): Anon_Hash = {
    val __obj = js.Dynamic.literal(hash = hash, path = path, search = search, url = url)
  
    __obj.asInstanceOf[Anon_Hash]
  }
}

