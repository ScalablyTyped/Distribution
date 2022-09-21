package typings.telegramWebApp

import typings.telegramWebApp.telegramWebAppBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This object contains the data of the Web App user. */
trait WebAppUser extends StObject {
  
  /** First name of the user or bot. */
  var first_name: String
  
  /**
    * A unique identifier for the user or bot. This number may have more than 32
    * significant bits and some programming languages may have difficulty/silent
    * defects in interpreting it. It has at most 52 significant bits, so a 64-bit
    * integer or a double-precision float type is safe for storing this
    * identifier.
    */
  var id: Double
  
  /** True, if this user is a bot. Returns in the receiver field only. */
  var is_bot: js.UndefOr[Boolean] = js.undefined
  
  /** True, if this user is a Telegram Premium user. */
  var is_premium: js.UndefOr[`true`] = js.undefined
  
  /** IETF language tag of the user's language. Returns in user field only. */
  var language_code: js.UndefOr[String] = js.undefined
  
  /** Last name of the user or bot. */
  var last_name: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the user’s profile photo. The photo can be in .jpeg or .svg formats.
    * Only returned for Web Apps launched from the attachment menu.
    */
  var photo_url: js.UndefOr[String] = js.undefined
  
  /** Username of the user or bot. */
  var username: js.UndefOr[String] = js.undefined
}
object WebAppUser {
  
  inline def apply(first_name: String, id: Double): WebAppUser = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAppUser]
  }
  
  extension [Self <: WebAppUser](x: Self) {
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_bot(value: Boolean): Self = StObject.set(x, "is_bot", value.asInstanceOf[js.Any])
    
    inline def setIs_botUndefined: Self = StObject.set(x, "is_bot", js.undefined)
    
    inline def setIs_premium(value: `true`): Self = StObject.set(x, "is_premium", value.asInstanceOf[js.Any])
    
    inline def setIs_premiumUndefined: Self = StObject.set(x, "is_premium", js.undefined)
    
    inline def setLanguage_code(value: String): Self = StObject.set(x, "language_code", value.asInstanceOf[js.Any])
    
    inline def setLanguage_codeUndefined: Self = StObject.set(x, "language_code", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setPhoto_url(value: String): Self = StObject.set(x, "photo_url", value.asInstanceOf[js.Any])
    
    inline def setPhoto_urlUndefined: Self = StObject.set(x, "photo_url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
