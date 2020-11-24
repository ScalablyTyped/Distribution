package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FontSetting. */
@js.native
trait FontSetting extends js.Object {
  
  /** When `true`, the font is matched if it is bold. */
  var bold: js.UndefOr[Boolean] = js.native
  
  /** When `true`, the font is matched if it is italic. */
  var italic: js.UndefOr[Boolean] = js.native
  
  /** The HTML heading level that any content with the matching font will be converted to. */
  var level: js.UndefOr[Double] = js.native
  
  /** The maximum size of the font to match. */
  var max_size: js.UndefOr[Double] = js.native
  
  /** The minimum size of the font to match. */
  var min_size: js.UndefOr[Double] = js.native
  
  /** The name of the font. */
  var name: js.UndefOr[String] = js.native
}
object FontSetting {
  
  @scala.inline
  def apply(): FontSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSetting]
  }
  
  @scala.inline
  implicit class FontSettingOps[Self <: FontSetting] (val x: Self) extends AnyVal {
    
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
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMax_size(value: Double): Self = this.set("max_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_size: Self = this.set("max_size", js.undefined)
    
    @scala.inline
    def setMin_size(value: Double): Self = this.set("min_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_size: Self = this.set("min_size", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
