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
  var custom_template: js.UndefOr[Nullable[String]] = js.undefined
  // Image
  var feature_image: js.UndefOr[Nullable[String]] = js.undefined
  var featured: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[Nullable[String]] = js.undefined
  // Post or Page
  var page: js.UndefOr[Boolean] = js.undefined
  var plaintext: js.UndefOr[Nullable[String]] = js.undefined
  var primary_author: js.UndefOr[Nullable[Author]] = js.undefined
  var primary_tag: js.UndefOr[Nullable[Tag]] = js.undefined
  var published_at: js.UndefOr[Nullable[String]] = js.undefined
  // Reading time
  var reading_time: js.UndefOr[Double] = js.undefined
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
    canonical_url: js.UndefOr[Null | Nullable[String]] = js.undefined,
    codeinjection_foot: js.UndefOr[Null | Nullable[String]] = js.undefined,
    codeinjection_head: js.UndefOr[Null | Nullable[String]] = js.undefined,
    comment_id: String = null,
    created_at: String = null,
    custom_excerpt: String = null,
    custom_template: js.UndefOr[Null | Nullable[String]] = js.undefined,
    excerpt: String = null,
    feature_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    featured: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Null | Nullable[String]] = js.undefined,
    meta_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    meta_title: js.UndefOr[Null | Nullable[String]] = js.undefined,
    og_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    og_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    og_title: js.UndefOr[Null | Nullable[String]] = js.undefined,
    page: js.UndefOr[Boolean] = js.undefined,
    plaintext: js.UndefOr[Null | Nullable[String]] = js.undefined,
    primary_author: js.UndefOr[Null | Nullable[Author]] = js.undefined,
    primary_tag: js.UndefOr[Null | Nullable[Tag]] = js.undefined,
    published_at: js.UndefOr[Null | Nullable[String]] = js.undefined,
    reading_time: js.UndefOr[Double] = js.undefined,
    tags: js.Array[Tag] = null,
    title: String = null,
    twitter_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    twitter_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    twitter_title: js.UndefOr[Null | Nullable[String]] = js.undefined,
    updated_at: js.UndefOr[Null | Nullable[String]] = js.undefined,
    url: String = null,
    uuid: String = null
  ): PostOrPage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (authors != null) __obj.updateDynamic("authors")(authors.asInstanceOf[js.Any])
    if (!js.isUndefined(canonical_url)) __obj.updateDynamic("canonical_url")(canonical_url.asInstanceOf[js.Any])
    if (!js.isUndefined(codeinjection_foot)) __obj.updateDynamic("codeinjection_foot")(codeinjection_foot.asInstanceOf[js.Any])
    if (!js.isUndefined(codeinjection_head)) __obj.updateDynamic("codeinjection_head")(codeinjection_head.asInstanceOf[js.Any])
    if (comment_id != null) __obj.updateDynamic("comment_id")(comment_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (custom_excerpt != null) __obj.updateDynamic("custom_excerpt")(custom_excerpt.asInstanceOf[js.Any])
    if (!js.isUndefined(custom_template)) __obj.updateDynamic("custom_template")(custom_template.asInstanceOf[js.Any])
    if (excerpt != null) __obj.updateDynamic("excerpt")(excerpt.asInstanceOf[js.Any])
    if (!js.isUndefined(feature_image)) __obj.updateDynamic("feature_image")(feature_image.asInstanceOf[js.Any])
    if (!js.isUndefined(featured)) __obj.updateDynamic("featured")(featured.get.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_description)) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_title)) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (!js.isUndefined(og_description)) __obj.updateDynamic("og_description")(og_description.asInstanceOf[js.Any])
    if (!js.isUndefined(og_image)) __obj.updateDynamic("og_image")(og_image.asInstanceOf[js.Any])
    if (!js.isUndefined(og_title)) __obj.updateDynamic("og_title")(og_title.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plaintext)) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    if (!js.isUndefined(primary_author)) __obj.updateDynamic("primary_author")(primary_author.asInstanceOf[js.Any])
    if (!js.isUndefined(primary_tag)) __obj.updateDynamic("primary_tag")(primary_tag.asInstanceOf[js.Any])
    if (!js.isUndefined(published_at)) __obj.updateDynamic("published_at")(published_at.asInstanceOf[js.Any])
    if (!js.isUndefined(reading_time)) __obj.updateDynamic("reading_time")(reading_time.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_description)) __obj.updateDynamic("twitter_description")(twitter_description.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_image)) __obj.updateDynamic("twitter_image")(twitter_image.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_title)) __obj.updateDynamic("twitter_title")(twitter_title.asInstanceOf[js.Any])
    if (!js.isUndefined(updated_at)) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostOrPage]
  }
}

