package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PdfHeadingDetection. */
trait PdfHeadingDetection extends StObject {
  
  var fonts: js.UndefOr[js.Array[FontSetting]] = js.undefined
}
object PdfHeadingDetection {
  
  inline def apply(): PdfHeadingDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdfHeadingDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PdfHeadingDetection] (val x: Self) extends AnyVal {
    
    inline def setFonts(value: js.Array[FontSetting]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setFontsVarargs(value: FontSetting*): Self = StObject.set(x, "fonts", js.Array(value*))
  }
}
