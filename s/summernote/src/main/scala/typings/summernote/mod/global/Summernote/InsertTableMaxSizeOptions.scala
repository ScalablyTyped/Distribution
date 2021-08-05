package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertTableMaxSizeOptions extends StObject {
  
  var col: Double
  
  var row: Double
}
object InsertTableMaxSizeOptions {
  
  inline def apply(col: Double, row: Double): InsertTableMaxSizeOptions = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTableMaxSizeOptions]
  }
  
  extension [Self <: InsertTableMaxSizeOptions](x: Self) {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
