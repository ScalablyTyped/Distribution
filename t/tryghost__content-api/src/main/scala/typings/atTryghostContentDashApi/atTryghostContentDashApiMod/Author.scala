package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import typings.atTryghostContentDashApi.Anon_Posts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author
  extends Identification
     with Metadata
     with GhostData {
  var bio: js.UndefOr[Nullable[String]] = js.undefined
  var count: js.UndefOr[Anon_Posts] = js.undefined
  var cover_image: js.UndefOr[Nullable[String]] = js.undefined
  var facebook: js.UndefOr[Nullable[String]] = js.undefined
  var location: js.UndefOr[Nullable[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var profile_image: js.UndefOr[Nullable[String]] = js.undefined
  var twitter: js.UndefOr[Nullable[String]] = js.undefined
  var url: js.UndefOr[Nullable[String]] = js.undefined
  var website: js.UndefOr[Nullable[String]] = js.undefined
}

object Author {
  @scala.inline
  def apply(
    id: String,
    slug: String,
    bio: Nullable[String] = null,
    count: Anon_Posts = null,
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
  ): Author = {
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
    __obj.asInstanceOf[Author]
  }
}

