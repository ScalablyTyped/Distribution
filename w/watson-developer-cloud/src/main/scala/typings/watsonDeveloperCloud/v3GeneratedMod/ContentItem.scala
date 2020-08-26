package typings.watsonDeveloperCloud.v3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ContentItem. */
@js.native
trait ContentItem extends js.Object {
  /** The content that is to be analyzed. The service supports up to 20 MB of content for all `ContentItem` objects combined. */
  var content: String = js.native
  /** The MIME type of the content. The default is plain text. The tags are stripped from HTML content before it is analyzed; plain text is processed as submitted. */
  var contenttype: js.UndefOr[String] = js.native
  /** A timestamp that identifies when this content was created. Specify a value in milliseconds since the UNIX Epoch (January 1, 1970, at 0:00 UTC). Required only for results that include temporal behavior data. */
  var created: js.UndefOr[Double] = js.native
  /** Indicates whether this content item is a forwarded/copied version of another content item. */
  var forward: js.UndefOr[Boolean] = js.native
  /** A unique identifier for this content item. */
  var id: js.UndefOr[String] = js.native
  /** The language identifier (two-letter ISO 639-1 identifier) for the language of the content item. The default is `en` (English). Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. A language specified with the **Content-Type** parameter overrides the value of this parameter; any content items that specify a different language are ignored. Omit the **Content-Type** parameter to base the language on the most prevalent specification among the content items; again, content items that specify a different language are ignored. You can specify any combination of languages for the input and response content. */
  var language: js.UndefOr[String] = js.native
  /** The unique ID of the parent content item for this item. Used to identify hierarchical relationships between posts/replies, messages/replies, and so on. */
  var parentid: js.UndefOr[String] = js.native
  /** Indicates whether this content item is a reply to another content item. */
  var reply: js.UndefOr[Boolean] = js.native
  /** A timestamp that identifies when this content was last updated. Specify a value in milliseconds since the UNIX Epoch (January 1, 1970, at 0:00 UTC). Required only for results that include temporal behavior data. */
  var updated: js.UndefOr[Double] = js.native
}

object ContentItem {
  @scala.inline
  def apply(content: String): ContentItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentItem]
  }
  @scala.inline
  implicit class ContentItemOps[Self <: ContentItem] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContenttype(value: String): Self = this.set("contenttype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContenttype: Self = this.set("contenttype", js.undefined)
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setForward(value: Boolean): Self = this.set("forward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setParentid(value: String): Self = this.set("parentid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentid: Self = this.set("parentid", js.undefined)
    @scala.inline
    def setReply(value: Boolean): Self = this.set("reply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReply: Self = this.set("reply", js.undefined)
    @scala.inline
    def setUpdated(value: Double): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

