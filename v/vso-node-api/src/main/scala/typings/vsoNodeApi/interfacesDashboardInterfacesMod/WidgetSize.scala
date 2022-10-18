package typings.vsoNodeApi.interfacesDashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetSize extends StObject {
  
  /**
    * The Width of the widget, expressed in dashboard grid columns.
    */
  var columnSpan: Double
  
  /**
    * The height of the widget, expressed in dashboard grid rows.
    */
  var rowSpan: Double
}
object WidgetSize {
  
  inline def apply(columnSpan: Double, rowSpan: Double): WidgetSize = {
    val __obj = js.Dynamic.literal(columnSpan = columnSpan.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetSize]
  }
  
  extension [Self <: WidgetSize](x: Self) {
    
    inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
  }
}
