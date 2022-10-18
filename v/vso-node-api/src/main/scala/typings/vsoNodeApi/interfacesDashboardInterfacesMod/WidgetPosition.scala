package typings.vsoNodeApi.interfacesDashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetPosition extends StObject {
  
  var column: Double
  
  var row: Double
}
object WidgetPosition {
  
  inline def apply(column: Double, row: Double): WidgetPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetPosition]
  }
  
  extension [Self <: WidgetPosition](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
