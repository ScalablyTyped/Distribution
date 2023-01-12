package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sheet2HTMLOpts extends StObject {
  
  /** Add contenteditable to every cell */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /** Footer HTML */
  var footer: js.UndefOr[String] = js.undefined
  
  /** Header HTML */
  var header: js.UndefOr[String] = js.undefined
  
  /** TABLE element id attribute */
  var id: js.UndefOr[String] = js.undefined
}
object Sheet2HTMLOpts {
  
  inline def apply(): Sheet2HTMLOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet2HTMLOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sheet2HTMLOpts] (val x: Self) extends AnyVal {
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
