package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnsNumber extends StObject {
  
  var columns: Double
}
object ColumnsNumber {
  
  inline def apply(columns: Double): ColumnsNumber = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsNumber]
  }
  
  extension [Self <: ColumnsNumber](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
  }
}
