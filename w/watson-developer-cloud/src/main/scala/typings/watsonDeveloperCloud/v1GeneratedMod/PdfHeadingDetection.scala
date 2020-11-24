package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PdfHeadingDetection. */
@js.native
trait PdfHeadingDetection extends js.Object {
  
  var fonts: js.UndefOr[js.Array[FontSetting]] = js.native
}
object PdfHeadingDetection {
  
  @scala.inline
  def apply(): PdfHeadingDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdfHeadingDetection]
  }
  
  @scala.inline
  implicit class PdfHeadingDetectionOps[Self <: PdfHeadingDetection] (val x: Self) extends AnyVal {
    
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
    def setFontsVarargs(value: FontSetting*): Self = this.set("fonts", js.Array(value :_*))
    
    @scala.inline
    def setFonts(value: js.Array[FontSetting]): Self = this.set("fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
  }
}
