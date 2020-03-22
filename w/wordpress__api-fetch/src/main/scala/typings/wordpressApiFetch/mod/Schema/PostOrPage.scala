package typings.wordpressApiFetch.mod.Schema

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wordpressApiFetch.AnonBlockversion
import typings.wordpressApiFetch.AnonDictk
import typings.wordpressApiFetch.AnonProtected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Inlined T extends 'embed' ? std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<T>, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.Post> & std.Partial<std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePage<T>, @wordpress/api-fetch.@wordpress/api-fetch.Schema.EmbedKeys.Page>> : T extends 'view' ? std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<T>, @wordpress/api-fetch.@wordpress/api-fetch.Schema.ViewKeys.Post> & std.Partial<std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePage<T>, @wordpress/api-fetch.@wordpress/api-fetch.Schema.ViewKeys.Page>> : @wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePost<T> & std.Partial<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BasePage<T>> */
trait PostOrPage[T /* <: Context */]
  extends /* k */ StringDictionary[js.Any] {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  var _links: js.UndefOr[Record[String, js.Array[AnonDictk]]] = js.undefined
  var author: js.UndefOr[Double] = js.undefined
  var categories: js.Array[Double]
  var comment_status: js.UndefOr[OpenOrClosed] = js.undefined
  var content: js.UndefOr[Contextual[T, AnonProtected, AnonBlockversion]] = js.undefined
  var date: js.UndefOr[String] = js.undefined
  var date_gmt: js.UndefOr[String] = js.undefined
  var excerpt: js.UndefOr[Contextual[T, AnonProtected, js.Object]] = js.undefined
  var featured_media: js.UndefOr[Double] = js.undefined
  var format: PostFormat
  var generated_slug: js.UndefOr[String] = js.undefined
  var guid: js.UndefOr[Contextual[T, js.Object, js.Object]] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var menu_order: js.UndefOr[Double] = js.undefined
  var meta: js.UndefOr[js.Array[_]] = js.undefined
  var modified: js.UndefOr[String] = js.undefined
  var modified_gmt: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Double] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var permalink_template: js.UndefOr[String] = js.undefined
  var ping_status: js.UndefOr[OpenOrClosed] = js.undefined
  var slug: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[PostStatus] = js.undefined
  var sticky: Boolean
  var tags: js.Array[String]
  var template: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[Contextual[T, js.Object, js.Object]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PostOrPage {
  @scala.inline
  def apply[T /* <: Context */](
    categories: js.Array[Double],
    format: PostFormat,
    sticky: Boolean,
    tags: js.Array[String],
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    _embedded: Record[String, js.Array[_]] = null,
    _links: Record[String, js.Array[AnonDictk]] = null,
    author: Int | Double = null,
    comment_status: OpenOrClosed = null,
    content: Contextual[T, AnonProtected, AnonBlockversion] = null,
    date: String = null,
    date_gmt: String = null,
    excerpt: Contextual[T, AnonProtected, js.Object] = null,
    featured_media: Int | Double = null,
    generated_slug: String = null,
    guid: Contextual[T, js.Object, js.Object] = null,
    id: Int | Double = null,
    link: String = null,
    menu_order: Int | Double = null,
    meta: js.Array[_] = null,
    modified: String = null,
    modified_gmt: String = null,
    parent: Int | Double = null,
    password: String = null,
    permalink_template: String = null,
    ping_status: OpenOrClosed = null,
    slug: String = null,
    status: PostStatus = null,
    template: String = null,
    title: Contextual[T, js.Object, js.Object] = null,
    `type`: String = null
  ): PostOrPage[T] = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    if (_links != null) __obj.updateDynamic("_links")(_links.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (comment_status != null) __obj.updateDynamic("comment_status")(comment_status.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (date_gmt != null) __obj.updateDynamic("date_gmt")(date_gmt.asInstanceOf[js.Any])
    if (excerpt != null) __obj.updateDynamic("excerpt")(excerpt.asInstanceOf[js.Any])
    if (featured_media != null) __obj.updateDynamic("featured_media")(featured_media.asInstanceOf[js.Any])
    if (generated_slug != null) __obj.updateDynamic("generated_slug")(generated_slug.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (menu_order != null) __obj.updateDynamic("menu_order")(menu_order.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (modified_gmt != null) __obj.updateDynamic("modified_gmt")(modified_gmt.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (permalink_template != null) __obj.updateDynamic("permalink_template")(permalink_template.asInstanceOf[js.Any])
    if (ping_status != null) __obj.updateDynamic("ping_status")(ping_status.asInstanceOf[js.Any])
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostOrPage[T]]
  }
}

