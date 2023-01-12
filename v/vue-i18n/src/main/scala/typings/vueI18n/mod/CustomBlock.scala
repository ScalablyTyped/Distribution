package typings.vueI18n.mod

import typings.intlifyCoreBase.mod.Locale
import typings.intlifyCoreBase.mod.LocaleMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomBlock[Message] extends StObject {
  
  var locale: Locale
  
  var resource: LocaleMessages[Message, Locale, String]
}
object CustomBlock {
  
  inline def apply[Message](locale: Locale, resource: LocaleMessages[Message, Locale, String]): CustomBlock[Message] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomBlock[Message]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomBlock[?], Message] (val x: Self & CustomBlock[Message]) extends AnyVal {
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setResource(value: LocaleMessages[Message, Locale, String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
