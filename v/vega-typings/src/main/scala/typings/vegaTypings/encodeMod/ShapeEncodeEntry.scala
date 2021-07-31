package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeEncodeEntry
  extends StObject
     with EncodeEntry {
  
  var shape: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
}
object ShapeEncodeEntry {
  
  @scala.inline
  def apply(): ShapeEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeEncodeEntry]
  }
  
  @scala.inline
  implicit class ShapeEncodeEntryMutableBuilder[Self <: ShapeEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShape(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setShapeVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "shape", js.Array(value :_*))
  }
}
