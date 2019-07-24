package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var date_format: java.lang.String
  var default_category: scala.Double
  var default_comment_status: OpenOrClosed
  var default_ping_status: OpenOrClosed
  var default_post_format: java.lang.String
  var description: java.lang.String
  var email: java.lang.String
  var language: java.lang.String
  var posts_per_page: scala.Double
  var start_of_week: scala.Double
  var time_format: java.lang.String
  var timezone: java.lang.String
  var title: java.lang.String
  var url: java.lang.String
  var use_smilies: scala.Boolean
}

object Settings {
  @scala.inline
  def apply(
    date_format: java.lang.String,
    default_category: scala.Double,
    default_comment_status: OpenOrClosed,
    default_ping_status: OpenOrClosed,
    default_post_format: java.lang.String,
    description: java.lang.String,
    email: java.lang.String,
    language: java.lang.String,
    posts_per_page: scala.Double,
    start_of_week: scala.Double,
    time_format: java.lang.String,
    timezone: java.lang.String,
    title: java.lang.String,
    url: java.lang.String,
    use_smilies: scala.Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(date_format = date_format, default_category = default_category, default_comment_status = default_comment_status, default_ping_status = default_ping_status, default_post_format = default_post_format, description = description, email = email, language = language, posts_per_page = posts_per_page, start_of_week = start_of_week, time_format = time_format, timezone = timezone, title = title, url = url, use_smilies = use_smilies)
  
    __obj.asInstanceOf[Settings]
  }
}

