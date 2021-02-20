package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of PDF conversion settings. */
@js.native
trait PdfSettings extends StObject {
  
  var heading: js.UndefOr[PdfHeadingDetection] = js.native
}
object PdfSettings {
  
  @scala.inline
  def apply(): PdfSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdfSettings]
  }
  
  @scala.inline
  implicit class PdfSettingsMutableBuilder[Self <: PdfSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeading(value: PdfHeadingDetection): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
  }
}
