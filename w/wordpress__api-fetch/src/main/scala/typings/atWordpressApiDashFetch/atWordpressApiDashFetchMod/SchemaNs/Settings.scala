package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var date_format: String
  var default_category: Double
  var default_comment_status: OpenOrClosed
  var default_ping_status: OpenOrClosed
  var default_post_format: String
  var description: String
  var email: String
  var language: String
  var posts_per_page: Double
  var start_of_week: Double
  var time_format: String
  var timezone: String
  var title: String
  var url: String
  var use_smilies: Boolean
}

object Settings {
  @scala.inline
  def apply(
    date_format: String,
    default_category: Double,
    default_comment_status: OpenOrClosed,
    default_ping_status: OpenOrClosed,
    default_post_format: String,
    description: String,
    email: String,
    language: String,
    posts_per_page: Double,
    start_of_week: Double,
    time_format: String,
    timezone: String,
    title: String,
    url: String,
    use_smilies: Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(date_format = date_format, default_category = default_category, default_comment_status = default_comment_status, default_ping_status = default_ping_status, default_post_format = default_post_format, description = description, email = email, language = language, posts_per_page = posts_per_page, start_of_week = start_of_week, time_format = time_format, timezone = timezone, title = title, url = url, use_smilies = use_smilies)
  
    __obj.asInstanceOf[Settings]
  }
}

