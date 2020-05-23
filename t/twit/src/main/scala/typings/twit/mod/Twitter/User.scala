package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var contributors_enabled: Boolean
  var created_at: String
  var default_profile: String
  var default_profile_image: String
  var description: String
  var entities: Entities
  var favourites_count: Double
  var follow_request_sent: js.UndefOr[Boolean] = js.undefined
  var followers_count: Double
  var following: js.UndefOr[Boolean] = js.undefined
  var friends_count: Double
  var geo_enabled: js.UndefOr[Boolean] = js.undefined
  var id: Double
  var id_str: String
  var is_translator: js.UndefOr[Boolean] = js.undefined
  var lang: String
  var listed_count: Double
  var location: String
  var name: String
  var notifications: js.UndefOr[Boolean] = js.undefined
  var profile_background_color: String
  var profile_background_image_url: String
  var profile_background_image_url_https: String
  var profile_background_tile: Boolean
  var profile_banner_url: String
  var profile_image_url: String
  var profile_image_url_https: String
  var profile_link_color: String
  var profile_sidebar_border_color: String
  var profile_sidebar_fill_color: String
  var profile_text_color: String
  var profile_use_background_image: Boolean
  var `protected`: Boolean
  var screen_name: String
  var show_all_inline_media: Boolean
  var status: js.UndefOr[Status] = js.undefined
  var statuses_count: Double
  var time_zone: js.UndefOr[String] = js.undefined
  var url: String
  var utc_offset: js.UndefOr[Double] = js.undefined
  var verified: Boolean
  var withheld_in_countries: String
  var withheld_scope: String
}

object User {
  @scala.inline
  def apply(
    contributors_enabled: Boolean,
    created_at: String,
    default_profile: String,
    default_profile_image: String,
    description: String,
    entities: Entities,
    favourites_count: Double,
    followers_count: Double,
    friends_count: Double,
    id: Double,
    id_str: String,
    lang: String,
    listed_count: Double,
    location: String,
    name: String,
    profile_background_color: String,
    profile_background_image_url: String,
    profile_background_image_url_https: String,
    profile_background_tile: Boolean,
    profile_banner_url: String,
    profile_image_url: String,
    profile_image_url_https: String,
    profile_link_color: String,
    profile_sidebar_border_color: String,
    profile_sidebar_fill_color: String,
    profile_text_color: String,
    profile_use_background_image: Boolean,
    `protected`: Boolean,
    screen_name: String,
    show_all_inline_media: Boolean,
    statuses_count: Double,
    url: String,
    verified: Boolean,
    withheld_in_countries: String,
    withheld_scope: String,
    follow_request_sent: js.UndefOr[Boolean] = js.undefined,
    following: js.UndefOr[Boolean] = js.undefined,
    geo_enabled: js.UndefOr[Boolean] = js.undefined,
    is_translator: js.UndefOr[Boolean] = js.undefined,
    notifications: js.UndefOr[Boolean] = js.undefined,
    status: Status = null,
    time_zone: String = null,
    utc_offset: js.UndefOr[Double] = js.undefined
  ): User = {
    val __obj = js.Dynamic.literal(contributors_enabled = contributors_enabled.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_profile = default_profile.asInstanceOf[js.Any], default_profile_image = default_profile_image.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], favourites_count = favourites_count.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], friends_count = friends_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], listed_count = listed_count.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile_background_color = profile_background_color.asInstanceOf[js.Any], profile_background_image_url = profile_background_image_url.asInstanceOf[js.Any], profile_background_image_url_https = profile_background_image_url_https.asInstanceOf[js.Any], profile_background_tile = profile_background_tile.asInstanceOf[js.Any], profile_banner_url = profile_banner_url.asInstanceOf[js.Any], profile_image_url = profile_image_url.asInstanceOf[js.Any], profile_image_url_https = profile_image_url_https.asInstanceOf[js.Any], profile_link_color = profile_link_color.asInstanceOf[js.Any], profile_sidebar_border_color = profile_sidebar_border_color.asInstanceOf[js.Any], profile_sidebar_fill_color = profile_sidebar_fill_color.asInstanceOf[js.Any], profile_text_color = profile_text_color.asInstanceOf[js.Any], profile_use_background_image = profile_use_background_image.asInstanceOf[js.Any], screen_name = screen_name.asInstanceOf[js.Any], show_all_inline_media = show_all_inline_media.asInstanceOf[js.Any], statuses_count = statuses_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], withheld_in_countries = withheld_in_countries.asInstanceOf[js.Any], withheld_scope = withheld_scope.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    if (!js.isUndefined(follow_request_sent)) __obj.updateDynamic("follow_request_sent")(follow_request_sent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(following)) __obj.updateDynamic("following")(following.get.asInstanceOf[js.Any])
    if (!js.isUndefined(geo_enabled)) __obj.updateDynamic("geo_enabled")(geo_enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_translator)) __obj.updateDynamic("is_translator")(is_translator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notifications)) __obj.updateDynamic("notifications")(notifications.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone.asInstanceOf[js.Any])
    if (!js.isUndefined(utc_offset)) __obj.updateDynamic("utc_offset")(utc_offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

