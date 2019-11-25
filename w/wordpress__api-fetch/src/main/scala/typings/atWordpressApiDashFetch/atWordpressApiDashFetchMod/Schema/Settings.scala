package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema

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
    val __obj = js.Dynamic.literal(date_format = date_format.asInstanceOf[js.Any], default_category = default_category.asInstanceOf[js.Any], default_comment_status = default_comment_status.asInstanceOf[js.Any], default_ping_status = default_ping_status.asInstanceOf[js.Any], default_post_format = default_post_format.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], posts_per_page = posts_per_page.asInstanceOf[js.Any], start_of_week = start_of_week.asInstanceOf[js.Any], time_format = time_format.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_smilies = use_smilies.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Settings]
  }
}

