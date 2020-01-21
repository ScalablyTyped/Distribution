package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostOrPage
  extends Identification
     with Excerpt
     with CodeInjection
     with Metadata
     with Facebook
     with Twitter
     with GhostData {
  // Authors - Only shown when using Include Param
  var authors: js.UndefOr[js.Array[Author]] = js.undefined
  var canonical_url: js.UndefOr[Nullable[String]] = js.undefined
  var comment_id: js.UndefOr[String] = js.undefined
  // Dates
  var created_at: js.UndefOr[String] = js.undefined
  // Custom Template for posts and pages
  var custom_template: js.UndefOr[String | Null] = js.undefined
  // Image
  var feature_image: js.UndefOr[String | Null] = js.undefined
  var featured: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[String | Null] = js.undefined
  // Post or Page
  var page: js.UndefOr[Boolean] = js.undefined
  var plaintext: js.UndefOr[Nullable[String]] = js.undefined
  var primary_author: js.UndefOr[Nullable[Author]] = js.undefined
  var primary_tag: js.UndefOr[Nullable[Tag]] = js.undefined
  var published_at: js.UndefOr[Nullable[String]] = js.undefined
  // Tags - Only shown when using Include param
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  // Post or Page
  var title: js.UndefOr[String] = js.undefined
  var updated_at: js.UndefOr[Nullable[String]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  // Identification
  var uuid: js.UndefOr[String] = js.undefined
}

object PostOrPage {
  @scala.inline
  def apply(
    id: String,
    slug: String,
    authors: js.Array[Author] = null,
    canonical_url: Nullable[String] = null,
    codeinjection_foot: Nullable[String] = null,
    codeinjection_head: Nullable[String] = null,
    comment_id: String = null,
    created_at: String = null,
    custom_excerpt: String = null,
    custom_template: String = null,
    excerpt: String = null,
    feature_image: String = null,
    featured: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    meta_description: Nullable[String] = null,
    meta_title: Nullable[String] = null,
    og_description: Nullable[String] = null,
    og_image: Nullable[String] = null,
    og_title: Nullable[String] = null,
    page: js.UndefOr[Boolean] = js.undefined,
    plaintext: Nullable[String] = null,
    primary_author: Nullable[Author] = null,
    primary_tag: Nullable[Tag] = null,
    published_at: Nullable[String] = null,
    tags: js.Array[Tag] = null,
    title: String = null,
    twitter_description: Nullable[String] = null,
    twitter_image: Nullable[String] = null,
    twitter_title: Nullable[String] = null,
    updated_at: Nullable[String] = null,
    url: String = null,
    uuid: String = null
  ): PostOrPage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (authors != null) __obj.updateDynamic("authors")(authors.asInstanceOf[js.Any])
    if (canonical_url != null) __obj.updateDynamic("canonical_url")(canonical_url.asInstanceOf[js.Any])
    if (codeinjection_foot != null) __obj.updateDynamic("codeinjection_foot")(codeinjection_foot.asInstanceOf[js.Any])
    if (codeinjection_head != null) __obj.updateDynamic("codeinjection_head")(codeinjection_head.asInstanceOf[js.Any])
    if (comment_id != null) __obj.updateDynamic("comment_id")(comment_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (custom_excerpt != null) __obj.updateDynamic("custom_excerpt")(custom_excerpt.asInstanceOf[js.Any])
    if (custom_template != null) __obj.updateDynamic("custom_template")(custom_template.asInstanceOf[js.Any])
    if (excerpt != null) __obj.updateDynamic("excerpt")(excerpt.asInstanceOf[js.Any])
    if (feature_image != null) __obj.updateDynamic("feature_image")(feature_image.asInstanceOf[js.Any])
    if (!js.isUndefined(featured)) __obj.updateDynamic("featured")(featured.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (meta_description != null) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (meta_title != null) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (og_description != null) __obj.updateDynamic("og_description")(og_description.asInstanceOf[js.Any])
    if (og_image != null) __obj.updateDynamic("og_image")(og_image.asInstanceOf[js.Any])
    if (og_title != null) __obj.updateDynamic("og_title")(og_title.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    if (primary_author != null) __obj.updateDynamic("primary_author")(primary_author.asInstanceOf[js.Any])
    if (primary_tag != null) __obj.updateDynamic("primary_tag")(primary_tag.asInstanceOf[js.Any])
    if (published_at != null) __obj.updateDynamic("published_at")(published_at.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (twitter_description != null) __obj.updateDynamic("twitter_description")(twitter_description.asInstanceOf[js.Any])
    if (twitter_image != null) __obj.updateDynamic("twitter_image")(twitter_image.asInstanceOf[js.Any])
    if (twitter_title != null) __obj.updateDynamic("twitter_title")(twitter_title.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostOrPage]
  }
}

