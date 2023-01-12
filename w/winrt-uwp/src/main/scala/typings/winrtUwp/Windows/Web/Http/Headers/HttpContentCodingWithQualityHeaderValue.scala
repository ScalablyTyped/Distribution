package typings.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents accept encoding information used in the Accept-Encoding HTTP header on an HTTP request. */
trait HttpContentCodingWithQualityHeaderValue extends StObject {
  
  /** Gets the value of the content-coding characteristic in the Accept-Encoding HTTP header. */
  var contentCoding: String
  
  /** Gets the value of the qvalue attribute in the Accept-Encoding HTTP header. */
  var quality: Double
}
object HttpContentCodingWithQualityHeaderValue {
  
  inline def apply(contentCoding: String, quality: Double): HttpContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(contentCoding = contentCoding.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentCodingWithQualityHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpContentCodingWithQualityHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setContentCoding(value: String): Self = StObject.set(x, "contentCoding", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
  }
}
