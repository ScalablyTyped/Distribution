package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolEncodeEntry extends EncodeEntry {
  
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var shape: js.UndefOr[ProductionRule[ScaledValueRef[SymbolShape]]] = js.native
  
  var size: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}
object SymbolEncodeEntry {
  
  @scala.inline
  def apply(): SymbolEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolEncodeEntry]
  }
  
  @scala.inline
  implicit class SymbolEncodeEntryOps[Self <: SymbolEncodeEntry] (val x: Self) extends AnyVal {
    
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
    def setAngleVarargs(value: (Test with NumericValueRef)*): Self = this.set("angle", js.Array(value :_*))
    
    @scala.inline
    def setAngle(value: ProductionRule[NumericValueRef]): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setShapeVarargs(value: (Test with ScaledValueRef[SymbolShape])*): Self = this.set("shape", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: ProductionRule[ScaledValueRef[SymbolShape]]): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: (Test with NumericValueRef)*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: ProductionRule[NumericValueRef]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
