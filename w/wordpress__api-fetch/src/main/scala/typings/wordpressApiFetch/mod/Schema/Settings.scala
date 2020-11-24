package typings.wordpressApiFetch.mod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  var date_format: String = js.native
  
  var default_category: Double = js.native
  
  var default_comment_status: OpenOrClosed = js.native
  
  var default_ping_status: OpenOrClosed = js.native
  
  var default_post_format: String = js.native
  
  var description: String = js.native
  
  var email: String = js.native
  
  var language: String = js.native
  
  var posts_per_page: Double = js.native
  
  var start_of_week: Double = js.native
  
  var time_format: String = js.native
  
  var timezone: String = js.native
  
  var title: String = js.native
  
  var url: String = js.native
  
  var use_smilies: Boolean = js.native
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
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate_format(value: String): Self = this.set("date_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_category(value: Double): Self = this.set("default_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_comment_status(value: OpenOrClosed): Self = this.set("default_comment_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_ping_status(value: OpenOrClosed): Self = this.set("default_ping_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_post_format(value: String): Self = this.set("default_post_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosts_per_page(value: Double): Self = this.set("posts_per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_of_week(value: Double): Self = this.set("start_of_week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_format(value: String): Self = this.set("time_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_smilies(value: Boolean): Self = this.set("use_smilies", value.asInstanceOf[js.Any])
  }
}
