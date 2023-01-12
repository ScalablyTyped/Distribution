package typings.vegaLite.buildSrcVegaDotschemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowCol[T] extends StObject {
  
  var column: js.UndefOr[T] = js.undefined
  
  var row: js.UndefOr[T] = js.undefined
}
object RowCol {
  
  inline def apply[T](): RowCol[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowCol[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowCol[?], T] (val x: Self & RowCol[T]) extends AnyVal {
    
    inline def setColumn(value: T): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
