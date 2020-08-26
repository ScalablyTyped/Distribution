package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  var hash: js.Any = js.native
  var path: js.Any = js.native
  var search: js.Any = js.native
  var url: String = js.native
}

object Hash {
  @scala.inline
  def apply(hash: js.Any, path: js.Any, search: js.Any, url: String): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  @scala.inline
  implicit class HashOps[Self <: Hash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHash(value: js.Any): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: js.Any): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: js.Any): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

