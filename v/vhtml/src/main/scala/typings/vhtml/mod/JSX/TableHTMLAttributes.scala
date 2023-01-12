package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var cellpadding: js.UndefOr[Double | String] = js.undefined
  
  var cellspacing: js.UndefOr[Double | String] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object TableHTMLAttributes {
  
  inline def apply(): TableHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setCellpadding(value: Double | String): Self = StObject.set(x, "cellpadding", value.asInstanceOf[js.Any])
    
    inline def setCellpaddingUndefined: Self = StObject.set(x, "cellpadding", js.undefined)
    
    inline def setCellspacing(value: Double | String): Self = StObject.set(x, "cellspacing", value.asInstanceOf[js.Any])
    
    inline def setCellspacingUndefined: Self = StObject.set(x, "cellspacing", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
