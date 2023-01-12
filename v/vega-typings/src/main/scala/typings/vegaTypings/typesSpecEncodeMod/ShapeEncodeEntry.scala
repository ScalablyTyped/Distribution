package typings.vegaTypings.typesSpecEncodeMod

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
  
  inline def apply(): ShapeEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeEncodeEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeEncodeEntry] (val x: Self) extends AnyVal {
    
    inline def setShape(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setShapeVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
