package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnLayout extends StObject {
  
  /** field - Required (not required in icon/button columns) this is the key for this column in the data array. */
  var field: js.UndefOr[String] = js.undefined
  
  /** title - Required This is the title that will be displayed in the header for this column. */
  var title: String
  
  /** visible - (boolean, default - true) determines if the column is visible. (see Column Visibility for more details */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /** sets the width of this column, this can be set in pixels or as a percentage of total table width (if not set the system will determine the best) */
  var width: js.UndefOr[Double | String] = js.undefined
}
object ColumnLayout {
  
  inline def apply(title: String): ColumnLayout = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnLayout] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
