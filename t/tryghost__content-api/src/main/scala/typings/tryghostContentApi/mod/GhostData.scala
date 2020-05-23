package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Label
import typings.tryghostContentApi.anon.Posts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tryghostContentApi.mod.PostOrPage
  - typings.tryghostContentApi.mod.Author
  - typings.tryghostContentApi.mod.Tag
  - typings.tryghostContentApi.mod.Settings
*/
trait GhostData extends js.Object

object GhostData {
  @scala.inline
  def PostOrPage(
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
  ): GhostData = {
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
    __obj.asInstanceOf[GhostData]
  }
  @scala.inline
  def Author(
    id: String,
    slug: String,
    bio: js.UndefOr[Null | Nullable[String]] = js.undefined,
    count: Posts = null,
    cover_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    facebook: js.UndefOr[Null | Nullable[String]] = js.undefined,
    location: js.UndefOr[Null | Nullable[String]] = js.undefined,
    meta_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    meta_title: js.UndefOr[Null | Nullable[String]] = js.undefined,
    name: String = null,
    profile_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    twitter: js.UndefOr[Null | Nullable[String]] = js.undefined,
    url: js.UndefOr[Null | Nullable[String]] = js.undefined,
    website: js.UndefOr[Null | Nullable[String]] = js.undefined
  ): GhostData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (!js.isUndefined(bio)) __obj.updateDynamic("bio")(bio.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(cover_image)) __obj.updateDynamic("cover_image")(cover_image.asInstanceOf[js.Any])
    if (!js.isUndefined(facebook)) __obj.updateDynamic("facebook")(facebook.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_description)) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_title)) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(profile_image)) __obj.updateDynamic("profile_image")(profile_image.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter)) __obj.updateDynamic("twitter")(twitter.asInstanceOf[js.Any])
    if (!js.isUndefined(url)) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(website)) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
  @scala.inline
  def Tag(
    id: String,
    slug: String,
    count: Posts = null,
    description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    feature_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    meta_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    meta_title: js.UndefOr[Null | Nullable[String]] = js.undefined,
    name: String = null,
    url: String = null,
    visibility: TagVisibility = null
  ): GhostData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(feature_image)) __obj.updateDynamic("feature_image")(feature_image.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_description)) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_title)) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
  @scala.inline
  def Settings(
    codeinjection_foot: js.UndefOr[Null | Nullable[String]] = js.undefined,
    codeinjection_head: js.UndefOr[Null | Nullable[String]] = js.undefined,
    cover_image: String = null,
    description: String = null,
    facebook: String = null,
    ghost_foot: js.UndefOr[Null | Nullable[String]] = js.undefined,
    ghost_head: js.UndefOr[Null | Nullable[String]] = js.undefined,
    icon: String = null,
    lang: String = null,
    logo: String = null,
    meta_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    meta_title: js.UndefOr[Null | Nullable[String]] = js.undefined,
    navigation: js.Array[Label] = null,
    og_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    og_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    og_title: js.UndefOr[Null | Nullable[String]] = js.undefined,
    timezone: String = null,
    title: String = null,
    twitter: String = null,
    twitter_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    twitter_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    twitter_title: js.UndefOr[Null | Nullable[String]] = js.undefined,
    url: String = null
  ): GhostData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(codeinjection_foot)) __obj.updateDynamic("codeinjection_foot")(codeinjection_foot.asInstanceOf[js.Any])
    if (!js.isUndefined(codeinjection_head)) __obj.updateDynamic("codeinjection_head")(codeinjection_head.asInstanceOf[js.Any])
    if (cover_image != null) __obj.updateDynamic("cover_image")(cover_image.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (facebook != null) __obj.updateDynamic("facebook")(facebook.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost_foot)) __obj.updateDynamic("ghost_foot")(ghost_foot.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost_head)) __obj.updateDynamic("ghost_head")(ghost_head.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_description)) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_title)) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (!js.isUndefined(og_description)) __obj.updateDynamic("og_description")(og_description.asInstanceOf[js.Any])
    if (!js.isUndefined(og_image)) __obj.updateDynamic("og_image")(og_image.asInstanceOf[js.Any])
    if (!js.isUndefined(og_title)) __obj.updateDynamic("og_title")(og_title.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (twitter != null) __obj.updateDynamic("twitter")(twitter.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_description)) __obj.updateDynamic("twitter_description")(twitter_description.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_image)) __obj.updateDynamic("twitter_image")(twitter_image.asInstanceOf[js.Any])
    if (!js.isUndefined(twitter_title)) __obj.updateDynamic("twitter_title")(twitter_title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
}

