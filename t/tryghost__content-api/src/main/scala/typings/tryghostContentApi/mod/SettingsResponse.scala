package typings.tryghostContentApi.mod

import typings.tryghostContentApi.AnonLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResponse extends Settings {
  var meta: js.Any
}

object SettingsResponse {
  @scala.inline
  def apply(
    meta: js.Any,
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
  ): SettingsResponse = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[SettingsResponse]
  }
}

