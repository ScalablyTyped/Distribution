package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Posts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author
  extends Identification
     with Metadata
     with GhostData {
  var bio: js.UndefOr[Nullable[String]] = js.undefined
  var count: js.UndefOr[Posts] = js.undefined
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
  ): Author = {
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
    __obj.asInstanceOf[Author]
  }
}

