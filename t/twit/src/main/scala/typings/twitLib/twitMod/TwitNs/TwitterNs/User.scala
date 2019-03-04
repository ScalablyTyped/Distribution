package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var contributors_enabled: scala.Boolean
  var created_at: java.lang.String
  var default_profile: java.lang.String
  var default_profile_image: java.lang.String
  var description: java.lang.String
  var entities: Entities
  var favourites_count: scala.Double
  var follow_request_sent: js.UndefOr[scala.Boolean] = js.undefined
  var followers_count: scala.Double
  var following: js.UndefOr[scala.Boolean] = js.undefined
  var friends_count: scala.Double
  var geo_enabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: scala.Double
  var id_str: java.lang.String
  var is_translator: js.UndefOr[scala.Boolean] = js.undefined
  var lang: java.lang.String
  var listed_count: scala.Double
  var location: java.lang.String
  var name: java.lang.String
  var notifications: js.UndefOr[scala.Boolean] = js.undefined
  var profile_background_color: java.lang.String
  var profile_background_image_url: java.lang.String
  var profile_background_image_url_https: java.lang.String
  var profile_background_tile: scala.Boolean
  var profile_banner_url: java.lang.String
  var profile_image_url: java.lang.String
  var profile_image_url_https: java.lang.String
  var profile_link_color: java.lang.String
  var profile_sidebar_border_color: java.lang.String
  var profile_sidebar_fill_color: java.lang.String
  var profile_text_color: java.lang.String
  var profile_use_background_image: scala.Boolean
  var `protected`: scala.Boolean
  var screen_name: java.lang.String
  var show_all_inline_media: scala.Boolean
  var status: js.UndefOr[Status] = js.undefined
  var statuses_count: scala.Double
  var time_zone: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
  var utc_offset: js.UndefOr[scala.Double] = js.undefined
  var verified: scala.Boolean
  var withheld_in_countries: java.lang.String
  var withheld_scope: java.lang.String
}

object User {
  @scala.inline
  def apply(
    contributors_enabled: scala.Boolean,
    created_at: java.lang.String,
    default_profile: java.lang.String,
    default_profile_image: java.lang.String,
    description: java.lang.String,
    entities: Entities,
    favourites_count: scala.Double,
    followers_count: scala.Double,
    friends_count: scala.Double,
    id: scala.Double,
    id_str: java.lang.String,
    lang: java.lang.String,
    listed_count: scala.Double,
    location: java.lang.String,
    name: java.lang.String,
    profile_background_color: java.lang.String,
    profile_background_image_url: java.lang.String,
    profile_background_image_url_https: java.lang.String,
    profile_background_tile: scala.Boolean,
    profile_banner_url: java.lang.String,
    profile_image_url: java.lang.String,
    profile_image_url_https: java.lang.String,
    profile_link_color: java.lang.String,
    profile_sidebar_border_color: java.lang.String,
    profile_sidebar_fill_color: java.lang.String,
    profile_text_color: java.lang.String,
    profile_use_background_image: scala.Boolean,
    `protected`: scala.Boolean,
    screen_name: java.lang.String,
    show_all_inline_media: scala.Boolean,
    statuses_count: scala.Double,
    url: java.lang.String,
    verified: scala.Boolean,
    withheld_in_countries: java.lang.String,
    withheld_scope: java.lang.String,
    follow_request_sent: js.UndefOr[scala.Boolean] = js.undefined,
    following: js.UndefOr[scala.Boolean] = js.undefined,
    geo_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    is_translator: js.UndefOr[scala.Boolean] = js.undefined,
    notifications: js.UndefOr[scala.Boolean] = js.undefined,
    status: Status = null,
    time_zone: java.lang.String = null,
    utc_offset: scala.Int | scala.Double = null
  ): User = {
    val __obj = js.Dynamic.literal(contributors_enabled = contributors_enabled, created_at = created_at, default_profile = default_profile, default_profile_image = default_profile_image, description = description, entities = entities, favourites_count = favourites_count, followers_count = followers_count, friends_count = friends_count, id = id, id_str = id_str, lang = lang, listed_count = listed_count, location = location, name = name, profile_background_color = profile_background_color, profile_background_image_url = profile_background_image_url, profile_background_image_url_https = profile_background_image_url_https, profile_background_tile = profile_background_tile, profile_banner_url = profile_banner_url, profile_image_url = profile_image_url, profile_image_url_https = profile_image_url_https, profile_link_color = profile_link_color, profile_sidebar_border_color = profile_sidebar_border_color, profile_sidebar_fill_color = profile_sidebar_fill_color, profile_text_color = profile_text_color, profile_use_background_image = profile_use_background_image, screen_name = screen_name, show_all_inline_media = show_all_inline_media, statuses_count = statuses_count, url = url, verified = verified, withheld_in_countries = withheld_in_countries, withheld_scope = withheld_scope)
    __obj.updateDynamic("protected")(`protected`)
    if (!js.isUndefined(follow_request_sent)) __obj.updateDynamic("follow_request_sent")(follow_request_sent)
    if (!js.isUndefined(following)) __obj.updateDynamic("following")(following)
    if (!js.isUndefined(geo_enabled)) __obj.updateDynamic("geo_enabled")(geo_enabled)
    if (!js.isUndefined(is_translator)) __obj.updateDynamic("is_translator")(is_translator)
    if (!js.isUndefined(notifications)) __obj.updateDynamic("notifications")(notifications)
    if (status != null) __obj.updateDynamic("status")(status)
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone)
    if (utc_offset != null) __obj.updateDynamic("utc_offset")(utc_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

