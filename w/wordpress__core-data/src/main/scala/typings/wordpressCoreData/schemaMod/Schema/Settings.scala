package typings.wordpressCoreData.schemaMod.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    inline def setDate_format(value: String): Self = StObject.set(x, "date_format", value.asInstanceOf[js.Any])
    
    inline def setDefault_category(value: Double): Self = StObject.set(x, "default_category", value.asInstanceOf[js.Any])
    
    inline def setDefault_comment_status(value: OpenOrClosed): Self = StObject.set(x, "default_comment_status", value.asInstanceOf[js.Any])
    
    inline def setDefault_ping_status(value: OpenOrClosed): Self = StObject.set(x, "default_ping_status", value.asInstanceOf[js.Any])
    
    inline def setDefault_post_format(value: String): Self = StObject.set(x, "default_post_format", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setPosts_per_page(value: Double): Self = StObject.set(x, "posts_per_page", value.asInstanceOf[js.Any])
    
    inline def setStart_of_week(value: Double): Self = StObject.set(x, "start_of_week", value.asInstanceOf[js.Any])
    
    inline def setTime_format(value: String): Self = StObject.set(x, "time_format", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUse_smilies(value: Boolean): Self = StObject.set(x, "use_smilies", value.asInstanceOf[js.Any])
  }
}
