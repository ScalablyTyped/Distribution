package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetSize extends StObject {
  
  /**
    * The Width of the widget, expressed in dashboard grid columns.
    */
  var columnSpan: Double = js.native
  
  /**
    * The height of the widget, expressed in dashboard grid rows.
    */
  var rowSpan: Double = js.native
}
object WidgetSize {
  
  @scala.inline
  def apply(columnSpan: Double, rowSpan: Double): WidgetSize = {
    val __obj = js.Dynamic.literal(columnSpan = columnSpan.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetSize]
  }
  
  @scala.inline
  implicit class WidgetSizeMutableBuilder[Self <: WidgetSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
  }
}
