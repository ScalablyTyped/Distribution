package typings.watsonDeveloperCloud.v3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ContentItem. */
trait ContentItem extends js.Object {
  /** The content that is to be analyzed. The service supports up to 20 MB of content for all `ContentItem` objects combined. */
  var content: String
  /** The MIME type of the content. The default is plain text. The tags are stripped from HTML content before it is analyzed; plain text is processed as submitted. */
  var contenttype: js.UndefOr[String] = js.undefined
  /** A timestamp that identifies when this content was created. Specify a value in milliseconds since the UNIX Epoch (January 1, 1970, at 0:00 UTC). Required only for results that include temporal behavior data. */
  var created: js.UndefOr[Double] = js.undefined
  /** Indicates whether this content item is a forwarded/copied version of another content item. */
  var forward: js.UndefOr[Boolean] = js.undefined
  /** A unique identifier for this content item. */
  var id: js.UndefOr[String] = js.undefined
  /** The language identifier (two-letter ISO 639-1 identifier) for the language of the content item. The default is `en` (English). Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. A language specified with the **Content-Type** parameter overrides the value of this parameter; any content items that specify a different language are ignored. Omit the **Content-Type** parameter to base the language on the most prevalent specification among the content items; again, content items that specify a different language are ignored. You can specify any combination of languages for the input and response content. */
  var language: js.UndefOr[String] = js.undefined
  /** The unique ID of the parent content item for this item. Used to identify hierarchical relationships between posts/replies, messages/replies, and so on. */
  var parentid: js.UndefOr[String] = js.undefined
  /** Indicates whether this content item is a reply to another content item. */
  var reply: js.UndefOr[Boolean] = js.undefined
  /** A timestamp that identifies when this content was last updated. Specify a value in milliseconds since the UNIX Epoch (January 1, 1970, at 0:00 UTC). Required only for results that include temporal behavior data. */
  var updated: js.UndefOr[Double] = js.undefined
}

object ContentItem {
  @scala.inline
  def apply(
    content: String,
    contenttype: String = null,
    created: js.UndefOr[Double] = js.undefined,
    forward: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    language: String = null,
    parentid: String = null,
    reply: js.UndefOr[Boolean] = js.undefined,
    updated: js.UndefOr[Double] = js.undefined
  ): ContentItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (contenttype != null) __obj.updateDynamic("contenttype")(contenttype.asInstanceOf[js.Any])
    if (!js.isUndefined(created)) __obj.updateDynamic("created")(created.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forward)) __obj.updateDynamic("forward")(forward.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (parentid != null) __obj.updateDynamic("parentid")(parentid.asInstanceOf[js.Any])
    if (!js.isUndefined(reply)) __obj.updateDynamic("reply")(reply.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updated)) __obj.updateDynamic("updated")(updated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentItem]
  }
}

