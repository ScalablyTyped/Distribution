package typings.wordpressComponents.colorPickerMod.ColorPicker

import typings.tinycolor2.mod.Instance
import typings.wordpressComponents.wordpressComponentsStrings.rgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChangeCompleteValue extends js.Object {
  
  var color: Instance = js.native
  
  var draftHex: String = js.native
  
  var draftHsl: String = js.native
  
  var draftRgb: String = js.native
  
  var hex: String = js.native
  
  var hsl: String = js.native
  
  var hsv: String = js.native
  
  var oldHue: String = js.native
  
  var rgb: String = js.native
  
  var source: js.UndefOr[rgb] = js.native
}
object OnChangeCompleteValue {
  
  @scala.inline
  def apply(
    color: Instance,
    draftHex: String,
    draftHsl: String,
    draftRgb: String,
    hex: String,
    hsl: String,
    hsv: String,
    oldHue: String,
    rgb: String
  ): OnChangeCompleteValue = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], draftHex = draftHex.asInstanceOf[js.Any], draftHsl = draftHsl.asInstanceOf[js.Any], draftRgb = draftRgb.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], oldHue = oldHue.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeCompleteValue]
  }
  
  @scala.inline
  implicit class OnChangeCompleteValueOps[Self <: OnChangeCompleteValue] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Instance): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftHex(value: String): Self = this.set("draftHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftHsl(value: String): Self = this.set("draftHsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftRgb(value: String): Self = this.set("draftRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsl(value: String): Self = this.set("hsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsv(value: String): Self = this.set("hsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldHue(value: String): Self = this.set("oldHue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgb(value: String): Self = this.set("rgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: rgb): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
