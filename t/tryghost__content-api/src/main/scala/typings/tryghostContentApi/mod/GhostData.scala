package typings.tryghostContentApi.mod

import typings.tryghostContentApi.AnonLabel
import typings.tryghostContentApi.AnonPosts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tryghostContentApi.mod.PostOrPage
  - typings.tryghostContentApi.mod.Author
  - typings.tryghostContentApi.mod.Tag
  - typings.tryghostContentApi.mod.Setting
*/
trait GhostData extends js.Object

object GhostData {
  @scala.inline
  def PostOrPage(
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
  ): GhostData = {
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
    __obj.asInstanceOf[GhostData]
  }
  @scala.inline
  def Author(
    id: String,
    slug: String,
    bio: Nullable[String] = null,
    count: AnonPosts = null,
    cover_image: Nullable[String] = null,
    facebook: Nullable[String] = null,
    location: Nullable[String] = null,
    meta_description: Nullable[String] = null,
    meta_title: Nullable[String] = null,
    name: String = null,
    profile_image: Nullable[String] = null,
    twitter: Nullable[String] = null,
    url: Nullable[String] = null,
    website: Nullable[String] = null
  ): GhostData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (bio != null) __obj.updateDynamic("bio")(bio.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (cover_image != null) __obj.updateDynamic("cover_image")(cover_image.asInstanceOf[js.Any])
    if (facebook != null) __obj.updateDynamic("facebook")(facebook.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta_description != null) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (meta_title != null) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profile_image != null) __obj.updateDynamic("profile_image")(profile_image.asInstanceOf[js.Any])
    if (twitter != null) __obj.updateDynamic("twitter")(twitter.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
  @scala.inline
  def Tag(
    id: String,
    slug: String,
    count: AnonPosts = null,
    description: Nullable[String] = null,
    feature_image: Nullable[String] = null,
    meta_description: Nullable[String] = null,
    meta_title: Nullable[String] = null,
    name: String = null,
    url: String = null,
    visibility: TagVisibility = null
  ): GhostData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (feature_image != null) __obj.updateDynamic("feature_image")(feature_image.asInstanceOf[js.Any])
    if (meta_description != null) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (meta_title != null) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
  @scala.inline
  def Setting(
    codeinjection_foot: Nullable[String] = null,
    codeinjection_head: Nullable[String] = null,
    cover_image: String = null,
    description: String = null,
    facebook: String = null,
    ghost_foot: Nullable[String] = null,
    ghost_head: Nullable[String] = null,
    icon: String = null,
    lang: String = null,
    logo: String = null,
    meta_description: Nullable[String] = null,
    meta_title: Nullable[String] = null,
    navigation: js.Array[AnonLabel] = null,
    og_description: Nullable[String] = null,
    og_image: Nullable[String] = null,
    og_title: Nullable[String] = null,
    timezone: String = null,
    title: String = null,
    twitter: String = null,
    twitter_description: Nullable[String] = null,
    twitter_image: Nullable[String] = null,
    twitter_title: Nullable[String] = null,
    url: String = null
  ): GhostData = {
    val __obj = js.Dynamic.literal()
    if (codeinjection_foot != null) __obj.updateDynamic("codeinjection_foot")(codeinjection_foot.asInstanceOf[js.Any])
    if (codeinjection_head != null) __obj.updateDynamic("codeinjection_head")(codeinjection_head.asInstanceOf[js.Any])
    if (cover_image != null) __obj.updateDynamic("cover_image")(cover_image.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (facebook != null) __obj.updateDynamic("facebook")(facebook.asInstanceOf[js.Any])
    if (ghost_foot != null) __obj.updateDynamic("ghost_foot")(ghost_foot.asInstanceOf[js.Any])
    if (ghost_head != null) __obj.updateDynamic("ghost_head")(ghost_head.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (meta_description != null) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (meta_title != null) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (og_description != null) __obj.updateDynamic("og_description")(og_description.asInstanceOf[js.Any])
    if (og_image != null) __obj.updateDynamic("og_image")(og_image.asInstanceOf[js.Any])
    if (og_title != null) __obj.updateDynamic("og_title")(og_title.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (twitter != null) __obj.updateDynamic("twitter")(twitter.asInstanceOf[js.Any])
    if (twitter_description != null) __obj.updateDynamic("twitter_description")(twitter_description.asInstanceOf[js.Any])
    if (twitter_image != null) __obj.updateDynamic("twitter_image")(twitter_image.asInstanceOf[js.Any])
    if (twitter_title != null) __obj.updateDynamic("twitter_title")(twitter_title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
}

