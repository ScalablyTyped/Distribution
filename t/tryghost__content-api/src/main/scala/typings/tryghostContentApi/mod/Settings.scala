package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings
  extends Metadata
     with CodeInjection
     with Facebook
     with Twitter
     with GhostData {
  var cover_image: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var facebook: js.UndefOr[String] = js.undefined
  var ghost_foot: js.UndefOr[Nullable[String]] = js.undefined
  var ghost_head: js.UndefOr[Nullable[String]] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var logo: js.UndefOr[String] = js.undefined
  var navigation: js.UndefOr[js.Array[Label]] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var twitter: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
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
  ): Settings = {
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
    __obj.asInstanceOf[Settings]
  }
}

