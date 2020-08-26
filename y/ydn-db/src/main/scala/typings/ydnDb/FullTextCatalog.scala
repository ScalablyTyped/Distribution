package typings.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullTextCatalog extends js.Object {
  var lang: String = js.native
  var name: String = js.native
  var sources: js.Array[FullTextSource] = js.native
}

object FullTextCatalog {
  @scala.inline
  def apply(lang: String, name: String, sources: js.Array[FullTextSource]): FullTextCatalog = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTextCatalog]
  }
  @scala.inline
  implicit class FullTextCatalogOps[Self <: FullTextCatalog] (val x: Self) extends AnyVal {
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
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: FullTextSource*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[FullTextSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
  }
  
}

