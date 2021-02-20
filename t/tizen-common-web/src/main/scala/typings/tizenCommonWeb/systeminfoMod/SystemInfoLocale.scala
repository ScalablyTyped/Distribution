package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoLocale extends SystemInfoProperty {
  
  /**
    * Indicates the current country setting in the (LANGUAGE)_(REGION) syntax.
    *
    * The language setting is in the ISO 639-2 format and the region setting is in the ISO 3166-1 alpha-2 format.
    * The country setting is case-sensitive.
    */
  val country: String = js.native
  
  /**
    * Indicates the current language setting in the (LANGUAGE)_(REGION) syntax.
    *
    * The language setting is in the ISO 639-2 format and the region setting is in the ISO 3166-1 alpha-2 format.
    * The language setting is case-sensitive.
    */
  val language: String = js.native
}
object SystemInfoLocale {
  
  @scala.inline
  def apply(country: String, language: String): SystemInfoLocale = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoLocale]
  }
  
  @scala.inline
  implicit class SystemInfoLocaleMutableBuilder[Self <: SystemInfoLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
