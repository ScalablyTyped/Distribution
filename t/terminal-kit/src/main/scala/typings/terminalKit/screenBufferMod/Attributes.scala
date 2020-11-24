package typings.terminalKit.screenBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends js.Object {
  
  var bgColor: js.UndefOr[Double] = js.native
  
  var bgDefaultColor: js.UndefOr[Boolean] = js.native
  
  var bgTransparency: js.UndefOr[Boolean] = js.native
  
  var blink: js.UndefOr[Boolean] = js.native
  
  var bold: js.UndefOr[Boolean] = js.native
  
  var charTransparency: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[Double] = js.native
  
  var defaultColor: js.UndefOr[Boolean] = js.native
  
  var dim: js.UndefOr[Boolean] = js.native
  
  var fgTransparency: js.UndefOr[Boolean] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var inverse: js.UndefOr[Boolean] = js.native
  
  var italic: js.UndefOr[Boolean] = js.native
  
  var strike: js.UndefOr[Boolean] = js.native
  
  var styleTransparency: js.UndefOr[Boolean] = js.native
  
  var transparency: js.UndefOr[Boolean] = js.native
  
  var underline: js.UndefOr[Boolean] = js.native
}
object Attributes {
  
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    
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
    def setBgColor(value: Double): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    
    @scala.inline
    def setBgDefaultColor(value: Boolean): Self = this.set("bgDefaultColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgDefaultColor: Self = this.set("bgDefaultColor", js.undefined)
    
    @scala.inline
    def setBgTransparency(value: Boolean): Self = this.set("bgTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgTransparency: Self = this.set("bgTransparency", js.undefined)
    
    @scala.inline
    def setBlink(value: Boolean): Self = this.set("blink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlink: Self = this.set("blink", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setCharTransparency(value: Boolean): Self = this.set("charTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharTransparency: Self = this.set("charTransparency", js.undefined)
    
    @scala.inline
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDefaultColor(value: Boolean): Self = this.set("defaultColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColor: Self = this.set("defaultColor", js.undefined)
    
    @scala.inline
    def setDim(value: Boolean): Self = this.set("dim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDim: Self = this.set("dim", js.undefined)
    
    @scala.inline
    def setFgTransparency(value: Boolean): Self = this.set("fgTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFgTransparency: Self = this.set("fgTransparency", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setStrike(value: Boolean): Self = this.set("strike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrike: Self = this.set("strike", js.undefined)
    
    @scala.inline
    def setStyleTransparency(value: Boolean): Self = this.set("styleTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleTransparency: Self = this.set("styleTransparency", js.undefined)
    
    @scala.inline
    def setTransparency(value: Boolean): Self = this.set("transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
}
