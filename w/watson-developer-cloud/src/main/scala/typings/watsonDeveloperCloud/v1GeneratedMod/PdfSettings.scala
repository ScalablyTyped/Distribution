package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of PDF conversion settings. */
trait PdfSettings extends StObject {
  
  var heading: js.UndefOr[PdfHeadingDetection] = js.undefined
}
object PdfSettings {
  
  inline def apply(): PdfSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdfSettings]
  }
  
  extension [Self <: PdfSettings](x: Self) {
    
    inline def setHeading(value: PdfHeadingDetection): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
  }
}
