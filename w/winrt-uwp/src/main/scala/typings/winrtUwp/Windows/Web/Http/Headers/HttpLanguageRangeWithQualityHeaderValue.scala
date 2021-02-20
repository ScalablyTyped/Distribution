package typings.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents accept language information used in the Accept-Language HTTP header on an HTTP request. */
@js.native
trait HttpLanguageRangeWithQualityHeaderValue extends StObject {
  
  /** Gets the value of the language-range information from the HttpLanguageRangeWithQualityHeaderValue used in the Accept-Language HTTP header. */
  var languageRange: String = js.native
  
  /** Gets the value of the qvalue or quality factor from the HttpLanguageRangeWithQualityHeaderValue used in the Accept-Language HTTP header. */
  var quality: Double = js.native
}
object HttpLanguageRangeWithQualityHeaderValue {
  
  @scala.inline
  def apply(languageRange: String, quality: Double): HttpLanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(languageRange = languageRange.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpLanguageRangeWithQualityHeaderValue]
  }
  
  @scala.inline
  implicit class HttpLanguageRangeWithQualityHeaderValueMutableBuilder[Self <: HttpLanguageRangeWithQualityHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageRange(value: String): Self = StObject.set(x, "languageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
  }
}
