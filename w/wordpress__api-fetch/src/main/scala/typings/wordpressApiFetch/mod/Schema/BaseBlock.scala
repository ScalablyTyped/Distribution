package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Blockversion
import typings.wordpressApiFetch.anon.Dictk
import typings.wordpressApiFetch.anon.ProtectedRaw
import typings.wordpressApiFetch.anon.RawString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseBlock[T /* <: Context */] extends BaseResponse {
  var content: ProtectedRaw with (js.Object | Blockversion) = js.native
  var date: String = js.native
  var date_gmt: String = js.native
  var guid: Contextual[T, js.Object, js.Object] = js.native
  var id: Double = js.native
  var link: String = js.native
  var modified: String = js.native
  var modified_gmt: String = js.native
  var password: String = js.native
  var slug: String = js.native
  var status: PostStatus = js.native
  var template: String = js.native
  var title: RawString | js.Array[js.Any] = js.native
  var `type`: String = js.native
}

object BaseBlock {
  @scala.inline
  def apply[/* <: typings.wordpressApiFetch.mod.Schema.Context */ T](
    _links: Record[String, js.Array[Dictk]],
    content: ProtectedRaw with (js.Object | Blockversion),
    date: String,
    date_gmt: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    modified: String,
    modified_gmt: String,
    password: String,
    slug: String,
    status: PostStatus,
    template: String,
    title: RawString | js.Array[js.Any],
    `type`: String
  ): BaseBlock[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBlock[T]]
  }
  @scala.inline
  implicit class BaseBlockOps[Self <: BaseBlock[_], /* <: typings.wordpressApiFetch.mod.Schema.Context */ T] (val x: Self with BaseBlock[T]) extends AnyVal {
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
    def setContent(value: ProtectedRaw with (js.Object | Blockversion)): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate_gmt(value: String): Self = this.set("date_gmt", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuid(value: Contextual[T, js.Object, js.Object]): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified_gmt(value: String): Self = this.set("modified_gmt", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PostStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleVarargs(value: js.Any*): Self = this.set("title", js.Array(value :_*))
    @scala.inline
    def setTitle(value: RawString | js.Array[js.Any]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

