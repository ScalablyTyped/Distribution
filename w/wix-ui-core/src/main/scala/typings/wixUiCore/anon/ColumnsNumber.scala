package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnsNumber extends StObject {
  
  var columns: Double
}
object ColumnsNumber {
  
  @scala.inline
  def apply(columns: Double): ColumnsNumber = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsNumber]
  }
  
  @scala.inline
  implicit class ColumnsNumberMutableBuilder[Self <: ColumnsNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
  }
}
