package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var cellpadding: js.UndefOr[Numberish] = js.undefined
  
  var cellspacing: js.UndefOr[Numberish] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
}
object TableHTMLAttributes {
  
  inline def apply(): TableHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHTMLAttributes]
  }
  
  extension [Self <: TableHTMLAttributes](x: Self) {
    
    inline def setCellpadding(value: Numberish): Self = StObject.set(x, "cellpadding", value.asInstanceOf[js.Any])
    
    inline def setCellpaddingUndefined: Self = StObject.set(x, "cellpadding", js.undefined)
    
    inline def setCellspacing(value: Numberish): Self = StObject.set(x, "cellspacing", value.asInstanceOf[js.Any])
    
    inline def setCellspacingUndefined: Self = StObject.set(x, "cellspacing", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
