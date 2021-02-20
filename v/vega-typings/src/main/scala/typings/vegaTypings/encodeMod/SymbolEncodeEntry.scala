package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
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
  implicit class SymbolEncodeEntryMutableBuilder[Self <: SymbolEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setAngleVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "angle", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: ProductionRule[ScaledValueRef[SymbolShape]]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setShapeVarargs(value: (Test with ScaledValueRef[SymbolShape])*): Self = StObject.set(x, "shape", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
