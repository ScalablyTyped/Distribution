package typings.textBuffer.mod.global.TextBuffer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface that should be implemented for all "point-compatible" objects. */
trait PointLike extends StObject {
  
  /** A zero-indexed number representing the column of the Point. */
  var column: Double
  
  /** A zero-indexed number representing the row of the Point. */
  var row: Double
}
object PointLike {
  
  inline def apply(column: Double, row: Double): PointLike = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLike]
  }
  
  extension [Self <: PointLike](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
