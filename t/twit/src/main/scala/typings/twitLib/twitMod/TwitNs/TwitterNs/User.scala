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

