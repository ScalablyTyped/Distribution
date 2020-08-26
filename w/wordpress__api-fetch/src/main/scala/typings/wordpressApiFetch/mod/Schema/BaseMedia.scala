package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
import typings.wordpressApiFetch.anon.Height
import typings.wordpressApiFetch.wordpressApiFetchStrings.file
import typings.wordpressApiFetch.wordpressApiFetchStrings.image
import typings.wordpressApiFetch.wordpressApiFetchStrings.inherit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMedia[T /* <: Context */] extends BaseResponse {
  var alt_text: String = js.native
  var author: Double = js.native
  var caption: Contextual[T, js.Object, js.Object] = js.native
  var comment_status: OpenOrClosed = js.native
  var date: String = js.native
  var date_gmt: String = js.native
  var description: Contextual[T, js.Object, js.Object] = js.native
  var generated_slug: String = js.native
  var guid: Contextual[T, js.Object, js.Object] = js.native
  var id: Double = js.native
  var link: String = js.native
  var media_details: Height = js.native
  var media_type: file | image = js.native
  var meta: js.Array[_] = js.native
  var mime_type: String = js.native
  var modified: String = js.native
  var modified_gmt: String = js.native
  var permalink_template: String = js.native
  var ping_status: OpenOrClosed = js.native
  var post: Double | Null = js.native
  var slug: String = js.native
  var source_url: String = js.native
  var status: PostStatus | inherit = js.native
  var template: String = js.native
  var title: Contextual[T, js.Object, js.Object] = js.native
  var `type`: String = js.native
}

object BaseMedia {
  @scala.inline
  def apply[/* <: typings.wordpressApiFetch.mod.Schema.Context */ T](
    _links: Record[String, js.Array[Dictk]],
    alt_text: String,
    author: Double,
    caption: Contextual[T, js.Object, js.Object],
    comment_status: OpenOrClosed,
    date: String,
    date_gmt: String,
    description: Contextual[T, js.Object, js.Object],
    generated_slug: String,
    guid: Contextual[T, js.Object, js.Object],
    id: Double,
    link: String,
    media_details: Height,
    media_type: file | image,
    meta: js.Array[_],
    mime_type: String,
    modified: String,
    modified_gmt: String,
    permalink_template: String,
    ping_status: OpenOrClosed,
    slug: String,
    source_url: String,
    status: PostStatus | inherit,
    template: String,
    title: Contextual[T, js.Object, js.Object],
    `type`: String
  ): BaseMedia[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], alt_text = alt_text.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], comment_status = comment_status.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], generated_slug = generated_slug.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], media_details = media_details.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modified_gmt = modified_gmt.asInstanceOf[js.Any], permalink_template = permalink_template.asInstanceOf[js.Any], ping_status = ping_status.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source_url = source_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMedia[T]]
  }
  @scala.inline
  implicit class BaseMediaOps[Self <: BaseMedia[_], /* <: typings.wordpressApiFetch.mod.Schema.Context */ T] (val x: Self with BaseMedia[T]) extends AnyVal {
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
    def setAlt_text(value: String): Self = this.set("alt_text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: Double): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: Contextual[T, js.Object, js.Object]): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment_status(value: OpenOrClosed): Self = this.set("comment_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate_gmt(value: String): Self = this.set("date_gmt", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Contextual[T, js.Object, js.Object]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerated_slug(value: String): Self = this.set("generated_slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuid(value: Contextual[T, js.Object, js.Object]): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia_details(value: Height): Self = this.set("media_details", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia_type(value: file | image): Self = this.set("media_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaVarargs(value: js.Any*): Self = this.set("meta", js.Array(value :_*))
    @scala.inline
    def setMeta(value: js.Array[_]): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setMime_type(value: String): Self = this.set("mime_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified_gmt(value: String): Self = this.set("modified_gmt", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermalink_template(value: String): Self = this.set("permalink_template", value.asInstanceOf[js.Any])
    @scala.inline
    def setPing_status(value: OpenOrClosed): Self = this.set("ping_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource_url(value: String): Self = this.set("source_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PostStatus | inherit): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: Contextual[T, js.Object, js.Object]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPost(value: Double): Self = this.set("post", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostNull: Self = this.set("post", null)
  }
  
}

