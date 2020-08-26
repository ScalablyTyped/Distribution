package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseStatus
  extends BaseResponse
     with Status[js.Any] {
  var name: String = js.native
  var `private`: Boolean = js.native
  var `protected`: Boolean = js.native
  var public: Boolean = js.native
  var queryable: Boolean = js.native
  var show_in_list: Boolean = js.native
  var slug: String = js.native
}

object BaseStatus {
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Dictk]],
    name: String,
    `private`: Boolean,
    `protected`: Boolean,
    public: Boolean,
    queryable: Boolean,
    show_in_list: Boolean,
    slug: String
  ): BaseStatus = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], show_in_list = show_in_list.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseStatus]
  }
  @scala.inline
  implicit class BaseStatusOps[Self <: BaseStatus] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtected(value: Boolean): Self = this.set("protected", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryable(value: Boolean): Self = this.set("queryable", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow_in_list(value: Boolean): Self = this.set("show_in_list", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
  }
  
}

