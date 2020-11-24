package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WordHeadingDetection. */
@js.native
trait WordHeadingDetection extends js.Object {
  
  var fonts: js.UndefOr[js.Array[FontSetting]] = js.native
  
  var styles: js.UndefOr[js.Array[WordStyle]] = js.native
}
object WordHeadingDetection {
  
  @scala.inline
  def apply(): WordHeadingDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordHeadingDetection]
  }
  
  @scala.inline
  implicit class WordHeadingDetectionOps[Self <: WordHeadingDetection] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setStylesVarargs(value: WordStyle*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[WordStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
