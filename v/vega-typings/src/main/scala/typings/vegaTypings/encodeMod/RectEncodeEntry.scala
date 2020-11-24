package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectEncodeEntry extends EncodeEntry {
  
  var cornerRadius: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var cornerRadiusBottomLeft: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var cornerRadiusBottomRight: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var cornerRadiusTopLeft: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var cornerRadiusTopRight: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}
object RectEncodeEntry {
  
  @scala.inline
  def apply(): RectEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectEncodeEntry]
  }
  
  @scala.inline
  implicit class RectEncodeEntryOps[Self <: RectEncodeEntry] (val x: Self) extends AnyVal {
    
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
    def setCornerRadiusVarargs(value: (Test with NumericValueRef)*): Self = this.set("cornerRadius", js.Array(value :_*))
    
    @scala.inline
    def setCornerRadius(value: ProductionRule[NumericValueRef]): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setCornerRadiusBottomLeftVarargs(value: (Test with NumericValueRef)*): Self = this.set("cornerRadiusBottomLeft", js.Array(value :_*))
    
    @scala.inline
    def setCornerRadiusBottomLeft(value: ProductionRule[NumericValueRef]): Self = this.set("cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadiusBottomLeft: Self = this.set("cornerRadiusBottomLeft", js.undefined)
    
    @scala.inline
    def setCornerRadiusBottomRightVarargs(value: (Test with NumericValueRef)*): Self = this.set("cornerRadiusBottomRight", js.Array(value :_*))
    
    @scala.inline
    def setCornerRadiusBottomRight(value: ProductionRule[NumericValueRef]): Self = this.set("cornerRadiusBottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadiusBottomRight: Self = this.set("cornerRadiusBottomRight", js.undefined)
    
    @scala.inline
    def setCornerRadiusTopLeftVarargs(value: (Test with NumericValueRef)*): Self = this.set("cornerRadiusTopLeft", js.Array(value :_*))
    
    @scala.inline
    def setCornerRadiusTopLeft(value: ProductionRule[NumericValueRef]): Self = this.set("cornerRadiusTopLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadiusTopLeft: Self = this.set("cornerRadiusTopLeft", js.undefined)
    
    @scala.inline
    def setCornerRadiusTopRightVarargs(value: (Test with NumericValueRef)*): Self = this.set("cornerRadiusTopRight", js.Array(value :_*))
    
    @scala.inline
    def setCornerRadiusTopRight(value: ProductionRule[NumericValueRef]): Self = this.set("cornerRadiusTopRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadiusTopRight: Self = this.set("cornerRadiusTopRight", js.undefined)
  }
}
