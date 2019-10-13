package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import typings.atTryghostContentDashApi.Anon_Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting
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
  var navigation: js.UndefOr[js.Array[Anon_Label]] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var twitter: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Setting {
  @scala.inline
  def apply(
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
    navigation: js.Array[Anon_Label] = null,
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
  ): Setting = {
    val __obj = js.Dynamic.literal()
    if (codeinjection_foot != null) __obj.updateDynamic("codeinjection_foot")(codeinjection_foot.asInstanceOf[js.Any])
    if (codeinjection_head != null) __obj.updateDynamic("codeinjection_head")(codeinjection_head.asInstanceOf[js.Any])
    if (cover_image != null) __obj.updateDynamic("cover_image")(cover_image)
    if (description != null) __obj.updateDynamic("description")(description)
    if (facebook != null) __obj.updateDynamic("facebook")(facebook)
    if (ghost_foot != null) __obj.updateDynamic("ghost_foot")(ghost_foot.asInstanceOf[js.Any])
    if (ghost_head != null) __obj.updateDynamic("ghost_head")(ghost_head.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (logo != null) __obj.updateDynamic("logo")(logo)
    if (meta_description != null) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (meta_title != null) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (og_description != null) __obj.updateDynamic("og_description")(og_description.asInstanceOf[js.Any])
    if (og_image != null) __obj.updateDynamic("og_image")(og_image.asInstanceOf[js.Any])
    if (og_title != null) __obj.updateDynamic("og_title")(og_title.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (title != null) __obj.updateDynamic("title")(title)
    if (twitter != null) __obj.updateDynamic("twitter")(twitter)
    if (twitter_description != null) __obj.updateDynamic("twitter_description")(twitter_description.asInstanceOf[js.Any])
    if (twitter_image != null) __obj.updateDynamic("twitter_image")(twitter_image.asInstanceOf[js.Any])
    if (twitter_title != null) __obj.updateDynamic("twitter_title")(twitter_title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Setting]
  }
}

