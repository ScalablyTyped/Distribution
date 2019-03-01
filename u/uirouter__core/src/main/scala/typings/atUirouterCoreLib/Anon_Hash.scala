package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: js.Any
  var path: js.Any
  var search: js.Any
  var url: java.lang.String
}

object Anon_Hash {
  @scala.inline
  def apply(hash: js.Any, path: js.Any, search: js.Any, url: java.lang.String): Anon_Hash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Hash]
  }
}

